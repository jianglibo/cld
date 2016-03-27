package com.mymock.ucenter.domain;

import java.time.Instant;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Sets;
import com.mymock.ucenter.vo.PersonVo;

@Entity
@Table(name = "person", uniqueConstraints = { @UniqueConstraint(columnNames = "name"), @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "mobile"),@UniqueConstraint(columnNames = "openId") })
public class Person extends BaseEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String displayName;

    private String avatar;

    private boolean emailVerified;

    private boolean mobileVerified;
    
    @Enumerated(EnumType.STRING)
    private Gender gender = Gender.FEMALE;
    
    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    @JsonIgnore
    private String password;

    private String mobile;

    private boolean accountNonExpired;

    private boolean accountNonLocked;

    private boolean credentialsNonExpired;

    private boolean enabled;

    @Column(nullable = false)
    private String openId;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "person", cascade = CascadeType.REMOVE)
    private Set<ThirdPartLogin> thirdConns = Sets.newHashSet();

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles = Sets.newHashSet();

    public static Person newValidPerson() {
        Person p = new Person();
        p.setAccountNonExpired(true);
        p.setAccountNonLocked(true);
        p.setCreatedAt(Date.from(Instant.now()));
        p.setCredentialsNonExpired(true);
        p.setEnabled(true);
        return p;
    }

    public Person() {
    }

    public Person(PersonVo personVo, String encodedPwd) {
        setName(personVo.getUsername());
        setDisplayName(personVo.getDisplayName());
        setAvatar(personVo.getAvatar());
        setEmail(personVo.getEmail());
        setMobile(personVo.getMobile());
        setPassword(encodedPwd);
        setAccountNonExpired(personVo.isAccountNonExpired());
        setAccountNonLocked(personVo.isAccountNonLocked());
        setCredentialsNonExpired(personVo.isCredentialsNonExpired());
        setEnabled(personVo.isEnabled());
        setCreatedAt(new Date());
        setEmailVerified(personVo.isEmailVerified());
        setMobileVerified(personVo.isMobileVerified());
    }
    
    
    @PrePersist
    public void beforePersist() {
        setOpenId(UUID.randomUUID().toString().replaceAll("-", ""));
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public boolean isMobileVerified() {
        return mobileVerified;
    }

    public void setMobileVerified(boolean mobileVerified) {
        this.mobileVerified = mobileVerified;
    }

    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Set<ThirdPartLogin> getThirdConns() {
        return thirdConns;
    }

    public void setThirdConns(Set<ThirdPartLogin> thirdConns) {
        this.thirdConns = thirdConns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
    
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static enum Gender {
        MALE, FEMALE
    }

}
