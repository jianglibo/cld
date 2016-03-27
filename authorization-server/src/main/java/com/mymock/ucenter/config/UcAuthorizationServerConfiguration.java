package com.mymock.ucenter.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.builders.InMemoryClientDetailsServiceBuilder;
import org.springframework.security.oauth2.config.annotation.builders.ClientDetailsServiceBuilder.ClientBuilder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.approval.UserApprovalHandler;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * http://tools.ietf.org/html/draft-ietf-oauth-v2-31#section-1.3
 * 
 * @author jianglibo@gmail.com
 *
 */
@Configuration
@EnableAuthorizationServer
public class UcAuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

    private static Logger logger = LoggerFactory.getLogger(UcAuthorizationServerConfiguration.class);

//    @Autowired
//    private TokenStore tokenStore;

    @Autowired
    private UserApprovalHandler userApprovalHandler;

    @Autowired
    private AppMiscConfigUc appMisc;

    @Autowired
    private Environment env;

    @Autowired
    @Qualifier("authenticationManagerBean")
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

        // @formatter:off
        InMemoryClientDetailsServiceBuilder cdsc = clients.inMemory();
        
        /*
        cdsc.withClient("tonr")
                    .resourceIds(SPARKLR_RESOURCE_ID)
                    .authorizedGrantTypes("authorization_code", "implicit")
                    .authorities("ROLE_CLIENT")
                    .scopes("read", "write")
                    .secret("secret")
                .and()
                .withClient("tonr-with-redirect")
                    .resourceIds(SPARKLR_RESOURCE_ID)
                    .authorizedGrantTypes("authorization_code", "implicit")
                    .authorities("ROLE_CLIENT")
                    .scopes("read", "write")
                    .secret("secret")
                    .redirectUris(tonrRedirectUri)
                .and()
                .withClient("my-client-with-registered-redirect")
                    .resourceIds(SPARKLR_RESOURCE_ID)
                    .authorizedGrantTypes("authorization_code", "client_credentials")
                    .authorities("ROLE_CLIENT")
                    .scopes("read", "trust")
                    .redirectUris("http://anywhere?key=value")
                .and()
                .withClient("my-trusted-client")
                    .authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit")
                    .authorities("ROLE_CLIENT", "ROLE_TRUSTED_CLIENT")
                    .scopes("read", "write", "trust")
                    .accessTokenValiditySeconds(60)
                .and()
                .withClient("my-trusted-client-with-secret")
                    .authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit")
                    .authorities("ROLE_CLIENT", "ROLE_TRUSTED_CLIENT")
                    .scopes("read", "write", "trust")
                    .secret("somesecret")
                .and()
                .withClient("my-less-trusted-client")
                    .authorizedGrantTypes("authorization_code", "implicit")
                    .authorities("ROLE_CLIENT")
                    .scopes("read", "write", "trust");
        */
        logger.info("current active profile is: {}", env.getProperty("spring.profiles.active"));
        logger.info("current thymeleaf template root is: {}", env.getProperty("spring.thymeleaf.prefix"));
        
        appMisc.getOauthClients().forEach(c -> {
            ClientBuilder cb = cdsc.withClient(c.getClient())
                    .authorizedGrantTypes(c.getAuthorizedGrantTypes())
                    .authorities(c.getAuthorities())
                    .scopes(c.getScopes());

            if (c.getSecret() != null && !c.getSecret().trim().isEmpty()) {
                cb.secret(c.getSecret());
            }
            
            if (c.getAccessTokenValiditySeconds() > 0) {
                cb.accessTokenValiditySeconds(c.getAccessTokenValiditySeconds());
            }
            
            if (c.getRedirectUris() != null && c.getRedirectUris().length > 0) {
                cb.redirectUris(c.getRedirectUris());
            }
            
            if (c.isApplyAutoApprove()) {
                cb.autoApprove(c.isAutoApprove());
            }
        });
        
//        if (!appMisc.isNoneDemoData()) {
//            cdsc.withClient("my-password-client")
//                    .authorizedGrantTypes("password")
//                    .authorities("ROLE_CLIENT", "ROLE_TRUSTED_CLIENT")
//                    .scopes("read", "write", "trust")
//                    .secret("secret")
//                    .accessTokenValiditySeconds(60);
//
//            
//            
//            cdsc.withClient("tclient")
//            	.authorizedGrantTypes("implicit")
//            	.authorities("ROLE_CLIENT")
//            	.scopes("read", "write", "openid" )
//            	.redirectUris("/oauthconsole", "http://localhost:8081/uccallback")
//            	.autoApprove(true);
//
//             cdsc.withClient("oac")
//             	.authorizedGrantTypes("authorization_code")
//                .authorities("ROLE_CLIENT")
//                .scopes("openid")
//                .secret("asecret")
//                .autoApprove(true);
//             
//             cdsc.withClient("oacrest")
//                 .authorizedGrantTypes("authorization_code")
//                 .authorities("ROLE_CLIENT")
//                 .scopes("openid")
//                 .secret("asecret")
//                 .autoApprove(true);
//        }
        // @formatter:on
    }
    
    @Bean
    public TokenStore tokenStore() {
        return new InMemoryTokenStore();
    };

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(tokenStore()).userApprovalHandler(userApprovalHandler).authenticationManager(authenticationManager);
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
        oauthServer.realm("sparklr2/client");
    }

}
