package com.ml.pattern.V2.adapters;

import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName LoginAdapter
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 12:32
 * @Version 1.0
 */
public class LoginForQQAdapter implements LoginAdapter {


    @Override
    public boolean supportLogin(Object login) {
        return login instanceof LoginForQQAdapter ;
    }

    @Override
    public MLBaseResult<String> login(String openId, Object login) {
        System.out.println("qq登录成功！");
        return null;
    }
}
