package com.ml.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import sun.management.ThreadInfoCompositeData;

import java.lang.reflect.Method;

/**
 * @ClassName CglibProxyService
 * @DESC cglib动态代理
 * @Author ML
 * @Date 2019/4/20 9:07
 * @Version 1.0
 */
public class CglibProxyService implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //参校验
        before(method,objects);
        Object result = methodProxy.invokeSuper(o,objects);
        //日志落数
        after();
        return result;
    }
    private void after() {
        System.out.println("执行完成，日志落数！");
    }

    private void before(Method method,Object[] args) {
        Class<?>[] ss = method.getParameterTypes();
        if(ss.length != args.length){
            System.out.println("参数不匹配！");
        }
    }
}
