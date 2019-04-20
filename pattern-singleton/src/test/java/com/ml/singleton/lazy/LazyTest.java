package com.ml.singleton.lazy;

import com.ml.singleton.hungry.HungrySingleton2;
import com.ml.singleton.register.ContainerSingleton;
import com.ml.singleton.register.EnumSingleton;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName LazyTest
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/12 21:14
 * @Version 1.0
 */
public class LazyTest {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(3);
        for (int x = 0;x < 10;x++){
            scheduledThreadPoolExecutor.schedule(()->{
                System.out.println(System.currentTimeMillis()+":"+ ContainerSingleton.getInstance("com.ml.singleton.entity.User"));
            },0, TimeUnit.SECONDS);
        }
    }
}
