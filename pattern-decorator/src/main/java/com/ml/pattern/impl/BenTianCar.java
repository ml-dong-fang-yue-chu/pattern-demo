package com.ml.pattern.impl;

import com.ml.pattern.ICar;

import javax.swing.*;

/**
 * @ClassName BenTianCar
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 13:10
 * @Version 1.0
 */
public class BenTianCar implements ICar {

    @Override
    public void getCar() {
        System.out.println("本田雅阁！");
    }
}
