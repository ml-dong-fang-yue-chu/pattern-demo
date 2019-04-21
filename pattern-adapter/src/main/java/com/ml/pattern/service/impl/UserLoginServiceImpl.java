package com.ml.pattern.service.impl;

import com.ml.pattern.service.UserLoginService;
import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName UserServiceImpl
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 12:10
 * @Version 1.0
 */
public class UserLoginServiceImpl implements UserLoginService  {
    @Override
    public MLBaseResult<String> loginForUsernameAndPassword(String username, String password) {
        System.out.println("用户名和密码登录成功！");
        return null;
    }

    @Override
    public MLBaseResult<String> loginForTel(String Tel, String code) {
        System.out.println("手机号码登录成功！");
        return null;
    }
}
