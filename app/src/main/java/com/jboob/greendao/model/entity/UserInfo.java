package com.jboob.greendao.model.entity;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * auto greenDao generate javaBean by Jboob
 */
@Entity(nameInDb = "tb_user")
public class UserInfo {

    @Id
    private Long id;
    private String user_name;
    private String user_pass;
    private String userNum;

    @Generated
    public UserInfo() {
    }

    public UserInfo(Long id) {
        this.id = id;
    }

    @Generated
    public UserInfo(Long id, String user_name, String user_pass, String userNum) {
        this.id = id;
        this.user_name = user_name;
        this.user_pass = user_pass;
        this.userNum = userNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

}
