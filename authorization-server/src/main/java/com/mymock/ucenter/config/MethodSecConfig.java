package com.mymock.ucenter.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AfterInvocationProvider;
import org.springframework.security.access.expression.method.ExpressionBasedPostInvocationAdvice;
import org.springframework.security.access.intercept.AfterInvocationManager;
import org.springframework.security.access.intercept.AfterInvocationProviderManager;
import org.springframework.security.access.prepost.PostInvocationAdviceProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;


/**
 * securedEnabled = true, @ Secured("IS_AUTHENTICATED_ANONYMOUSLY")
 * prePostEnabled = true @ PreAuthorize("isAnonymous()")
 * @author jianglibo@gmail.com
 *
 */

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class MethodSecConfig extends GlobalMethodSecurityConfiguration {
    
//    @Override
//    protected MethodSecurityExpressionHandler  createExpressionHandler() {
//        return new DefaultMethodSecurityExpressionHandler();
//    }
    /**
     * copy from super.
     */
    @Override
    protected AfterInvocationManager afterInvocationManager() {
        AfterInvocationProviderManager invocationProviderManager = new AfterInvocationProviderManager();
        ExpressionBasedPostInvocationAdvice postAdvice = new ExpressionBasedPostInvocationAdvice(getExpressionHandler());
        PostInvocationAdviceProvider postInvocationAdviceProvider = new PostInvocationAdviceProvider(postAdvice);
        List<AfterInvocationProvider> afterInvocationProviders = new ArrayList<AfterInvocationProvider>();
        afterInvocationProviders.add(postInvocationAdviceProvider);
        invocationProviderManager.setProviders(afterInvocationProviders);
        return invocationProviderManager;
    }
}

