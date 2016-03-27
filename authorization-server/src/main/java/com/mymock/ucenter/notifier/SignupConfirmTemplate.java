package com.mymock.ucenter.notifier;

import com.google.common.collect.Sets;
import com.mymock.ucenter.domain.UcToken;
import com.mymock.ucenter.vo.PersonVo;

public class SignupConfirmTemplate extends SendCloudTemplate {
    
    public static final String VURL = "vurl";
    
    private PersonVo personVo;

    public SignupConfirmTemplate(PersonVo personVo, String host, UcToken uctk) {
        super("regist_confirm", Sets.newHashSet(VURL));
        setSubjectTpl("[网蛙科技]请激活您的账号，%s ！");
        this.personVo = personVo;
        withVar(VURL, host + "/email-verify?uctk=" + uctk.getTk());
    }

    @Override
    protected String getSubject() {
        return String.format(getSubjectTpl(), personVo.getUsername());
    }
}
