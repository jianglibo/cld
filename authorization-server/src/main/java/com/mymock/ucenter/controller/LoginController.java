package com.mymock.ucenter.controller;

import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.common.exceptions.BadClientCredentialsException;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.security.web.authentication.session.ChangeSessionIdAuthenticationStrategy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.mymock.ucenter.config.AppMiscConfigUc;
import com.mymock.ucenter.config.userdetail.PersonManager;
import com.mymock.ucenter.domain.LoginAttempt;
import com.mymock.ucenter.domain.Person;
import com.mymock.ucenter.domain.ThirdPartLogin;
import com.mymock.ucenter.domain.UcToken;
import com.mymock.ucenter.domain.ThirdPartLogin.Provider;
import com.mymock.ucenter.domain.UcToken.UcTokenFor;
import com.mymock.ucenter.notifier.PasswordRecoverTemplate;
import com.mymock.ucenter.notifier.SendCloudService;
import com.mymock.ucenter.notifier.SendCloudTemplate;
import com.mymock.ucenter.repository.LoginAttemptRepository;
import com.mymock.ucenter.repository.PersonRepository;
import com.mymock.ucenter.repository.ThirdPartLoginRepository;
import com.mymock.ucenter.repository.UcTokenRepository;
import com.mymock.ucenter.utils.UcSecurityUtil;
import com.mymock.ucenter.vo.LoginAttemptVo;
import com.mymock.ucenter.vo.LoginResult;
import com.mymock.ucenter.vo.PersonVo;

/**
 * 
 * @author jianglibo
 *
 */
@Controller
public class LoginController {

    public static enum LoginResultMessage {
        WRONG_JSON_MESSAGE, USERNAME_PASSWORD_NOT_MATCH, UNKNOWN, WRONG_CAPTCHA, NO_MESSAGE, QQ_CALLBACK_ERROR, THIRD_PART_FIRST_QQ,EMAIL_NOT_VERIFIED
    }

    public static enum AuthenticationStatus {
        ANONYMOUS, REMEMBER_ME, FULL
    }

    public static String LOGIN_TEMPLATE_NAME = "index";

    private AuthenticationTrustResolver trustResolver = new AuthenticationTrustResolverImpl();

    @Autowired
    private ChangeSessionIdAuthenticationStrategy sessionAuthenticationStrategy;

    public static String LOGIN_ATTEMTPT_REQUEST_KEY = "__LOGIN_ATTEMTPT_REQUEST_KEY";

    public static String RETRY_TIMES_SESSION_KEY = "__RETRY_TIMES_SESSION_KEY";

    public static String LOGIN_CALLBACK_SESSION_KEY = "__LOGIN_CALLBACK_SESSION_KEY";

    public static int MAX_RETRY_BEFORE_SHOW_CAPTCHA = 3;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private UcSecurityUtil ucSecurityUtil;
    
    @Autowired
    private UcTokenRepository ucTokenRepo;

    @Autowired
    private ControllerUtil cutil;
    
    @Autowired
    private PersonManager personManager;

    @Autowired
    private SendCloudService scs;

    @Autowired
    private LoginAttemptRepository larepo;

    @Autowired
    private ThirdPartLoginRepository thirdplRepo;

    @Autowired
    private PersonRepository personRepo;

    @Autowired
    private AppMiscConfigUc appConfig;

    @Autowired
    private AuthenticationManager am;

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public LoginResult handleIOException(Exception ex, HttpServletRequest request) {
        LoginAttempt lat = (LoginAttempt) request.getAttribute(LOGIN_ATTEMTPT_REQUEST_KEY);

        LoginResult lr = new LoginResult();
        if (getAndIncreament(request, 1) > MAX_RETRY_BEFORE_SHOW_CAPTCHA) {
            lr.setShowCaptcha(true);
        }

        if (lat != null) {
            larepo.save(lat);
            request.removeAttribute(LOGIN_ATTEMTPT_REQUEST_KEY);
        }
        if (ex instanceof HttpMessageNotReadableException) {
            logger.error(ex.getMessage());
            lr.setMessage(LoginResultMessage.WRONG_JSON_MESSAGE);
        } else if (ex instanceof BadClientCredentialsException) {
            lr.setMessage(LoginResultMessage.USERNAME_PASSWORD_NOT_MATCH);
        } else {
            logger.error(ex.getMessage());
            lr.setMessage(LoginResultMessage.UNKNOWN);
        }
        return lr;
    }

