package com.ml.singleton.register;

import com.ml.singleton.entity.User;
import javafx.scene.chart.StackedAreaChart;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName Register
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/13 13:32
 * @Version 1.0
 */
public class Register {

    //总请求数
    public static int AllCount = 10;

    //并发求数
    public static int ThreadCount = 10;

    //容器式单利测试
    @Test
    public  void containerSingleton(){
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
                    System.out.println(ContainerSingleton.getInstance("com.ml.singleton.entity.User"));
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

    //枚举单利
    @Test
    public void enumSingleton(){
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
                    System.out.println(EnumSingleton.INSTANCE.getUser());
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

        public static void main(String[] args) {
        //枚举
      /*      try {
                EnumSingleton EnumSingleton1 = null;

                EnumSingleton EnumSingleton2 = EnumSingleton.INSTANCE;

                FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(EnumSingleton2);
                oos.flush();
                oos.close();

                FileInputStream fis = new FileInputStream("EnumSingleton.obj");
                ObjectInputStream ois = new ObjectInputStream(fis);
                EnumSingleton1 = (EnumSingleton) ois.readObject();
                ois.close();

                System.out.println(EnumSingleton2.getUser());
                System.out.println(EnumSingleton1.getUser());
                System.out.println(EnumSingleton1.getUser() == EnumSingleton2.getUser());



            }catch (Exception e){
                e.printStackTrace();
            }*/
            try {
                Class clazz = EnumSingleton.class;
                //见源码 java.lang.reflect.Constructor.newInstance
                Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
                c.setAccessible(true);
                EnumSingleton enumSingleton = (EnumSingleton)c.newInstance("ml",1213);

            }catch (Exception e){
                e.printStackTrace();
            }
    }
}
