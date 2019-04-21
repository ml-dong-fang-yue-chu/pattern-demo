package com.ml.pattern.service;

import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName UserService
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 12:03
 * @Version 1.0
 */
public interface UserLoginService {

    //通过用户名和密码登录
    MLBaseResult<String> loginForUsernameAndPassword(String username,String password);

    //通过手机号码登录
    MLBaseResult<String> loginForTel(String Tel,String code);


}
