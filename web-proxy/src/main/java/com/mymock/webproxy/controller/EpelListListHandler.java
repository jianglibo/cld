package com.mymock.webproxy.controller;

import java.io.IOException;
import java.io.Writer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mymock.webproxy.config.AppConfig;
import com.mymock.webproxy.domain.Wpurl;

@Component
public class EpelListListHandler {
    
    @Autowired
    private AppConfig appConfig;
    
    private Pattern ptn = Pattern.compile(".*<url.*</url>");
    
    private Pattern ptn1 = Pattern.compile(".*<url.*mirrors.opencas.cn.*</url>");
    
    

    public void handle(Wpurl wpurl, HttpServletResponse resp) throws IOException {
        String[] lines = new String(wpurl.getContent()).split("\n");
        
        final Writer out = resp.getWriter();
        Stream.of(lines).filter(l -> {
            if (ptn.matcher(l.trim()).matches()) {
                if (ptn1.matcher(l.trim()).matches()) {
                    return true;
                }
                return false;
            }
            return true;
        }).forEach(l -> {
            try {
                out.write(l);
                out.write('\n');
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        out.flush();
        out.close();
    }
}
