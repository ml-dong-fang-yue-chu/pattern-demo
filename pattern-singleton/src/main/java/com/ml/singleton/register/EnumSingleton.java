package com.ml.singleton.register;

import com.ml.singleton.entity.User;

/**
 * @ClassName EnumSingletion
 * @DESC 枚举式单利
 * @Author ML
 * @Date 2019/4/12 21:05
 * @Version 1.0
 */
public enum  EnumSingleton {

    INSTANCE;
    private User user = null;

    EnumSingleton() {
        user  = new User();
    }
    public User getUser(){
        return  user;
    }

}
