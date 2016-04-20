package com.changpu.spirit.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by maxing on 2016/4/6.
 */
public class User implements Serializable{
    private static final long serialVersionUID = 4233389009362738042L;
    private Long id;
    private String username;
    private String password;
    private String state;
    private Date createTime;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
