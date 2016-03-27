package com.mymock.ucenter;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class HeaderInspectInterceptor extends HandlerInterceptorAdapter {
    private static Logger logger = LoggerFactory.getLogger(HeaderInspectInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (logger.isDebugEnabled()) {
            String pi = request.getPathInfo();
            Enumeration<String> hns = request.getHeaderNames();
            logger.info("------------------start dump reqinfo------------------");

            logger.info("req pathinfo: {}", pi);
            logger.info("req method: {}", request.getMethod());
            while (hns.hasMoreElements()) {
                String hn = hns.nextElement();
                logger.info(hn + ": {}", request.getHeader(hn));
            }
            logger.info("------------------end dump reqinfo------------------");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

}
