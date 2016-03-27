package com.mymock.ucenter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "thirdpl", uniqueConstraints = { @UniqueConstraint(columnNames = {"provider", "openId"})})
public class ThirdPartLogin extends BaseEntity {


	private static final long serialVersionUID = -6967227234709834709L;

	@Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Provider provider;

    @Column(nullable = false)
    private String openId;
    
    private String displayName;
    
    private String readableId;
    
    @ManyToOne(fetch=FetchType.EAGER)
    private Person person;

    public static enum Provider {
        QQ,QIN,UCLOUD,NORMAL
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
