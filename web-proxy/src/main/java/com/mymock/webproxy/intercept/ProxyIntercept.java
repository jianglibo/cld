/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.intercept;


import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.google.common.base.Strings;
import com.mymock.webproxy.config.AppConfig;
import com.mymock.webproxy.logic.Orchestrator;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.util.MyUtil;

/**
 * @author jianglibo@gmail.com
 *         2016年4月20日
 *
 */
public class ProxyIntercept  extends HandlerInterceptorAdapter {
    
    @Autowired
    private Orchestrator orchestrator;
    
    @Autowired
    private AppConfig appConfig;
    
    private Pattern ptn = Pattern.compile("(/api|/api/.*)");
    
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp,
            Object handler) throws Exception {
        
        String host = req.getParameter("host");
        
        if (ptn.matcher(req.getRequestURI()).matches() || "/error".equals(req.getRequestURI())) {
            return true;
        } else {
            String determinedHost = null;
            String qs = req.getQueryString();
            
            Enumeration<String> hnEnum =req.getHeaderNames();
            while(hnEnum.hasMoreElements()) {
                String hn = hnEnum.nextElement();
                if (hn.equalsIgnoreCase(appConfig.getForwardHeader())) {
                    String xf = req.getHeader(hn);
                    if(xf != null) {
                        determinedHost = xf.split(",")[0];
                    }
                    break;
                }
            }
            
            if (determinedHost == null) {
                if (!Strings.isNullOrEmpty(host)) {
                    determinedHost = host;
                    qs = MyUtil.subsParameter(qs, "host");
                }
            }
            
            URL url = MyUtil.fromReq(req.getRequestURL(),qs);
            
            if (Strings.isNullOrEmpty(determinedHost)) {
                if ("localhost".equalsIgnoreCase(url.getHost()) ||
                        "127.0.0.1".equalsIgnoreCase(url.getHost())) {
                    resp.setStatus(404);
                    Writer w = resp.getWriter();
                    w.write("circular request.");
                    w.close();
                    return false;
                }
            }  else {
                url = MyUtil.changeURLHost(url, determinedHost);            
            }

            ResourceLocation rl = new ResourceLocation(url);
            orchestrator.participate(rl, resp); 
        }
        return false;
    }

}
