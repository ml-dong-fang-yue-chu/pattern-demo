package com.ml.factory.methodFactory;

import com.ml.factory.IHondaCar;
import com.ml.factory.YaGeCar;

/**
 * @ClassName YaGeCarFactory
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/11 21:48
 * @Version 1.0
 */
public class YaGeCarFactory implements ICarFactory {
    @Override
    public IHondaCar getCar() {
        return new YaGeCar();
    }
}
