package com.ml.pattern.decorator;

import com.ml.pattern.ICar;

/**
 * @ClassName CarDecorator
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 13:14
 * @Version 1.0
 */
public abstract class CarDecorator implements ICar {

    protected ICar carDecorator;

    public CarDecorator(ICar car) {
        this.carDecorator = car;
    }

    @Override
    public void getCar() {
        this.carDecorator.getCar();
    }
}
