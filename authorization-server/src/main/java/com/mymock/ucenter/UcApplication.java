package com.mymock.ucenter;

import java.awt.Color;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.WebContentInterceptor;
import org.springframework.web.util.UrlPathHelper;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.bingoohuang.patchca.color.SingleColorFactory;
import com.github.bingoohuang.patchca.custom.ConfigurableCaptchaService;
import com.github.bingoohuang.patchca.filter.predefined.CurvesRippleFilterFactory;
import com.github.bingoohuang.patchca.font.RandomFontFactory;
import com.github.bingoohuang.patchca.text.renderer.BestFitTextRenderer;
import com.github.bingoohuang.patchca.word.AdaptiveRandomWordFactory;
import com.mymock.ucenter.config.AppMiscConfigUc;

//import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;
//import com.octo.captcha.service.image.ImageCaptchaService;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = "cc.openscanner")
public class UcApplication extends WebMvcConfigurerAdapter {

    // @Controller
    // protected static class HomeController {
    //
    // @RequestMapping("/")
    // @Secured("ROLE_ADMIN")
    // public String home(Map<String, Object> model) {
    // model.put("message", "Hello World");
    // model.put("title", "Hello Home");
    // model.put("date", new Date());
    // return "home";
    // }
    // }

//    @Autowired
//    private AppMiscConfigUc appConfig;

    /**
     * DispatcherServlet是springmvc的核心servlet。
     * DefaultSecurityFilterChain 也是一个通道。
     * 
     * @return
     */
    @Bean
    private FilterRegistrationBean ucFilterRegistrationBean() {
        return new FilterRegistrationBean(new UcFilter());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // @formatter:off
        
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/") //.setCachePeriod(600)
            .resourceChain(true);
//            .addResolver(new ResourceHeaderProcessResolver());
//            .addResolver(new CachingResourceResolver(new ConcurrentMapCache("uc-resource-cache")));
//            .addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"))
//            .addTransformer(new CssLinkResourceTransformer());

     // @formatter:on
    }

    // @Bean
    // public MappedInterceptor ucMappedInterceptor() {
    // MappedInterceptor mi = new MappedInterceptor();
    // }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HeaderInspectInterceptor());
        // registry.addInterceptor(new ResourceHttpRequestHandler());
        // registry.addInterceptor(new UcWebContentInterceptor()).addPathPatterns("/static/**");
        // .pathMatcher(new AntPathMatcher("/static/**"));
        // registry.addWebRequestInterceptor(new WebInteceptorInternal());
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

    };

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // registry.addViewController("/tokentest").setViewName("tokentest");
        // registry.addViewController("/login").setViewName("login");
        // registry.addViewController("/access").setViewName("access");
        // registry.addViewController("/upload").setViewName("upload");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(UcApplication.class, args);
    }

    // @Bean
    // public ImageCaptchaService imageCaptchaService() {
    // return new DefaultManageableImageCaptchaService();
    // }

    @Bean
    public ObjectMapper ignoreMissingFieldOm() {
        ObjectMapper om = new ObjectMapper();
        om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return om;

    }

    // @Bean
    // public WebContentInterceptor staticResourceHeaderInterceptor() {
    // WebContentInterceptor interceptor = new WebContentInterceptor();
    // interceptor.setPathMatcher(new AntPathMatcher("/static/**"));
    // interceptor.setCacheSeconds(31556926);
    // interceptor.setUseExpiresHeader(true);;
    // interceptor.setUseCacheControlHeader(true);
    // interceptor.setUseCacheControlNoStore(true);
    // return interceptor;
    // }

    public static class UcWebContentInterceptor extends WebContentInterceptor {

        private UrlPathHelper urlPathHelper = new UrlPathHelper();

        public UcWebContentInterceptor() {
            super();
            // setCacheSeconds(31556926);
            // setUseExpiresHeader(true);
            // setUseCacheControlHeader(true);
            // setUseCacheControlNoStore(true);
        }

        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException {
            String lookupPath = this.urlPathHelper.getLookupPathForRequest(request);
            return super.preHandle(request, response, handler);
        }
    }

    @Bean
    public ConfigurableCaptchaService configurableCaptchaService() {
        ConfigurableCaptchaService cs = new ConfigurableCaptchaService();
        cs.setColorFactory(new SingleColorFactory(new Color(25, 60, 170)));
        cs.setFilterFactory(new CurvesRippleFilterFactory(cs.getColorFactory()));
        RandomFontFactory ff = new RandomFontFactory();
        ff.setMinSize(24);
        ff.setMaxSize(24);
        AdaptiveRandomWordFactory arf = new AdaptiveRandomWordFactory();
        arf.setMinLength(5);
        arf.setMaxLength(5);
        cs.setWordFactory(arf);
        cs.setFontFactory(ff);

        BestFitTextRenderer textRenderer = new BestFitTextRenderer();
        textRenderer.setTopMargin(0);
        textRenderer.setBottomMargin(0);
        textRenderer.setLeftMargin(0);
        textRenderer.setRightMargin(0);
        cs.setTextRenderer(textRenderer);

        cs.setHeight(35);
        cs.setWidth(80);
        return cs;
    }

    @Bean
    public RestTemplate restTemplate() {
        HttpClient httpClient = HttpClientBuilder.create().build();
        ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
        return new RestTemplate(requestFactory);
    }

    // @Bean
    // @Qualifier("tkConsumer")
    // public ObjectMapper objectMapper() {
    // ObjectMapper mapper = new ObjectMapper();
    // mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    // return mapper;
    // }

    // @Bean
    // public ApplicationSecurity applicationSecurity() {
    // return new ApplicationSecurity();
    // }

    /**
     * 由于没有创建AuthenticationManager，所以下面的代码不会覆盖auto配置，仅仅增加新的配置而已。
     * 
     * @author jianglibo
     *
     *         2015年4月22日-上午10:32:07
     */

    // @Order(Ordered.HIGHEST_PRECEDENCE)
    // @Configuration
    // protected static class AuthenticationSecurity extends GlobalAuthenticationConfigurerAdapter {
    //
    // @Override
    // public void init(AuthenticationManagerBuilder auth) throws Exception {
//			// @formatter:off
//			auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN", "USER").and().withUser("user").password("user").roles("USER");
//			// @formatter:on
    // }
    // }
    /**
     * 
     * @author jianglibo
     *
     *         2015年4月22日-上午10:21:17
     */
    // @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
    // protected static class ApplicationSecurity extends WebSecurityConfigurerAdapter {
    //
    // @Override
    // protected void configure(HttpSecurity http) throws Exception {
//			// @formatter:off
//			http.authorizeRequests().antMatchers("/login").permitAll().anyRequest().fullyAuthenticated().and().formLogin().loginPage("/login")
//					.failureUrl("/login?error").and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).and().exceptionHandling()
//					.accessDeniedPage("/access?error");
//			// @formatter:on
    // }
    //
    // }

    // @Bean
    // @Qualifier("multipartResolver")
    // public MultipartResolver multipartResolver() {
    // CommonsMultipartResolver mr = new CommonsMultipartResolver();
    // return mr;
    // }

    public static class WebInteceptorInternal implements WebRequestInterceptor {

        @Override
        public void preHandle(WebRequest request) throws Exception {
            // TODO Auto-generated method stub

        }

        @Override
        public void postHandle(WebRequest request, ModelMap model) throws Exception {
            // TODO Auto-generated method stub

        }

        @Override
        public void afterCompletion(WebRequest request, Exception ex) throws Exception {
            // TODO Auto-generated method stub

        }
    }
    
    @Bean
    public TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }

}
