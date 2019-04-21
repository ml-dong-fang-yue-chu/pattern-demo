package com.ml.pattern.V2.adapters;

import com.ml.pattern.service.impl.UserLoginServiceImpl;
import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName UserService
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 12:03
 * @Version 1.0
 */
public class ThreeLoginServiceAdapter extends UserLoginServiceImpl implements ThreeLoginService{

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
        LoginAdapter loginAdapter = new  LoginForWeChatAdapter();
        if(loginAdapter.supportLogin(loginAdapter)){
            loginAdapter.login(openId,loginAdapter);
        }
        return null;
    }

    @Override
    public MLBaseResult<String> loginQQ(String openId) {
        LoginAdapter loginAdapter = new LoginForQQAdapter();
        if(loginAdapter.supportLogin(loginAdapter)){
            loginAdapter.login(openId,loginAdapter);
        }
        return null;
    }


}
