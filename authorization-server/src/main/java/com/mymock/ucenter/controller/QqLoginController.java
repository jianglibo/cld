package com.mymock.ucenter.controller;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import com.mymock.ucenter.config.AppMiscConfigUc;
import com.mymock.ucenter.config.userdetail.PersonManager;
import com.mymock.ucenter.domain.Person;
import com.mymock.ucenter.domain.ThirdPartLogin;
import com.mymock.ucenter.domain.ThirdPartLogin.Provider;
import com.mymock.ucenter.repository.PersonRepository;
import com.mymock.ucenter.repository.ThirdPartLoginRepository;
import com.mymock.ucenter.utils.PersonVoBuilder;
import com.mymock.ucenter.utils.UcSecurityUtil;
import com.mymock.ucenter.vo.PersonVo;
import com.mymock.ucenter.vo.QqUser;
import com.mymock.ucenter.vo.QqUser.QqData;

@Controller
public class QqLoginController {

    public static final String QQ_TOKEN_ENDPOINT = "https://graph.qq.com/oauth2.0/token?"; // ?grant_type=authorization_code&client_id=101224146&code=%s&client_secret=b7b31c8c3632f6b38c1ae16aaec11ae2&

    private static final String BEFORE_BIND_QQ_USER_SESSION_KEY = "_BEFORE_BIND_QQ_USER_SESSION_KEY";

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private ThirdPartLoginRepository thirdplRepo;
    
    @Autowired
    private AppMiscConfigUc config;

    @Autowired
    private PersonManager personManager;

    @Autowired
    private PersonRepository personRepo;

    @Autowired
    @Qualifier("ignoreMissingFieldOm")
    private ObjectMapper ignoreMissingFieldOm;

    @Autowired
    private UcSecurityUtil ucSecurityUtil;

    @Autowired
    private ControllerUtil cutil;

    @RequestMapping(value = "/login/qqcallback", method = RequestMethod.GET)
    public String qqcallback(@RequestParam("code") String code, @RequestParam("state") String state, Model model, HttpServletRequest request)
            throws ClientProtocolException, IOException {
        String oaresult = Request.Get(createTokenUrl(code)).execute().returnContent().asString();
        // access_token=28B6E1965950ADC509AF63A2BBDC9685&expires_in=7776000&refresh_token=A2645CC020524A93B69A87A9140B5377
        String access_token = null;
        String[] ss = oaresult.split("&");
        for (String s : ss) {
            if (s.startsWith("access_token=")) {
                access_token = s.split("=")[1];
            }
        }
        model.addAttribute("access_token", access_token);
        return "qqcallback";
    }

    @RequestMapping(value = "/login/queryemail", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> queryForEmail(@RequestParam("email") String email) {
        Map<String, Object> result = Maps.newHashMap();
        if (personRepo.findByEmail(email) == null) {
            result.put("exist", false);
        } else {
            result.put("exist", true);
        }
        return result;
    }

    public static class BindResult {
        private BindResultMessage message;
        private String wtg;

        public BindResult(BindResultMessage message) {
            this.message = message;
        }

        public BindResult(BindResultMessage message, String wtg) {
            this.message = message;
            this.wtg = wtg;
        }

        public BindResult() {
        }

        public BindResultMessage getMessage() {
            return message;
        }

        public void setMessage(BindResultMessage message) {
            this.message = message;
        }

        public String getWtg() {
            return wtg;
        }

        public void setWtg(String wtg) {
            this.wtg = wtg;
        }
    }

    public static enum BindResultMessage {
        SUCCESS, BIND_NEW_EXIST, BIND_OLD_NOT_EXIST, BIND_OLD_PWD_NOT_MATCH, ALREADY_BIND_TO_OTHER
    }

    @RequestMapping(value = "/login/bind", method = RequestMethod.POST)
    @ResponseBody
    public BindResult bind(@RequestBody BindData bindData, HttpServletRequest request, HttpServletResponse response) {

        QqUser qqUser = (QqUser) request.getSession().getAttribute(BEFORE_BIND_QQ_USER_SESSION_KEY);

        ThirdPartLogin thpl = thirdplRepo.findByProviderAndOpenId(Provider.QQ, qqUser.getQqData().getOpenId());

        if (thpl != null) {
            return new BindResult(BindResultMessage.ALREADY_BIND_TO_OTHER);
        }

        BindResult br = new BindResult();

        Person p = null;

        if (bindData.isNewBind()) {
            p = personRepo.findByEmail(bindData.getEmail());
            if (p != null) {
                br.setMessage(BindResultMessage.BIND_NEW_EXIST);
            } else {
                p = bindNew(qqUser, bindData);
                br.setMessage(BindResultMessage.SUCCESS);
            }
        } else {
            p = personRepo.findByEmail(bindData.getEmail());
            if (p == null) {
                br.setMessage(BindResultMessage.BIND_OLD_NOT_EXIST);
            } else {
                try {
                    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(p.getName(), bindData.getPassword()));
                    bindOld(p, qqUser);
                    br.setMessage(BindResultMessage.SUCCESS);
                } catch (AuthenticationException e) {
                    br.setMessage(BindResultMessage.BIND_OLD_PWD_NOT_MATCH);
                }
            }
        }

        if (br.getMessage() == BindResultMessage.SUCCESS) {
            br.setWtg(cutil.getWtg(request, response));
            ucSecurityUtil.doLogin(p);
        }
        return br;
    }

