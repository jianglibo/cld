package com.mymock.ucenter.config;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.web.MultipartProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mymock.ucenter.utils.IgnoreMissingFieldObjectMapperUc;

@Component
@ConfigurationProperties(prefix = "appmisc")
public class AppMiscConfigUc implements InitializingBean {
    
    private static Logger logger = LoggerFactory.getLogger(AppMiscConfigUc.class);

    private boolean bypasssecurity;

    private boolean formLogin;

    private MultipartCfg multipart;

    private String multipartLocation;

    private long multipartMaxFileSize;

    private long multipartMaxRequestSize;

    private long multipartFileSizeThreshold;
    
    private String qqAppId;
    
    private String qqAppSecret;
    
    private List<UcClient> oauthClients;
    
    private String loginEntryPoint;
    
    private String outSideBaseUrl;

    @JsonIgnore
    private Path uploadDestFolder;
    
    private boolean noneDemoData = false;
    
    private String appHost;
    
    private String version;

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(getAppHost(), "please add item 'app-host' below 'appmisc' in application.yaml");
        Assert.notNull(getOauthClients(), "please add item 'oauth-clients' below 'appmisc' in application.yaml");
        Assert.notNull(getLoginEntryPoint(), "please add item 'login-entry-point' below 'appmisc' in application.yaml");
        Assert.notNull(getOutSideBaseUrl(), "please add item 'out-side-base-url' below 'appmisc' in application.yaml");
        Assert.notNull(getOauthClients(), "please add item 'oauth-clients' below 'appmisc' in application.yaml");
        multipartLocation = multipart.getLocation();
        multipartFileSizeThreshold = parseSize(multipart.getFileSizeThreshold());
        multipartMaxFileSize = parseSize(multipart.getMaxFileSize());
        multipartMaxRequestSize = parseSize(multipart.getMaxRequestSize());

        if (getMultipartLocation() == null || getMultipartLocation().trim().isEmpty()) {
            uploadDestFolder = Paths.get(System.getProperty("java.io.tmpdir"));
        } else {
            uploadDestFolder = Paths.get(getMultipartLocation());
        }
        
