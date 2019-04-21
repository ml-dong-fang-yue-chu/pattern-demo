package com.ml.pattern.V2.adapters;

import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName LoginAdapter
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 12:32
 * @Version 1.0
 */
public interface LoginAdapter {

    boolean supportLogin(Object login);

    MLBaseResult<String> login(String openId,Object login);

}