    private void bindOld(Person oldp, QqUser qqUser) {
        ThirdPartLogin thirdpl = thirdplRepo.findByProviderAndOpenId(Provider.QQ, qqUser.getQqData().getOpenId());
        if (thirdpl == null) {
            thirdpl = new ThirdPartLogin();
            thirdpl.setOpenId(qqUser.getQqData().getOpenId());
            thirdpl.setProvider(Provider.QQ);
            thirdpl.setReadableId(qqUser.getNickname());
            thirdpl.setPerson(oldp);
            thirdplRepo.save(thirdpl);
        } else {
            thirdpl.setPerson(oldp);
            thirdplRepo.save(thirdpl);
        }
        oldp.getThirdConns().add(thirdpl);
        ucSecurityUtil.doLogin(oldp);
    }

    private Person bindNew(QqUser qqUser, BindData bindData) {
        Person person = createNewPerson(bindData, qqUser);
        ThirdPartLogin thirdpl = new ThirdPartLogin();
        thirdpl.setOpenId(qqUser.getQqData().getOpenId());
        thirdpl.setProvider(Provider.QQ);
        thirdpl.setPerson(person);
        thirdpl.setReadableId(qqUser.getNickname());
        thirdpl = thirdplRepo.save(thirdpl);
        person.getThirdConns().add(thirdpl);
        return person;
    }

