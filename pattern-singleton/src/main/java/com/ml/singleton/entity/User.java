package com.ml.singleton.entity;

import java.io.Serializable;

/**
 * @ClassName USer
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/12 21:08
 * @Version 1.0
 */
public class User implements Serializable {

    private String username;

    private String password;

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
}
