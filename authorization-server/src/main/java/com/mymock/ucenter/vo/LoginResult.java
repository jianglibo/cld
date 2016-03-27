package com.mymock.ucenter.vo;

import com.mymock.ucenter.controller.LoginController.AuthenticationStatus;
import com.mymock.ucenter.controller.LoginController.LoginResultMessage;

/**
 * 这个类包含了与客户端交互的大部分信息。
 * 
 * @author jianglibo
 *
 * 2015年6月6日-上午9:23:11
 */
public class LoginResult {
    private AuthenticationStatus state = AuthenticationStatus.ANONYMOUS;

    private LoginResultMessage message = LoginResultMessage.NO_MESSAGE;

    private PersonVo user;

    private String wtg;

    private boolean showCaptcha;

    public LoginResult() {
        this.setState(AuthenticationStatus.ANONYMOUS);
    }

    public LoginResult(AuthenticationStatus state) {
        this.setState(state);
    }

    public LoginResult(LoginResultMessage message) {
        this.setState(AuthenticationStatus.ANONYMOUS);
        this.setMessage(message);
    }

    public PersonVo getUser() {
        return user;
    }

    public void setUser(PersonVo user) {
        this.user = user;
    }

    public LoginResultMessage getMessage() {
        return message;
    }

    public void setMessage(LoginResultMessage message) {
        this.message = message;
    }

    public String getWtg() {
        return wtg;
    }

    public LoginResult setWtg(String wtg) {
        this.wtg = wtg;
        return this;
    }

    public AuthenticationStatus getState() {
        return state;
    }

    public void setState(AuthenticationStatus state) {
        this.state = state;
    }

    public boolean isShowCaptcha() {
        return showCaptcha;
    }

    public void setShowCaptcha(boolean showCaptcha) {
        this.showCaptcha = showCaptcha;
    }

}