    private Person createNewPerson(BindData bindData, QqUser qqUser) {
        try {
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            //@formatter:off
            PersonVo pvo = new PersonVoBuilder()
                .displayName(bindData.getNickname())
                .name(uuid)
                .email(bindData.getEmail())
                .password(bindData.getPassword())
                .avatar(qqUser.getFigureurl())
                .authorizes("ROLE_USER").build();
          //@formatter:on
            personManager.createUser(pvo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personRepo.findByEmail(bindData.getEmail());
    }

    /**
     * 如果呼叫这个方法的时候，用户已经登陆，那么可以认为是一种绑定已有账号的行为。
     * 这里有可能存在几种情况：
     * 1、这个qq登陆已经绑定了其它用户
     * 2、这个qq还没有绑定其他用户
     * 3、这个qq已经绑定了这个用户。
     * 
     * @param access_token
     * @param oauth_consumer_key
     * @param openid
     * @param model
     * @param request
     * @param response
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    @RequestMapping(value = "/login/qquserinfo", method = RequestMethod.GET)
    @ResponseBody
    public QqLoginResult qquserinfo(@RequestParam("access_token") String access_token, @RequestParam("oauth_consumer_key") String oauth_consumer_key,
            @RequestParam("openid") String openid, Model model, HttpServletRequest request, HttpServletResponse response)
                    throws ClientProtocolException, IOException {

        ThirdPartLogin thirdpl = thirdplRepo.findByProviderAndOpenId(Provider.QQ, openid);

        PersonVo pvo = ucSecurityUtil.principle();
        Person person = null;

        if (thirdpl == null) { // 第三方登陆没有绑定过
            QqUser qqUser = obtainQqDetails(openid, access_token, oauth_consumer_key);
            request.getSession().setAttribute(BEFORE_BIND_QQ_USER_SESSION_KEY, qqUser);
            if (pvo != null) { // 用户已经登陆，此时自动绑定
                person = personRepo.findByEmail(pvo.getEmail());
                if (person.getThirdConns().stream().anyMatch(t -> (Provider.QQ == t.getProvider()) && openid.equals(t.getOpenId()))) {
                    return new QqLoginResult(QqLoginResultMessage.ONLY_ONE_BIND_ALLOWED, qqUser);
                }
                bindOld(person, qqUser);
                return new QqLoginResult(QqLoginResultMessage.SUCCESS, qqUser, person);
            } else {
                return new QqLoginResult(QqLoginResultMessage.BEFORE_BIND, qqUser);
            }
        } else {
            person = personRepo.findByThirdPartLoginId(thirdpl);
            if (person == null) { // 正常流程下，不会出现这种情况
                thirdplRepo.delete(thirdpl);
                return new QqLoginResult(QqLoginResultMessage.FAILURE);
            } else {
                if (pvo == null) { // 没有登陆
                    ucSecurityUtil.doLogin(person);
                    QqLoginResult qlr = new QqLoginResult(QqLoginResultMessage.SUCCESS, person);
                    qlr.setWtg(cutil.getWtg(request, response));
                    return qlr;
                } else { // 已经登陆
                    if (person.getId() == pvo.getId()) { // 同一个用户再次登陆，do nothing
                        return new QqLoginResult(QqLoginResultMessage.ALREADY_LOGIN, person);
                    } else { // 用户已经登陆，但是用其它qq再次登陆。提醒用户已经登陆
                        return new QqLoginResult(QqLoginResultMessage.ALREADY_BIND_TO_OTHERS, person);
                    }
                }
            }
        }
    }

    private QqUser obtainQqDetails(String openid, String access_token, String oauth_consumer_key) throws JsonParseException, JsonMappingException, IOException {
        // https://graph.qq.com/user/get_user_info?access_token=" + access_token + "&oauth_consumer_key=" + oo.client_id + "&openid=" + oo.openid;
        String url = "https://graph.qq.com/user/get_user_info?access_token=" + access_token + "&oauth_consumer_key=" + oauth_consumer_key + "&openid=" + openid;
        String userInfo = Request.Get(url).execute().returnContent().asString();

        QqData qqData = new QqData();
        qqData.setOpenId(openid);
        qqData.setAccessToken(access_token);
        qqData.setOauthConsumerKey(oauth_consumer_key);

        QqUser qqUser = ignoreMissingFieldOm.readValue(userInfo, QqUser.class);

        qqUser.setQqData(qqData);
        return qqUser;
    }

    // private String extractWtg(HttpServletRequest request) {
    // String wtg = (String) request.getSession().getAttribute(LoginController.LOGIN_CALLBACK_SESSION_KEY);
    // request.getSession().removeAttribute(LoginController.LOGIN_CALLBACK_SESSION_KEY);
    // return wtg;
    // }

    private String createTokenUrl(String code) {
        //@formatter:off
        StringBuilder sb = new StringBuilder(QQ_TOKEN_ENDPOINT)
            .append("grant_type=authorization_code&")
            .append("client_id=")
            .append(config.getQqAppId())
            .append("&code=").append(code).append("&")
            .append("client_secret=")
            .append(config.getQqAppSecret())
            .append("&redirect_uri=http%3A%2F%2Flogin.openscanner.cc%2Flogin%2Fqqcallback");
      //@formatter:on
        return sb.toString();
    }

    // grant_type 必须 授权类型，在本步骤中，此值为“authorization_code”。
    // client_id 必须 申请QQ登录成功后，分配给网站的appid。
    // client_secret 必须 申请QQ登录成功后，分配给网站的appkey。
    // code 必须 上一步返回的authorization code。
    // 如果用户成功登录并授权，则会跳转到指定的回调地址，并在URL中带上Authorization Code。
    // 例如，回调地址为www.qq.com/my.php，则跳转到：
    // http://www.qq.com/my.php?code=520DD95263C1CFEA087******
    // 注意此code会在10分钟内过期。
    // redirect_uri 必须 与上面一步中传入的redirect_uri保持一致。

    public static class BindData {

        private boolean newBind;

        private String nickname;
        private String email;
        private String password;

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

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

        public boolean isNewBind() {
            return newBind;
        }

        public void setNewBind(boolean newBind) {
            this.newBind = newBind;
        }
    }

    public static enum QqLoginResultMessage {
        BEFORE_BIND, SUCCESS, FAILURE, BIND_SUCCESS, GOTO_BIND_EXIST, ALREADY_LOGIN, ALREADY_BIND_TO_OTHERS, ONLY_ONE_BIND_ALLOWED
    }

    public static class QqLoginResult {

        private QqLoginResultMessage message;
        
        private Provider provider = Provider.QQ;

        private QqUser qqUser;

        private PersonVo user;

        private String wtg;

        public QqLoginResult() {
        }

        public QqLoginResult(QqLoginResultMessage message) {
            this(message, null, null);
        }

        public QqLoginResult(QqLoginResultMessage message, QqUser qqUser) {
            this(message, qqUser, null);
        }

        public QqLoginResult(QqLoginResultMessage message, Person person) {
            this(message, null, person);
        }

        public QqLoginResult(QqLoginResultMessage message, QqUser qqUser, Person person) {
            this.message = message;
            if (person != null) {
                this.user = new PersonVo(person);
            }
            this.qqUser = qqUser;
        }

        public QqLoginResultMessage getMessage() {
            return message;
        }

        public void setMessage(QqLoginResultMessage message) {
            this.message = message;
        }

        public QqUser getQqUser() {
            return qqUser;
        }

        public void setQqUser(QqUser qqUser) {
            this.qqUser = qqUser;
        }

        public PersonVo getUser() {
            return user;
        }

        public void setUser(PersonVo user) {
            this.user = user;
        }

        public String getWtg() {
            return wtg;
        }

        public void setWtg(String wtg) {
            this.wtg = wtg;
        }

        public Provider getProvider() {
            return provider;
        }

        public void setProvider(Provider provider) {
            this.provider = provider;
        }
    }
}
