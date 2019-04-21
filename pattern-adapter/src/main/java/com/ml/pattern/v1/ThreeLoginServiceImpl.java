package com.ml.pattern.v1;

import com.ml.pattern.service.impl.UserLoginServiceImpl;
import com.ml.pattern.V2.adapters.ThreeLoginService;
import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName ThreeLoginService
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 12:13
 * @Version 1.0
 */
public class ThreeLoginServiceImpl extends UserLoginServiceImpl implements ThreeLoginService {

    @Override
    public MLBaseResult<String> loginForUsernameAndPassword(String username, String password) {
        return super.loginForUsernameAndPassword(username, password);
    }

    @Override
    public MLBaseResult<String> loginForTel(String Tel, String code) {
        return super.loginForTel(Tel, code);
    }


    @Override
    public MLBaseResult<String> loginForWeChat(String openId) {
        System.out.println("微信登录成功！");
        return null;
    }

    @Override
    public MLBaseResult<String> loginQQ(String openId) {
        System.out.println("qq登录成功！");
        return null;
    }
}
