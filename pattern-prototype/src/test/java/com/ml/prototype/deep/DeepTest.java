package com.ml.prototype.deep;

import com.ml.prototype.shallow.Car;
import org.junit.Test;

/**
 * @ClassName DeepTest
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/18 21:39
 * @Version 1.0
 */
public class DeepTest {

    @Test
    public void peopleCloneTest() throws CloneNotSupportedException {

        PeopleDeep teacher = new PeopleDeep();
        teacher.setType("老师");
        teacher.setAge(18);
        teacher.setName("小乔");

        Car car = new Car();
        car.setName("本田雅阁!");
        teacher.setHaveCar(car);

        //值传递
        PeopleDeep worker = teacher;
        //浅克隆
        PeopleDeep student = (PeopleDeep) teacher.clone();
        teacher.setName("大乔");
        //
        car.setName("大众迈腾！");

        System.out.println("teacher:"+teacher);
        System.out.println("student:"+student);
        System.out.println("worker:"+worker);


    }
}
