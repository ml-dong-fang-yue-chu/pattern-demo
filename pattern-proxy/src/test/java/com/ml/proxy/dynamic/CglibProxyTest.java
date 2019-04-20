package com.ml.proxy.dynamic;

import com.ml.proxy.dynamicproxy.IUserService;
import com.ml.proxy.dynamicproxy.UserService;
import com.ml.proxy.dynamicproxy.cglib.CglibProxyService;
import com.ml.proxy.dynamicproxy.jdk.JdkProxyService;
import net.sf.cglib.core.DebuggingClassWriter;
import org.junit.Test;

/**
 * @ClassName JdkProxyTest
 * @DESC cglib动态代理测试类
 * @Author ML
 * @Date 2019/4/19 8:22
 * @Version 1.0
 */
public class CglibProxyTest {

    @Test
    public void proxyTest(){

        //JDK是采用读取接口的信息
        //CGLib覆盖父类方法
        //目的：都是生成一个新的类，去实现增强代码逻辑的功能
        //JDK Proxy 对于用户而言，必须要有一个接口实现，目标类相对来说复杂
        //CGLib 可以代理任意一个普通的类，没有任何要求
        //CGLib 生成代理逻辑更复杂，效率,调用效率更高，生成一个包含了所有的逻辑的FastClass，不再需要反射调用
        //JDK Proxy生成代理的逻辑简单，执行效率相对要低，每次都要反射动态调用
        //CGLib 有个坑，CGLib不能代理final的方法
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://cglib_proxy_classes");
        UserService userService =  (UserService) new CglibProxyService().getInstance(UserService.class);
        userService.login("213",2);
    }
}
