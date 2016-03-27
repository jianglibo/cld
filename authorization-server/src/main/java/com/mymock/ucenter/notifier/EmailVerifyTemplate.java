package com.mymock.ucenter.notifier;

import java.io.UnsupportedEncodingException;

import org.springframework.web.util.UriUtils;

import com.google.common.collect.Sets;
import com.mymock.ucenter.domain.UcToken;

public class EmailVerifyTemplate extends SendCloudTemplate {
    
    public static final String VURL = "vurl";
    
    public EmailVerifyTemplate(UcToken uctk, String host, String rdUrl) throws UnsupportedEncodingException {
        super("email_verify", Sets.newHashSet(VURL));
        setSubjectTpl("[网蛙科技]邮件验证！");
        withVar(VURL, createVurl(host, uctk, rdUrl));
    }
    
    private String createVurl(String host, UcToken uctk, String rdUrl) throws UnsupportedEncodingException {
        if (rdUrl.indexOf('?') != -1) {
            rdUrl = rdUrl + "&uctk=" + uctk.getTk();
        } else {
            rdUrl = rdUrl + "?uctk=" + uctk.getTk();
        }
        return host + "/tkconsumer?uctk=" + uctk.getTk() + "&rd=" + UriUtils.encodeQueryParam(rdUrl, "UTF-8");
    }

    @Override
    protected String getSubject() {
        return getSubjectTpl();
    }
}
