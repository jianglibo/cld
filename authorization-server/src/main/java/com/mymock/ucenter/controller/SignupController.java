package com.mymock.ucenter.controller;

import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import com.mymock.ucenter.config.AppMiscConfigUc;
import com.mymock.ucenter.config.userdetail.PersonManager;
import com.mymock.ucenter.domain.Person;
import com.mymock.ucenter.domain.UcToken;
import com.mymock.ucenter.domain.Person.Gender;
import com.mymock.ucenter.domain.UcToken.UcTokenFor;
import com.mymock.ucenter.notifier.EmailVerifyTemplate;
import com.mymock.ucenter.notifier.SendCloudService;
import com.mymock.ucenter.notifier.SendCloudTemplate;
import com.mymock.ucenter.repository.PersonRepository;
import com.mymock.ucenter.repository.UcTokenRepository;
import com.mymock.ucenter.utils.MailServerResolver;
import com.mymock.ucenter.utils.PasswordPolicy;
import com.mymock.ucenter.utils.PersonVoBuilder;
import com.mymock.ucenter.utils.UcSecurityUtil;
import com.mymock.ucenter.utils.Validate;
import com.mymock.ucenter.utils.PasswordPolicy.PasswordViolationMessage;
import com.mymock.ucenter.vo.PersonVo;
import com.mymock.ucenter.vo.ThirdPartLoginAuthenticationToken;

/**
 * 
 * @author jianglibo@gmail.com, suncang
 *
 */
@Controller
public class SignupController {

    public static enum SignupControllerMessage {
        SUCCESS, DUPLICATED_EMAIL, DUPLICATED_USERNAME,//
        DUPLICATED_MOBILE, ILLEGAL_USERNAME, ILLEGAL_EMAIL,//
        ILLEGAL_MOBILE, SHORT_PWD, WRONG_CAPTCHA,//
        PASSWORD_STRATEGY_VIOLATE, USER_NOT_EXIST, SEND_VERIFY_MAIL_FAIL
    }

    public static enum ChangePwdControllerResult {
        SUCCESS, DIFF_NEWPWD, WRONG_OLDPWD, EXCEPTION_THROWN
    }
    
//    @Autowired
//    private ObjectMapper objectMapper;

    @Autowired
    private PersonRepository personRepo;

    @Autowired
    private UcSecurityUtil ucSecurityUtil;

    @Autowired
    private PersonManager personManager;

    @Autowired
    private UcTokenRepository ucTokenRepo;

    @Autowired
    private SendCloudService scs;

    @Autowired
    private AppMiscConfigUc appConfig;

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, String> handleIOException(Exception ex, HttpServletRequest request) {
        Map<String, String> result = Maps.newHashMap();
        result.put("message", "exception thrown:" + ex.getMessage());
        return result;
    }

    private boolean isCaptchaRight(HttpServletRequest request, SignupData signupData) {
        HttpSession session = request.getSession(true);
        if (session != null) {
            Object challange = session.getAttribute(CaptchaController.CHALLANGE_SESSION_KEY);
            boolean yes = (challange != null) && challange.equals(signupData.getCaptcha());
            return yes;
        }
        return false;
    }

