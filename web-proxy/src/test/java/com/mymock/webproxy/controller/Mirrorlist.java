/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.logic.resourcegetter.ResourceGetter;

/**
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */
@Controller
public class Mirrorlist {

    private String centosUrl = "http://mirrorlist.centos.org/";
    
    
    @RequestMapping(path = "/mirrorlist", method = RequestMethod.GET)
    public void getList(HttpServletRequest req, HttpServletResponse resp) throws ClientProtocolException, IOException {
//        ResourceLocation ou = new ResourceLocation(req);
        //@formatter:off
//        fd.doit(ou, resp);
        //@formatter:on
    }
    
    @RequestMapping(path = "/rd", method = RequestMethod.GET)
    public void rd(HttpServletResponse response) throws IOException {
        response.sendRedirect("/afterrd");
    }
    
    @RequestMapping(path = "/afterrd")
    @ResponseBody
    public String afterrd() {
        return "redirect";
    }
}
