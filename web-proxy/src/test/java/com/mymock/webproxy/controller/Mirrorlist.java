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

import com.mymock.webproxy.logic.FileDownloader;
import com.mymock.webproxy.logic.OriginUrl;

/**
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */
@Controller
public class Mirrorlist {

    private String centosUrl = "http://mirrorlist.centos.org/";
    
    @Autowired
    private FileDownloader fd;

    @RequestMapping(path = "/mirrorlist", method = RequestMethod.GET)
    public void getList(HttpServletRequest req, HttpServletResponse resp) throws ClientProtocolException, IOException {
        OriginUrl ou = new OriginUrl(req);
        //@formatter:off
        fd.doit(ou, resp);
        //@formatter:on
    }
}
