package com.mymock.ucenter.vo;

import java.io.Serializable;

public class QqUser implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int ret;
    private String nickname;
    private String gender;
    private String figureurl;

    private String redirectURL;

    public String getRedirectURL() {
        return redirectURL;
    }

    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
    }

    private QqData qqData;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFigureurl() {
        return figureurl;
    }

    public void setFigureurl(String figureurl) {
        this.figureurl = figureurl;
    }

    public QqData getQqData() {
        return qqData;
    }

    public void setQqData(QqData qqData) {
        this.qqData = qqData;
    }

    public static class QqData implements Serializable {

        /**
         * 
         */
        private static final long serialVersionUID = 1L;
        private String openId;
        private String accessToken;
        private String oauthConsumerKey;

        public String getOpenId() {
            return openId;
        }

        public void setOpenId(String openId) {
            this.openId = openId;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public String getOauthConsumerKey() {
            return oauthConsumerKey;
        }

        public void setOauthConsumerKey(String oauthConsumerKey) {
            this.oauthConsumerKey = oauthConsumerKey;
        }
    }
}
