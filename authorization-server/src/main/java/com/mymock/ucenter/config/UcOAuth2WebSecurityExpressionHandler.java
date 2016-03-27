package com.mymock.ucenter.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.expression.OAuth2WebSecurityExpressionHandler;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.expression.WebSecurityExpressionRoot;

import com.mymock.ucenter.utils.UriSegmentUtil;

public class UcOAuth2WebSecurityExpressionHandler extends OAuth2WebSecurityExpressionHandler {

    @Override
    protected StandardEvaluationContext createEvaluationContextInternal(Authentication authentication, FilterInvocation invocation) {
        StandardEvaluationContext ec = super.createEvaluationContextInternal(authentication, invocation);
        ec.setVariable("uri", new UcSecurityExpressionMethods(invocation.getRequest(), authentication));
        return ec;
    }

    public static class UcSecurityExpressionMethods {

        private final Authentication authentication;

        private final HttpServletRequest httpServletRequest;

        public UcSecurityExpressionMethods(HttpServletRequest httpServletRequest, Authentication authentication) {
            this.httpServletRequest = httpServletRequest;
            this.authentication = authentication;
        }

        public long longValueAt(int pos) {
            try {
                return UriSegmentUtil.getLongValueFromEnd(httpServletRequest.getRequestURI(), pos);
            } catch (Exception e) {
                throw new AccessDeniedException("UcOauth2 expression exception");
            }
        }
    }

}
