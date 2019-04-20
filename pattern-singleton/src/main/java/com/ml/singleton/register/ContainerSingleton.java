package com.ml.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ContainerSingleton
 * @DESC 容器注册式单利
 * @Author ML
 * @Date 2019/4/13 13:22
 * @Version 1.0
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }
    //注册式单利容器
    private static  Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className){

           if(!ioc.containsKey(className)){
                synchronized (ioc){
                    if(!ioc.containsKey(className)){
                        try {
                            Object obj = Class.forName(className).newInstance();
                            ioc.put(className,obj);
                            return obj;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        return ioc.get(className);

    }
}
