package com.mymock.ucenter.vo;

import java.util.Set;
import java.util.stream.Collectors;

import com.mymock.ucenter.domain.ThirdPartLogin;
import com.mymock.ucenter.domain.ThirdPartLogin.Provider;

public class ThirdPartLoginVo {

    private Provider provider;
    private String openId;

    private String displayName;
    private String readableId;

    
    public static Set<ThirdPartLoginVo> toVos(Set<ThirdPartLogin> tps){
        return tps.stream().map(t -> new ThirdPartLoginVo(t)).collect(Collectors.toSet());
    }
    
    public ThirdPartLoginVo(ThirdPartLogin tp) {
        this.provider = tp.getProvider();
        this.openId = tp.getOpenId();
        this.displayName = tp.getDisplayName();
        this.readableId = tp.getReadableId();
        
        if (this.getDisplayName() == null || this.getDisplayName().isEmpty()) {
            this.setDisplayName(this.getReadableId());
        }
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getReadableId() {
        return readableId;
    }

    public void setReadableId(String readableId) {
        this.readableId = readableId;
    }
    
}

