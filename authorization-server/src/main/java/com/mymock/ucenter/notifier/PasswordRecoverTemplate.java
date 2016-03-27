package com.mymock.ucenter.notifier;

import java.io.UnsupportedEncodingException;

import org.springframework.util.Assert;
import org.springframework.web.util.UriUtils;

import com.google.common.collect.Sets;
import com.mymock.ucenter.domain.UcToken;

public class PasswordRecoverTemplate extends SendCloudTemplate {
    
    public static final String VURL = "vurl";
    
    public PasswordRecoverTemplate(UcToken uctk, String host, String rdUrl) throws UnsupportedEncodingException {
        super("password_recover", Sets.newHashSet(VURL));
        Assert.notNull(uctk.getTk(), "uctoken's tk is null, have you save it before use?");
        setSubjectTpl("[网蛙科技]密码重置！");
        withVar(VURL, createVurl(host, uctk, rdUrl));
    }
    
    private String createVurl(String host, UcToken uctk, String rdUrl) throws UnsupportedEncodingException {
        rdUrl = rdUrl == null ? "" : rdUrl;
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
