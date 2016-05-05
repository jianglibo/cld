/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.controller;

import java.io.IOException;
import java.io.Writer;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.base.Strings;
import com.mymock.webproxy.config.AppConfig;
import com.mymock.webproxy.domain.Wpurl;

import static com.mymock.webproxy.db.public_.tables.Wpurl.WPURL;
import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.Orchestrator;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.repository.WpUrlRepository;
import com.mymock.webproxy.service.HttpsConvertor;
import com.mymock.webproxy.util.CompositeEnv;
import com.mymock.webproxy.util.MyUtil;

/**
 * @author jianglibo@gmail.com
 *         2016年4月20日
 *
 */
@Controller
public class HomeController {

    @Autowired
    private Orchestrator orchestrator;
    
    @Autowired
    private AppConfig appConfig;
    
    @Autowired
    private WpUrlRepository wpUrlRepository;
    
    @Autowired
    private HttpsConvertor httpsConvertor;
    
    @Autowired
    private CompositeEnv cenv;

    @RequestMapping(path = "/**")
    void home(@RequestParam(name = "host", required = false) String host, HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ResourceGetterException, BytesProcessorException, URISyntaxException {
        
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
        
        if (Strings.isNullOrEmpty(determinedHost) || appConfig.getMyips().contains(determinedHost)) {
            if ("localhost".equalsIgnoreCase(url.getHost()) ||
                    "127.0.0.1".equalsIgnoreCase(url.getHost())) {
                Writer w = resp.getWriter();
                w.write("circular request.");
                w.close();
                return;
            }
        }  else {
            url = MyUtil.changeURLHost(url, determinedHost);            
        }
        
        url = httpsConvertor.convertToHttpsIfNeed(url);
        
        url = MyUtil.changePort(url, -1);

        ResourceLocation rl = new ResourceLocation(url);
        orchestrator.participate(rl, resp);
    }

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    void hello(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServletOutputStream out = resp.getOutputStream();
        out.print("Hello World!");
        out.flush();
        out.close();
    }

    @RequestMapping(path = "/headers", method = RequestMethod.GET)
    @ResponseBody
    String headers(HttpServletRequest req) {
        Enumeration<String> hne = req.getHeaderNames();
        StringBuffer sb = new StringBuffer();
        while (hne.hasMoreElements()) {
            String hn = hne.nextElement();
            sb.append(hn).append("=").append(req.getHeader(hn)).append("\n");
        }
        return sb.toString();
    }
    
    @RequestMapping(path = "/wpurls", method = RequestMethod.GET)
    ResponseEntity<List<Wpurl>> wpurls(HttpServletRequest req) {
        List<Wpurl> wpurls = cenv.getCreate().select(WPURL.ID, WPURL.ADDRESS).from(WPURL).fetch().into(Wpurl.class);
        return new ResponseEntity<List<Wpurl>>(wpurls, HttpStatus.OK);
    }

    @RequestMapping(path = "/wpurls-delete-all", method = RequestMethod.GET)
    @ResponseBody
    String wpurlsDeleteAll(HttpServletRequest req) {
        wpUrlRepository.deleteAll();
        return "ok";
    }
    
}

// ><|:&