    @RequestMapping(value = "/login/recover", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> passwordRecover(@RequestBody Map<String, String> map) {
        Map<String, String> result = Maps.newHashMap();
        String email = map.get("email");
        String rd = map.get("rd");
        
        Person p = personRepo.findByEmail(email);

        if (p == null) {
            result.put("message", "EMAIL_NOT_EXIST");
        } else {
            UcToken uctk = new UcToken(UcTokenFor.PASSWORD_RECOVER, email, ChronoUnit.DAYS, 1);
            ucTokenRepo.save(uctk);
            SendCloudTemplate sct;
            try {
                sct = new PasswordRecoverTemplate(uctk, appConfig.getAppHost(), rd).withTos(email);
                boolean sendResult = scs.sendEmail(sct);
                if (sendResult) {
                    result.put("message", "SUCCESS");
                } else {
                    result.put("message", "SEND_MAIL_FAILURE");
                }
            } catch (IOException e) {
                result.put("message", "SEND_MAIL_FAILURE");
            }
        }
        return result;
    }
    
    @RequestMapping(value = "/login/debind", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @Secured("ROLE_USER")
    public Map<String, String> debind(@RequestBody Map<String, String> map) {
        Map<String, String> result = Maps.newHashMap();
        String provider = map.get("provider");
        String openId = map.get("openId");
        try {
            ThirdPartLogin thpl = thirdplRepo.findByProviderAndOpenId(Provider.valueOf(provider), openId);
            if (thpl == null) {
                result.put("message", "MISSING_RESOURCE");
            } else {
                Person p = thpl.getPerson();
                PersonVo pvo = ucSecurityUtil.principle();
                
                if (pvo == null || pvo.getId() != p.getId()) {
                    result.put("message", "ACCESS_DENY");
                } else {
                    p.getThirdConns().remove(thpl);
                    thpl.setPerson(null);
                    thirdplRepo.delete(thpl);
                    ucSecurityUtil.doLogin(p);
                    result.put("message", "SUCCESS");
                }
            }
        } catch (Exception e) {
            result.put("message", "provider_and_openId_required");
        }
        return result;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public LoginResult login(@RequestBody LoginAttemptVo loginAttemptVo, HttpServletRequest request, HttpServletResponse response) {

        if (!isCaptchaRight(request, loginAttemptVo)) {
            LoginResult lr = new LoginResult(LoginResultMessage.WRONG_CAPTCHA);
            lr.setShowCaptcha(true);
            return lr;
        }
        
        PersonVo user = personManager.loadUserByUsername(loginAttemptVo.getUsername());
        
        if (!user.isEmailVerified()) {
            return new LoginResult(LoginResultMessage.EMAIL_NOT_VERIFIED);
        }

        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(loginAttemptVo.getUsername(), loginAttemptVo.getPassword());
        WebAuthenticationDetails wd = new WebAuthenticationDetailsSource().buildDetails(request);
        authRequest.setDetails(wd);
        request.setAttribute(LOGIN_ATTEMTPT_REQUEST_KEY, new LoginAttempt(loginAttemptVo, wd.getRemoteAddress(), wd.getSessionId()));

        Authentication an = am.authenticate(authRequest);

        user = (PersonVo) an.getPrincipal();

        SecurityContextHolder.getContext().setAuthentication(an);

        cutil.recordLoginAttempt(user.getEmail(), Provider.NORMAL, wd.getRemoteAddress(), true);

        cutil.cleanupRequestAndSession(request, response);

        sessionAuthenticationStrategy.onAuthentication(an, request, response);
        LoginResult lr = new LoginResult();
        lr.setState(AuthenticationStatus.FULL);
        lr.setWtg(cutil.getWtg(request, response)); // 被拒绝访问的路径，认证之后再次访问。QQ认证之后也必须访问这个路径。
        lr.setUser(user);
        return lr;

    }

    private boolean isCaptchaRight(HttpServletRequest request, LoginAttemptVo lato) {
        int times = getAndIncreament(request, 0);
        if (times > MAX_RETRY_BEFORE_SHOW_CAPTCHA) {
            HttpSession session = request.getSession(true);
            if (session != null) {
                Object challange = session.getAttribute(CaptchaController.CHALLANGE_SESSION_KEY);
                return (challange != null) && challange.equals(lato.getCaptcha());
            }
            return false;
        }
        return true;
    }

    /**
     * 如果因为拒绝而来到这里，此时的Savedreqeust肯定有值，但是登陆之后，到达原来的目标地址，spring会自动清除这个savedRequest。
     * 保存在session里面才行。
     * 
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = { "/", "/login", "/signup" }, method = RequestMethod.GET)
    public String loginget(HttpServletRequest request, HttpServletResponse response, Model model) {
        String cburl = cutil.getWtg(request, response);
        if (cburl != null) {
            request.getSession(true).setAttribute(LOGIN_CALLBACK_SESSION_KEY, cburl);
        }
        // cutil.cleanupRequestAndSession(request, response);
        // String url = cutil.getWtg(request, response);
        // url = url.substring(url.lastIndexOf("http"));
        // url = url.substring(0,url.indexOf("&"));
        // request.setAttribute("redirectURL",url);
        return LOGIN_TEMPLATE_NAME;
    }

    @RequestMapping(value = { "/authenticated", "/gettoken", "/profile", "/changepwd" }, method = RequestMethod.GET)
    @Secured("ROLE_USER")
    public String loginget1() {
        return LOGIN_TEMPLATE_NAME;
    }

    @RequestMapping(value = "/login/state", method = RequestMethod.GET)
    @ResponseBody
    public LoginResult loginstatus(HttpServletRequest request, Model model) {
        Authentication an = SecurityContextHolder.getContext().getAuthentication();

        LoginResult lr = new LoginResult();
        if (an == null || trustResolver.isAnonymous(an)) {

        } else if (trustResolver.isRememberMe(an)) {
            lr.setState(AuthenticationStatus.REMEMBER_ME);
        } else {
            lr.setState(AuthenticationStatus.FULL);
        }

        if (AuthenticationStatus.ANONYMOUS != lr.getState()) {
            PersonVo prin = (PersonVo) an.getPrincipal();
            lr.setUser(prin);
        }

        if (getAndIncreament(request, 0) > MAX_RETRY_BEFORE_SHOW_CAPTCHA) {
            lr.setShowCaptcha(true);
        }
        return lr;
    }

    // http://login.openscanner.cc/login/qqcallback?#access_token=28B6E1965950ADC5168D68298BD6125C&expires_in=7776000
    // cookie:JSESSIONID=31E42463875D26BF8A564B371E708856; __qc_wId=378; pgv_pvid=2294196350; __qc__k=TC_MK=28B6E1965950ADC5168D68298BD6125C
    // https://graph.qq.com/user/get_user_info?access_token=28B6E1965950ADC5168D68298BD6125C&oauth_consumer_key=101224146&openid=4612DAAEFD3706CDC9C480CEB1069F73
    // @RequestMapping(value = "/login/qqcallback", method = RequestMethod.GET)
    // public String qqcallback(@RequestHeader("cookie") String cookie) {
    // return "qqcallback";
    // }

    @RequestMapping(value = "/me", method = RequestMethod.GET)
    @ResponseBody
    public PersonVo me() {
        return (PersonVo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    private int getAndIncreament(HttpServletRequest request, int step) {
        HttpSession session = request.getSession(true);
        int times = 0;
        if (session != null) {
            Object rt = session.getAttribute(RETRY_TIMES_SESSION_KEY);
            if (rt != null) {
                times = (int) rt;
            }
            if (step > 0) {
                times += step;
                session.setAttribute(RETRY_TIMES_SESSION_KEY, times);
            }
        }
        return times;
    }

    // ret : 0
    // msg :
    // is_lost : 0
    // nickname : 391772322
    // gender : 男
    // province : 浙江
    // city : 宁波
    // year : 1971
    // figureurl : http://qzapp.qlogo.cn/qzapp/100330589/F91451102E6D3AF1EA06066A6BDD2AEE/30
    // figureurl_1 : http://qzapp.qlogo.cn/qzapp/100330589/F91451102E6D3AF1EA06066A6BDD2AEE/50
    // figureurl_2 : http://qzapp.qlogo.cn/qzapp/100330589/F91451102E6D3AF1EA06066A6BDD2AEE/100
    // figureurl_qq_1 : http://q.qlogo.cn/qqapp/100330589/F91451102E6D3AF1EA06066A6BDD2AEE/40
    // figureurl_qq_2 : http://q.qlogo.cn/qqapp/100330589/F91451102E6D3AF1EA06066A6BDD2AEE/100
    // is_yellow_vip : 0
    // vip : 0
    // yellow_vip_level : 0
    // level : 0
    // is_yellow_year_vip : 0
}
