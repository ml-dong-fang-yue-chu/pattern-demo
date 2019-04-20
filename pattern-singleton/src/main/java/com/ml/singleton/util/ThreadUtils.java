package com.ml.singleton.util;

import com.ml.singleton.register.ContainerSingleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @ClassName ThreadUtils
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/13 14:21
 * @Version 1.0
 */
public class ThreadUtils {


    //总请求数
    public static int AllCount = 1000;

    //并发求数
    public static int ThreadCount = 10;

    //容器式单利测试
    public  static void containerSingleton(Object object){
        //初始化线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        //初始化信号量，控制并发数
        final Semaphore semaphore = new Semaphore(ThreadCount);
        //计数器
        final CountDownLatch countDownLatch = new CountDownLatch(AllCount);
        for(int x=0;x<AllCount;x++){
            executorService.execute(()->{
                try {
                    //获取许可
                    semaphore.acquire();

                    //释放许可
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //锁--
                countDownLatch.countDown();
            });
        }
        try {
            //阻塞
            countDownLatch.await();
            //任务结束关闭线程池
            executorService.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