        if (logger.isDebugEnabled()) {
            logger.debug("appmisc config is: {}", IgnoreMissingFieldObjectMapperUc.get().writeValueAsString(this));
        }
    }

    public List<UcClient> getOauthClients() {
        return oauthClients;
    }

    public void setOauthClients(List<UcClient> oauthClients) {
        this.oauthClients = oauthClients;
    }

    public String getMultipartLocation() {
        return multipartLocation;
    }

    public void setMultipartLocation(String multipartLocation) {
        this.multipartLocation = multipartLocation;
    }

    public long getMultipartMaxFileSize() {
        return multipartMaxFileSize;
    }

    public void setMultipartMaxFileSize(long multipartMaxFileSize) {
        this.multipartMaxFileSize = multipartMaxFileSize;
    }

    public long getMultipartMaxRequestSize() {
        return multipartMaxRequestSize;
    }

    public void setMultipartMaxRequestSize(long multipartMaxRequestSize) {
        this.multipartMaxRequestSize = multipartMaxRequestSize;
    }

    public long getMultipartFileSizeThreshold() {
        return multipartFileSizeThreshold;
    }

    public void setMultipartFileSizeThreshold(long multipartFileSizeThreshold) {
        this.multipartFileSizeThreshold = multipartFileSizeThreshold;
    }

    private long parseSize(String size) {
        size = size.toUpperCase();
        if (size.endsWith("KB")) {
            return Long.valueOf(size.substring(0, size.length() - 2)) * 1024;
        }
        if (size.endsWith("MB")) {
            return Long.valueOf(size.substring(0, size.length() - 2)) * 1024 * 1024;
        }
        if (size.endsWith("K")) {
            return Long.valueOf(size.substring(0, size.length() - 1)) * 1024;
        }

        if (size.endsWith("M")) {
            return Long.valueOf(size.substring(0, size.length() - 1)) * 1024 * 1024;
        }
        return Long.valueOf(size);
    }

    public boolean isBypasssecurity() {
        return bypasssecurity;
    }

    public void setBypasssecurity(boolean bypasssecurity) {
        this.bypasssecurity = bypasssecurity;
    }

    public boolean isFormLogin() {
        return formLogin;
    }

    public void setFormLogin(boolean formLogin) {
        this.formLogin = formLogin;
    }

    public MultipartCfg getMultipart() {
        return multipart;
    }

    public void setMultipart(MultipartCfg multipart) {
        this.multipart = multipart;
    }

    public Path getUploadDestFolder() {
        return uploadDestFolder;
    }

    public void setUploadDestFolder(Path uploadDestFolder) {
        this.uploadDestFolder = uploadDestFolder;
    }

	public boolean isNoneDemoData() {
		return noneDemoData;
	}

	public void setNoneDemoData(boolean noneDemoData) {
		this.noneDemoData = noneDemoData;
	}

	public String getAppHost() {
        return appHost;
    }

    public void setAppHost(String appHost) {
        this.appHost = appHost;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
    public String getLoginEntryPoint() {
        return loginEntryPoint;
    }

    public void setLoginEntryPoint(String loginEntryPoint) {
        this.loginEntryPoint = loginEntryPoint;
    }

    public String getOutSideBaseUrl() {
        return outSideBaseUrl;
    }

    public void setOutSideBaseUrl(String outSideBaseUrl) {
        this.outSideBaseUrl = outSideBaseUrl;
    }
    
    

    public String getQqAppId() {
        return qqAppId;
    }

    public void setQqAppId(String qqAppId) {
        this.qqAppId = qqAppId;
    }

    public String getQqAppSecret() {
        return qqAppSecret;
    }

    public void setQqAppSecret(String qqAppSecret) {
        this.qqAppSecret = qqAppSecret;
    }



    public static class UcClient {
        private String client;
        private String[] authorizedGrantTypes;
        private String[] authorities;
        private String[] scopes;
        private String secret;
        private int accessTokenValiditySeconds;
        
        private String[] redirectUris;
        
        private boolean applyAutoApprove;
        
        private boolean autoApprove;
        
        public String getClient() {
            return client;
        }
        public void setClient(String client) {
            this.client = client;
        }
        public String[] getAuthorizedGrantTypes() {
            return authorizedGrantTypes;
        }
        public void setAuthorizedGrantTypes(String[] authorizedGrantTypes) {
            this.authorizedGrantTypes = authorizedGrantTypes;
        }
        public String[] getAuthorities() {
            return authorities;
        }
        public void setAuthorities(String[] authorities) {
            this.authorities = authorities;
        }
        public String[] getScopes() {
            return scopes;
        }
        public void setScopes(String[] scopes) {
            this.scopes = scopes;
        }
        public String getSecret() {
            return secret;
        }
        public void setSecret(String secret) {
            this.secret = secret;
        }
        public int getAccessTokenValiditySeconds() {
            return accessTokenValiditySeconds;
        }
        public void setAccessTokenValiditySeconds(int accessTokenValiditySeconds) {
            this.accessTokenValiditySeconds = accessTokenValiditySeconds;
        }
        public String[] getRedirectUris() {
            return redirectUris;
        }
        public void setRedirectUris(String[] redirectUris) {
            this.redirectUris = redirectUris;
        }
        public boolean isAutoApprove() {
            return autoApprove;
        }
        public void setAutoApprove(boolean autoApprove) {
            this.autoApprove = autoApprove;
        }
        public boolean isApplyAutoApprove() {
            return applyAutoApprove;
        }
        public void setApplyAutoApprove(boolean applyAutoApprove) {
            this.applyAutoApprove = applyAutoApprove;
        }
        
    }

    /**
     * @see MultipartProperties copy from it.
     * @author jianglibo
     *
     *         2015年5月30日-下午6:30:26
     */
    public static class MultipartCfg {
        private String location;

        /**
         * Max file size. Values can use the suffixed "MB" or "KB" to indicate a Megabyte or
         * Kilobyte size.
         */
        private String maxFileSize = "1Mb";

        /**
         * Max request size. Values can use the suffixed "MB" or "KB" to indicate a Megabyte
         * or Kilobyte size.
         */
        private String maxRequestSize = "10Mb";

        /**
         * Threshold after which files will be written to disk. Values can use the suffixed
         * "MB" or "KB" to indicate a Megabyte or Kilobyte size.
         */
        private String fileSizeThreshold = "0";

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getMaxFileSize() {
            return maxFileSize;
        }

        public void setMaxFileSize(String maxFileSize) {
            this.maxFileSize = maxFileSize;
        }

        public String getMaxRequestSize() {
            return maxRequestSize;
        }

        public void setMaxRequestSize(String maxRequestSize) {
            this.maxRequestSize = maxRequestSize;
        }

        public String getFileSizeThreshold() {
            return fileSizeThreshold;
        }

        public void setFileSizeThreshold(String fileSizeThreshold) {
            this.fileSizeThreshold = fileSizeThreshold;
        }
        
        

    }
}
