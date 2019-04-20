package com.ml.proxy.dynamicproxy;

import com.ml.proxy.dynamicproxy.IUserService;

/**
 * @ClassName UserService
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/18 22:26
 * @Version 1.0
 */
public class UserService implements IUserService {

    @Override
    public void login(String tel,int state) {
        System.out.println("登录成功!");
    }
}
