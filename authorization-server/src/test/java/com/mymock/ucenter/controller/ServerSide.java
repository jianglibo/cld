package com.mymock.ucenter.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.google.common.collect.Lists;

@Controller
@RequestMapping("/serverside")
public class ServerSide {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/myenv", method = RequestMethod.GET)
    @ResponseBody
    public String status(HttpServletRequest request) {
        logger.info("");
        CsrfToken ct = (CsrfToken) request.getAttribute("_csrf");
        logger.info("paraName is {}, headerName is {}, token is {}.", ct.getParameterName(), ct.getHeaderName(), ct.getToken());
        return "helloWorld";
    }

    /**
     * 不要加多余的约束，不然可能会接受不到。
     * @param wr
     * @return
     */
    @RequestMapping(value = "/echo")
    @ResponseBody
    public Qinfo echo(WebRequest wr/*
                                    * , java.security.Principal principal, @RequestHeader("Accept-Encoding") String encoding,
                                    * 
                                    * @RequestHeader("Keep-Alive") long keepAlive
                                    */) {
        Qinfo qi = new Qinfo(wr);
        return qi;
    }

    public static class Qinfo {

        private List<String> headerNames;

        public Qinfo(WebRequest wr) {
            this.headerNames = Lists.newArrayList(wr.getHeaderNames());
        }

        public List<String> getHeaderNames() {
            return headerNames;
        }

        public void setHeaderNames(List<String> headerNames) {
            this.headerNames = headerNames;
        }
    }
}
