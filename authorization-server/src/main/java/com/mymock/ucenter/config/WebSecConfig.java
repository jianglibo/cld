package com.mymock.ucenter.config;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.security.web.authentication.session.ChangeSessionIdAuthenticationStrategy;
import org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.mymock.ucenter.config.userdetail.PersonManager;
import com.mymock.ucenter.config.userdetail.PersonManagerConfigurer;

/**
 * 1、如果标注了@Configuration和@EnableWebSecurity，那么就关闭了spring-boot的web安全的设置
 * 2、可以提供自己的AuthenticationManager，那么默认的就不会创建，同时你有了完全的设置控制
 * 3、在WebSecurityConfigurerAdapter的继承类中，标注@Configuration，同时@Autowired.
 * 4、继承GlobalAuthenticationConfigurerAdapter，同时override init方法。（If you experience instantiation issues）
 * 。
 * 
 * @author jianglibo
 *
 *         2015年4月22日-上午10:44:07
 */
@Configuration
@EnableWebSecurity
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class WebSecConfig extends WebSecurityConfigurerAdapter {
    
    private static Logger logger = LoggerFactory.getLogger(WebSecConfig.class);

    @Autowired
    private AppMiscConfigUc appConfig;

    @Autowired
    private Environment env;

    @Autowired
    private PersonManager personManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * disable default. then read father class's gethttp method. write all config your self.
     */
    public WebSecConfig() {
        super(true);
    }

    /**
     * AuthenticationManager, ProviderManager and AuthenticationProvider
     * AuthenticationManager仅仅是一个interface，怎样实现，it's up to you。spring的默認實現是ProviderManager，ProviderManager自己不做什麽，通過一系列AuthenticationProvider來完成認證工作。
     * 
     */
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    
    
    @Bean
    public UcExceptionTranslationFilter ucExceptionTranslationFilter() {
        String loginEntry = appConfig.getLoginEntryPoint();
        if (logger.isDebugEnabled()) {
            logger.debug("login entry point is: {}", loginEntry);
        }
        AuthenticationEntryPoint authenticationEntryPoint = new LoginUrlAuthenticationEntryPoint(loginEntry);
        return new UcExceptionTranslationFilter(authenticationEntryPoint);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // @formatter:off
        PersonManagerConfigurer<AuthenticationManagerBuilder> pc = auth.apply(new PersonManagerConfigurer<AuthenticationManagerBuilder>(personManager)).passwordEncoder(passwordEncoder);
        
        if (appConfig.isNoneDemoData()) {
            String randomPwd = UUID.randomUUID().toString();
            
            try {
                personManager.loadUserByUsername("ucenter");
            } catch (UsernameNotFoundException e) {
                logger.info("init user not found.");
                logger.info("------------secret: {} ---------------------", randomPwd);
            }

            pc.withPerson("ucenter")
        	.displayName("ucenter")
        	.email("jianglb@openscanner.cn")
        	.emailVerified(true)
        	.authorities("ROLE_PERSON_MANAGER", "ROLE_USER")
        	.password(randomPwd);
        } else {
            pc.withPerson("ucenter")
        	.displayName("ucenter")
        	.email("jianglb@openscanner.cn")
        	.emailVerified(true)
        	.authorities("ROLE_PERSON_MANAGER", "ROLE_USER")
        	.password("openscanner");
        }
        
        // @formatter:on
    };
    /**
     * 如果用户请求protected resource，产生accessdenyexception，此时，exceptionhandler拦截这个exception，找到默认的entryPoint，根据类型采取相应的措施，常见的是重定向到formlogin页面。
     * 表单里面输入username，password，然后由对应的authenticationfilter处理。我们可以查看一下UsernamePasswordAuthenticationFilter做了什么，然后模仿一个即可。
     * 
     * 是formLogin()产生了这个配置，那么除去formLogin，然后按照formLogin编写自己的配置就可以了。
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // copy form super class of formloginconfiger.

        // @Override
        // public void configure(B http) throws Exception {
        // PortMapper portMapper = http.getSharedObject(PortMapper.class);
        // if(portMapper != null) {
        // authenticationEntryPoint.setPortMapper(portMapper);
        // }
        //
        // authFilter.setAuthenticationManager(http.getSharedObject(AuthenticationManager.class));
        // authFilter.setAuthenticationSuccessHandler(successHandler);
        // authFilter.setAuthenticationFailureHandler(failureHandler);
        // if(authenticationDetailsSource != null) {
        // authFilter.setAuthenticationDetailsSource(authenticationDetailsSource);
        // }
        // SessionAuthenticationStrategy sessionAuthenticationStrategy = http.getSharedObject(SessionAuthenticationStrategy.class);
        // if(sessionAuthenticationStrategy != null) {
        // authFilter.setSessionAuthenticationStrategy(sessionAuthenticationStrategy);
        // }
        // RememberMeServices rememberMeServices = http.getSharedObject(RememberMeServices.class);
        // if(rememberMeServices != null) {
        // authFilter.setRememberMeServices(rememberMeServices);
        // }
        // F filter = postProcess(authFilter);
        // http.addFilter(filter);
        // }

        // @formatter:off
        System.out.println("......................." + appConfig.isBypasssecurity());
        System.out.println(".......................spring.profiles.active:" + env.getProperty("spring.profiles.active"));
        System.out.println(".......................spring.security.enable-csrf:" + env.getProperty("spring.security.enable-csrf"));
//        http
//        .csrf().and()
//        .addFilter(new WebAsyncManagerIntegrationFilter())
////        .exceptionHandling().and()
//        .addFilter(new UcExceptionTranslationFilter())
//        .headers().and()
//        .sessionManagement().and()
//        .securityContext().and()
//        .requestCache().and()
//        .anonymous().and()
//        .servletApi().and()
////        .apply(new DefaultLoginPageConfigurer<HttpSecurity>()).and()
//        .logout();


        // copy from father class's getHttp method.
            http
                .csrf().and()
                .addFilter(new WebAsyncManagerIntegrationFilter())
//                .exceptionHandling().and()
                .headers().and()
                .addFilter(ucExceptionTranslationFilter())
                .sessionManagement().sessionAuthenticationStrategy(sessionAuthenticationStrategy())
                .and()
                .securityContext().
                and()
                .requestCache().and()
                .anonymous().and()
                .servletApi().and()
//                .apply(new DefaultLoginPageConfigurer<HttpSecurity>()).and()
                .logout();
        

        // @formatter:off
        http.authorizeRequests()
            .antMatchers("/", "/login/**","/thtpl", "/logined","/signup", "/static/**", "/favicon.ico", "/tkconsumer").permitAll()
            .anyRequest().fullyAuthenticated()
            .and()
            .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));

//         ExceptionHandlingConfigurer<HttpSecurity> eh = new ExceptionHandlingConfigurer<HttpSecurity>();
//         eh.authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/myenv")).accessDeniedPage("/access?error");
//         http.apply(eh);

        
        // @formatter:on

        // http.apply(new UcFormLoginConfigurer<HttpSecurity>());

        // http.exceptionHandling();
        // ExceptionHandlingConfigurer<HttpSecurity> eh = new ExceptionHandlingConfigurer<HttpSecurity>();
        // eh.authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/myenv"));
        // http.apply(eh);
    }

    // @Override
    // protected void configure(HttpSecurity http) throws Exception {
    // http
    // .authorizeRequests()
    // .antMatchers("/login.jsp").permitAll()
    // .anyRequest().hasRole("USER")
    // .and()
    // .exceptionHandling()
    // .accessDeniedPage("/login.jsp?authorization_error=true")
    // .and()
    // .csrf()
    // .requireCsrfProtectionMatcher(new AntPathRequestMatcher("/oauth/authorize"))
    // .disable()
    // .logout()
    // .logoutUrl("/logout")
    // .logoutSuccessUrl("/login.jsp")
    // .and()
    // .formLogin()
    // .loginProcessingUrl("/login")
    // .failureUrl("/login.jsp?authentication_error=true")
    // .loginPage("/login.jsp");
    // }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(11);
    }
    
    @Bean
    public ChangeSessionIdAuthenticationStrategy sessionAuthenticationStrategy() {
        return new ChangeSessionIdAuthenticationStrategy();
    }

//    /**
//     * auth.authenticationProvider(authenticationProvider), builder会在内部最终呼叫这个方法，传入provider。如果你想完全自己完成就直接doit。
//     * 
//     * @param auth
//     * @throws Exception
//     */
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//    }
}
