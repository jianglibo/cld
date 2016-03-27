package com.mymock.ucenter.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.mymock.ucenter.domain.ThirdPartLogin.Provider;
import com.mymock.ucenter.vo.LoginAttemptVo;

@Entity
@Table(name = "loginattemp")
public class LoginAttempt extends BaseEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String username;
    
    private String password;

	private String remoteAddress;
	
	private String sessionId;
	
	private Provider provider = Provider.NORMAL;
	
	private boolean success;
	
	public LoginAttempt() {}
	
	public LoginAttempt(LoginAttemptVo lato, String remoteAddress, String sessionId) {
		this.setUsername(lato.getUsername());
		this.setPassword(lato.getPassword());
		this.setRemoteAddress(remoteAddress);
		this.setSessionId(sessionId);
	}
	
	
	public String getRemoteAddress() {
		return remoteAddress;
	}

	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
