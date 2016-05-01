package com.mymock.webproxy.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mymock.webproxy.config.AppConfig;
import com.mymock.webproxy.domain.Wpurl;

@Component
public class MirrorListHandler {
    
    @Autowired
    private AppConfig appConfig;

    public void handle(Wpurl wpurl, HttpServletResponse resp) throws IOException {
        String mlist = new String(wpurl.getContent());
        String oneline = mlist.split("\n")[0];
        int thirdSlash = oneline.indexOf('/', 9);
        String suffix = oneline.substring(thirdSlash);
        String fullUrl = appConfig.getFavoriteMirror() + suffix;
        Writer out = resp.getWriter();
        out.write(fullUrl);
        out.flush();
        out.close();
    }
}
