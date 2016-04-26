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

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.base.Strings;
import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.Orchestrator;
import com.mymock.webproxy.logic.ResourceLocation;
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

    @RequestMapping(path = "/**", method = RequestMethod.GET)
    void home(@RequestParam(name = "host", required = false) String host, HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ResourceGetterException, BytesProcessorException, URISyntaxException {
        
        String hn = req.getServerName();
        String reqHn = req.getRemoteHost();
        
        if (hn.equals(reqHn) && Strings.isNullOrEmpty(host)) {
            Writer w = resp.getWriter();
            w.write("circular request.");
            w.close();
            return;
        }
        URL url = MyUtil.fromReq(req.getRequestURL(), MyUtil.subsParameter(req.getQueryString(), "host"));

        if (!Strings.isNullOrEmpty(host)) {
            url = MyUtil.changeURLHost(url, host);
        }
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
}

// ><|:&