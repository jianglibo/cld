package com.mymock.ucenter.config;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.approval.ApprovalStore;
import org.springframework.security.oauth2.provider.approval.TokenApprovalStore;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

import com.mymock.ucenter.oauth.SparklrUserApprovalHandler;

/**
 * 资料： OAuth2SecurityExpressionMethods
 * 在一个app里面可以有多个security配置，每个配置可以应用到不同的url中去。 这里继承自ResourceServerConfigurerAdapter, 
 * @author jianglibo@gmail.com
 *
 */
@Configuration
@EnableResourceServer
public class UcOAuth2ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    private static final String UC_RESOURCE_ID = "people";
    
    @Value("${spring.data.rest.base-uri}")
    private String apiPrefix;

    //这里可以对ResourceServerSecurityConfigurer进行配置
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId(UC_RESOURCE_ID).stateless(false);
        
        resources.expressionHandler(new UcOAuth2WebSecurityExpressionHandler());
    }
    /**
     * 如果对同样的路径作不同的access配置，后者获胜。
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {

        List<String> paths = Stream.of("/people","/people/**").map(p -> apiPrefix + p).collect(Collectors.toList());
        
        paths.add("/me");

        
        //copy from  ResourceServerSecurityConfigurer  
//		http
//			.authorizeRequests().expressionHandler(expressionHandler)
//		.and()
//			.addFilterBefore(resourcesServerFilter, AbstractPreAuthenticatedProcessingFilter.class)
//			.exceptionHandling()
//				.accessDeniedHandler(accessDeniedHandler)
//				.authenticationEntryPoint(authenticationEntryPoint);
		
        // @formatter:off
			http
//                .addFilter(new UcExceptionTranslationFilter())
				// Since we want the protected resources to be accessible in the UI as well we need 
				// session creation to be allowed (it's disabled by default in 2.0.6)
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
			.and()
				.requestMatchers().antMatchers(paths.toArray(new String[]{})) //这里列出的，会通过OAuth2AuthenticationProcessingFilter。
			.and()
				.authorizeRequests()
//					.antMatchers("/me").access("#oauth2.hasScope('read')")
//					.antMatchers(getPeopleUri("**")).access("hasRole('IMPOSSIBLE_USER')")
					.antMatchers("/me").access("#oauth2.isOAuth()")
					.antMatchers(getPeopleUri()).access("hasRole('ROLE_PERSON_MANAGER')") //not allow oauth access.#oauth2.hasScope('openid') or (!#oauth2.isOAuth() and
					.regexMatchers(getPeopleUri("\\d+")).access("hasRole('ROLE_PERSON_MANAGER') or (!#oauth2.isOAuth() and #uri.longValueAt(0) == principal.id)")
					.regexMatchers(HttpMethod.GET, getPeopleUri("\\d+")).access("hasRole('ROLE_PERSON_MANAGER') or (#uri.longValueAt(0) == principal.id)")
					.regexMatchers(getPeopleUri("\\d+/roles")).access("hasRole('ROLE_PERSON_MANAGER')");
			        
//					.antMatchers(apiPrefix + "/people/**").access("#oauth2.hasScope('openid') or (!#oauth2.isOAuth() and hasRole('ROLE_USER'))"); //允许oauth访问和登录影虎访问。更多的限制在methodSecurity里面限制。                                        
//					.antMatchers("/photos/trusted/**").access("#oauth2.hasScope('trust')")
//					.antMatchers("/photos/user/**").access("#oauth2.hasScope('trust')")					
//					.antMatchers("/photos/**").access("#oauth2.hasScope('read') or (!#oauth2.isOAuth() and hasRole('ROLE_USER'))")
//					.regexMatchers(HttpMethod.DELETE, "/oauth/users/([^/].*?)/tokens/.*")
//						.access("#oauth2.clientHasRole('ROLE_CLIENT') and (hasRole('ROLE_USER') or #oauth2.isClient()) and #oauth2.hasScope('write')")
//					.regexMatchers(HttpMethod.GET, "/oauth/clients/([^/].*?)/users/.*")
//						.access("#oauth2.clientHasRole('ROLE_CLIENT') and (hasRole('ROLE_USER') or #oauth2.isClient()) and #oauth2.hasScope('read')")
//					.regexMatchers(HttpMethod.GET, "/oauth/clients/.*")
//						.access("#oauth2.clientHasRole('ROLE_CLIENT') and #oauth2.isClient() and #oauth2.hasScope('read')");
			// @formatter:on
    }
    
    private String getPeopleUri(String postfix) {
        return getFullUri("people") + "/" + postfix;
    }
    
    private String getPeopleUri() {
        return getFullUri("people");
    }
    
    private String getFullUri(String resourceName) {
        return apiPrefix + "/" + resourceName;
    }

    protected static class Stuff {

        @Autowired
        private ClientDetailsService clientDetailsService;

        @Autowired
        private TokenStore tokenStore;

        @Bean
        public ApprovalStore approvalStore() throws Exception {
            TokenApprovalStore store = new TokenApprovalStore();
            store.setTokenStore(tokenStore);
            return store;
        }

        @Bean
        @Lazy
        @Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
        public SparklrUserApprovalHandler userApprovalHandler() throws Exception {
            SparklrUserApprovalHandler handler = new SparklrUserApprovalHandler();
            handler.setApprovalStore(approvalStore());
            handler.setRequestFactory(new DefaultOAuth2RequestFactory(clientDetailsService));
            handler.setClientDetailsService(clientDetailsService);
            handler.setUseApprovalStore(true);
            return handler;
        }
    }
}
