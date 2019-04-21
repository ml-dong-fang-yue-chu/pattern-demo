package com.ml.pattern.decorator;

import com.ml.pattern.ICar;
import com.ml.pattern.impl.BenTianCar;
import com.ml.pattern.impl.FengTianCar;

/**
 * @ClassName CarDecorator
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 13:14
 * @Version 1.0
 */
public  class ColorCarDecorator extends CarDecorator {


    public ColorCarDecorator(ICar car) {
        super(car);
    }

    @Override
    public void getCar() {
        super.carDecorator.getCar();
        setColor(super.carDecorator);
    }

    private  void setColor(ICar carDecorator){
        System.out.println("白色的颜色！");
        /*if(carDecorator instanceof BenTianCar){
            System.out.println("白色的颜色！");
        }else if(carDecorator instanceof FengTianCar){
            System.out.println("银色的颜色！");
        }else{
            System.out.println("黑色的颜色！");
        }*/

    }


}
