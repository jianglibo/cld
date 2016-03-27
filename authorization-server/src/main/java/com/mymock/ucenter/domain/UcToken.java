package com.mymock.ucenter.domain;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "uctoken", uniqueConstraints = { @UniqueConstraint(columnNames = "tk") })
public class UcToken extends BaseEntity {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @NotNull
    @Column(nullable = false)
    private String tk;
    
    private long millis;
    
    @Enumerated(EnumType.STRING)
    private UcTokenFor tkf;
    
    private String extra;
    
    private Date consumeAt;
    
    private int useTimes;

    public UcToken() {
    };
    
    public UcToken(UcTokenFor tkf, ChronoUnit cu,  long howmany) {
        this.tkf = tkf;
        this.millis = Duration.of(howmany, cu).toMillis();
    };
    
    public UcToken(UcTokenFor tkf, String extra, ChronoUnit cu,  long howmany) {
        this.tkf = tkf;
        this.extra = extra;
        this.millis = Duration.of(howmany, cu).toMillis();
    };


    @PrePersist
    public void beforePersist() {
        setCreatedAt(Date.from(Instant.now()));
        if (tk == null) {
            tk = UUID.randomUUID().toString().replaceAll("-", "") + Math.random();
        }
    }

    
    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public long getMillis() {
        return millis;
    }

    public void setMillis(long millis) {
        this.millis = millis;
    }

    public UcTokenFor getTkf() {
        return tkf;
    }

    public void setTkf(UcTokenFor tkf) {
        this.tkf = tkf;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Date getConsumeAt() {
        return consumeAt;
    }

    public void setConsumeAt(Date consumeAt) {
        this.consumeAt = consumeAt;
    }

    
    public int getUseTimes() {
        return useTimes;
    }

    public void setUseTimes(int useTimes) {
        this.useTimes = useTimes;
    }


    public static enum UcTokenFor {
        VERIFY_EMAIL, PASSWORD_RECOVER
    }

}
