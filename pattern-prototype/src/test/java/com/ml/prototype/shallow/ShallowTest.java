package com.ml.prototype.shallow;

import org.junit.Test;

/**
 * @ClassName ShallowTest
 * @DESC 浅克隆测试类
 * @Author ML
 * @Date 2019/4/18 20:29
 * @Version 1.0
 */
public class ShallowTest {

    @Test
    public void peopleCloneTest() throws CloneNotSupportedException {
        People teacher = new People();
        teacher.setType("老师");
        teacher.setAge(18);
        teacher.setName("小乔");

        Car car = new Car();
        car.setName("本田雅阁!");
        teacher.setHaveCar(car);

        //值传递
        People worker = teacher;
        //浅克隆
        People student = (People) teacher.clone();
        teacher.setName("大乔");
        //
        car.setName("大众迈腾！");
        System.out.println("teacher:"+teacher);
        System.out.println("student:"+student);
        System.out.println("worker:"+worker);


    }
}
