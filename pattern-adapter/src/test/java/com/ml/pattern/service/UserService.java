package com.ml.pattern.service;

import com.ml.pattern.V2.adapters.ThreeLoginServiceAdapter;
import com.ml.pattern.v1.ThreeLoginServiceImpl;
import com.ml.pattern.V2.adapters.ThreeLoginService;
import org.junit.Test;

/**
 * @ClassName UserService
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 12:22
 * @Version 1.0
 */
public class UserService {

    @Test
    public void  login(){
        ThreeLoginService threeLoginService = new ThreeLoginServiceImpl();
        ((ThreeLoginServiceImpl) threeLoginService).loginForUsernameAndPassword("admin","123");
        threeLoginService.loginQQ("234sdfsddhgfsdhjgsdfjgds");
    }

    @Test
    public void  loginAdapter(){
        ThreeLoginServiceAdapter threeLoginServiceAdapter = new ThreeLoginServiceAdapter();
        threeLoginServiceAdapter.loginForTel("1813465446","1242241");
        threeLoginServiceAdapter.loginForWeChat("2346dfgdfg");
        //SpringAOP 中的 AdvisorAdapter 类，
        //它有三个实现类 MethodBeforeAdviceAdapter、AfterReturningAdviceAdapter 和ThrowsAdviceAdapter，
        // SpringMVC 中的 HandlerAdapter 类
    }
}