    @RequestMapping(value = "/login/signup", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SignupResult signup(@RequestBody SignupData signupData, HttpServletRequest request, HttpServletResponse response) {

        if (!isCaptchaRight(request, signupData)) {
            return new SignupResult(SignupControllerMessage.WRONG_CAPTCHA, null);
        }
        // //验证用户名的合法性
        // if(!Validate.validateUsername(personVo.getUsername())){
        // return new SignupResult(SignupControllerMessage.ILLEGAL_USERNAME, null);
        // }
        // 验证邮箱的合法性
        if (!Validate.validateEmail(signupData.getEmail())) {
            return new SignupResult(SignupControllerMessage.ILLEGAL_EMAIL, null);
        }

        PasswordViolationMessage pvm = PasswordPolicy.validatePassword(signupData.getPassword());

        if (pvm != PasswordViolationMessage.YES) {
            return new SignupResult(pvm, null);
        }

        // if(personManager.userExists(personVo.getUsername(),"username")){
        // return new SignupResult(SignupControllerMessage.DUPLICATED_USERNAME, null);
        // }else

        if (personManager.userExists(signupData.getEmail(), "email")) {
            return new SignupResult(SignupControllerMessage.DUPLICATED_EMAIL, null);
        }
        // else if (personVo.getMobile() != null) {
        // // 验证手机号的合法性
        // if (!Validate.validateMobile(personVo.getMobile())) {
        // return new SignupResult(SignupControllerMessage.ILLEGAL_MOBILE, null);
        // }
        // if (personManager.userExists(personVo.getMobile(), "mobile")) {
        // return new SignupResult(SignupControllerMessage.DUPLICATED_MOBILE, null);
        // }
        // }
        PersonVo personVo = new PersonVoBuilder().email(signupData.getEmail()).password(signupData.getPassword()).displayName(signupData.getDisplayName())
                .authorizes("USER").build();
        personManager.createUser(personVo);
        return sendVerifyEmail(signupData);
    }

    @RequestMapping(value = "/login/resendverifyemail", method = RequestMethod.POST)
    @ResponseBody
    public SignupResult reVerifyEmail(@RequestBody Map<String, String> map) {
        String email = map.get("email");
        String rd = map.get("rd");
        SignupData sd = new SignupData();
        sd.setEmail(email);
        sd.setRd(rd);
        return sendVerifyEmail(sd);
    }

    private SignupResult sendVerifyEmail(SignupData signupData) {
        UcToken uctk = new UcToken(UcTokenFor.VERIFY_EMAIL, signupData.getEmail(), ChronoUnit.DAYS, 1);
        ucTokenRepo.save(uctk);
        SendCloudTemplate sct;
        try {
            sct = new EmailVerifyTemplate(uctk, appConfig.getAppHost(), signupData.getRd()).withTos(signupData.getEmail());
            boolean sendResult = scs.sendEmail(sct);
            if (!sendResult) {
                return new SignupResult(SignupControllerMessage.SEND_VERIFY_MAIL_FAIL, signupData.getEmail());
            }
        } catch (IOException e) {
            return new SignupResult(SignupControllerMessage.SEND_VERIFY_MAIL_FAIL, signupData.getEmail());
        }
        return new SignupResult(SignupControllerMessage.SUCCESS, signupData.getEmail());
    }

    @RequestMapping(value = "/login/profile", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
//    @PreAuthorize("#personVo.id == principal.id and principal.enabled")
    public SignupResult profile(@RequestBody Map<String, String> profile, HttpServletRequest request, HttpServletResponse response) {
        String avatar = profile.get("avatar");
        String gender = profile.get("gender");
        String displayName = profile.get("displayName");

        PersonVo pvo = (PersonVo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        
        Person p = personRepo.findByEmail(pvo.getEmail());

        if (p == null) {
            return new SignupResult(SignupControllerMessage.USER_NOT_EXIST, null);
        }

        p.setAvatar(avatar);
        p.setGender(Gender.valueOf(gender));
        p.setDisplayName(displayName);

        personRepo.save(p);
        
        PersonVo personVo = new PersonVo(p);
        personVo.eraseCredentials();
        ThirdPartLoginAuthenticationToken tpla = new ThirdPartLoginAuthenticationToken(personVo);
        tpla.setAuthenticated(true);
        SecurityContextHolder.getContext().setAuthentication(tpla);
        return new SignupResult(SignupControllerMessage.SUCCESS, pvo.getEmail());
    }

    @RequestMapping(value = "/login/changepwd", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @Secured("ROLE_USER")
    public Map<String, String> changepwd(@RequestBody ChangePwdVo changePwd, HttpServletRequest request, HttpServletResponse response) {
        Map<String, String> result = Maps.newHashMap();
        if (!changePwd.getNewpwd().equals(changePwd.getRenewpwd())) {
            result.put("message", ChangePwdControllerResult.DIFF_NEWPWD.toString());
        } else {
            try {
                personManager.changePassword(changePwd.getOldpwd(), changePwd.getNewpwd());
                result.put("message", ChangePwdControllerResult.SUCCESS.toString());
                ucSecurityUtil.clearLogin(request); 
            } catch (Exception e) {
                result.put("message", ChangePwdControllerResult.WRONG_OLDPWD.toString());
            }
        }
        return result;
    }

    public static class ChangePwdVo {

        private String oldpwd;
        private String newpwd;
        private String renewpwd;

        public String getRenewpwd() {
            return renewpwd;
        }

        public void setRenewpwd(String renewpwd) {
            this.renewpwd = renewpwd;
        }

        public String getOldpwd() {
            return oldpwd;
        }

        public void setOldpwd(String oldpwd) {
            this.oldpwd = oldpwd;
        }

        public String getNewpwd() {
            return newpwd;
        }

        public void setNewpwd(String newpwd) {
            this.newpwd = newpwd;
        }
    }

    public static class SignupResult {

        private String message;

        private String mailServer;

        public SignupResult(SignupControllerMessage message, String email) {
            this.setMessage(message.toString());
            this.setMailServer(MailServerResolver.resolve(email));
        }

        public SignupResult(PasswordViolationMessage message, String email) {
            this.setMessage(message.toString());
            this.setMailServer(MailServerResolver.resolve(email));
        }
        
        public SignupResult(String message, String email) {
            this.setMessage(message);
            this.setMailServer(MailServerResolver.resolve(email));
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getMailServer() {
            return mailServer;
        }

        public void setMailServer(String mailServer) {
            this.mailServer = mailServer;
        }

    }

    public static class SignupData {
        private String email;
        private String password;
        private String captcha;
        private String displayName;

        private String rd;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getCaptcha() {
            return captcha;
        }

        public void setCaptcha(String captcha) {
            this.captcha = captcha;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getRd() {
            return rd;
        }

        public void setRd(String rd) {
            this.rd = rd;
        }
    }

}
