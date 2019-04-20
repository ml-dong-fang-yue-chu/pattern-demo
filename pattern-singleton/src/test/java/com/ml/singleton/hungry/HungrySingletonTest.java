package com.ml.singleton.hungry;

import com.ml.singleton.hungry.HungrySingleton;
import com.ml.singleton.lazy.LazySingleton;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class HungrySingletonTest {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(3);
        for (int x = 0;x < 10;x++){
           scheduledThreadPoolExecutor.schedule(()->{
               System.out.println(System.currentTimeMillis()+":"+ HungrySingleton2.getInstance());
           },0, TimeUnit.SECONDS);
        }


    }
}
