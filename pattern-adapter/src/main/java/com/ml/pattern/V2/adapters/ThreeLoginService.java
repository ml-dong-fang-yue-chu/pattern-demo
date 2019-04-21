package com.ml.pattern.V2.adapters;

import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName UserService
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 12:03
 * @Version 1.0
 */
public interface ThreeLoginService {

    //通过微信登录
    MLBaseResult<String> loginForWeChat(String openId);

    //通过qq登录
    MLBaseResult<String> loginQQ(String openId);


}
