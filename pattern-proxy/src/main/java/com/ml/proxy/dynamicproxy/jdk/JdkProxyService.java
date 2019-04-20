package com.ml.proxy.dynamicproxy.jdk;

import javax.jws.Oneway;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName JdkProxyService
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/18 22:28
 * @Version 1.0
 */
public class JdkProxyService implements InvocationHandler {

    private Object target;

    public Object getInstance(Object object){
        this.target = object;
        Class<?> clazz = object.getClass();
      return  Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //参校验
        before(method,args);
        Object result = method.invoke(this.target,args);
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
