

package com.mymock.ucenter.utils;

/**
 * 
 * @author jianglibo@gmail.com
 * 2015年7月14日
 *
 */
public class RsClientConfigTbc {
    
    private String ucHost;
    private String ucTokenPath;
    private String ucCallbackUrl;
    private String rsAuthorizeUrl;
    private String rsClientId;
    private String ucClientId;
    private String rsCallbackUrl;
    private String ucClientSecret;
    
    /**
     * 
     * @param ucHost
     * @param ucTokenPath
     * @param ucCallbackUrl 必须和请求code时提供redirect_uri的一致.
     * @param rsCallbackUrl 资源服务器配置的callback，实际没有使用，但是必须和配置的值一致。
     * @param rsAuthorizeUrl 在资源服务器上，每个客户端都设定一个回调地址，虽然在我们的使用场景中，并没有用到这个值，但是根据oauth规范，还是需要提供。
     * @param rsClientId 相对于资源服务器的clientId，我们的app采用implicit方式，所以不需要secret。
     * @param ucClientId 用户中心的clientId
     * @param ucClientSecret 用户中心的client密码。
     */
    public RsClientConfigTbc(String ucHost, String ucTokenPath,
            String ucCallbackUrl,String rsCallbackUrl, String rsAuthorizeUrl,
            String rsClientId, String ucClientId, String ucClientSecret) {
        super();
        this.ucHost = ucHost;
        this.ucTokenPath = ucTokenPath;
        this.rsAuthorizeUrl = rsAuthorizeUrl;
        this.rsClientId = rsClientId;
        this.ucCallbackUrl = ucCallbackUrl;
        this.ucClientId = ucClientId;
        this.rsCallbackUrl = rsCallbackUrl;
        this.ucClientSecret = ucClientSecret;
    }


    public String getUcHost() {
        return ucHost;
    }

    public void setUcHost(String ucHost) {
        this.ucHost = ucHost;
    }

    public String getUcTokenPath() {
        return ucTokenPath;
    }

    public void setUcTokenPath(String ucTokenPath) {
        this.ucTokenPath = ucTokenPath;
    }

    public String getRsAuthorizeUrl() {
        return rsAuthorizeUrl;
    }

    public void setRsAuthorizeUrl(String rsAuthorizeUrl) {
        this.rsAuthorizeUrl = rsAuthorizeUrl;
    }

    public String getUcClientId() {
        return ucClientId;
    }


    public void setUcClientId(String ucClientId) {
        this.ucClientId = ucClientId;
    }


    public String getUcClientSecret() {
        return ucClientSecret;
    }


    public void setUcClientSecret(String ucClientSecret) {
        this.ucClientSecret = ucClientSecret;
    }


    public String getRsClientId() {
        return rsClientId;
    }


    public void setRsClientId(String rsClientId) {
        this.rsClientId = rsClientId;
    }


    public String getUcCallbackUrl() {
        return ucCallbackUrl;
    }


    public void setUcCallbackUrl(String ucCallbackUrl) {
        this.ucCallbackUrl = ucCallbackUrl;
    }


    public String getRsCallbackUrl() {
        return rsCallbackUrl;
    }


    public void setRsCallbackUrl(String rsCallbackUrl) {
        this.rsCallbackUrl = rsCallbackUrl;
    }
}
