package com.mymock.ucenter.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OauthConsoleController {

    @RequestMapping(value = {"/oauthconsole"}, method = RequestMethod.GET)
    @Secured("USER")
    public String entry() {
        return "oauthconsole";
    }
}
