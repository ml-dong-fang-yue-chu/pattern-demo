package com.ml.factory.staticFactory;

import com.ml.factory.IHondaCar;

/**
 * @ClassName StaticFactory
 * @DESC 本田静态工厂
 * @Author 蒙林
 * @Date 2019/4/11 21:41
 * @Version 1.0
 */
public class StaticFactory {
        /*
            public IHondaCar getCar(String name){
                if("雅阁".equals(name)){
                    return new YaGeCar();
                }else if("思域".equals(name)){
                    return new SiYuCar();
                }else{
                    return null;
                }
            }*/
        public IHondaCar getCar(String className){
            try {
                return  (IHondaCar)Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        public IHondaCar getCar(Class<?> clazz){
            /*    return  (IHondaCar)clazz.newInstance();*/
            return  getCar(clazz.getName());
        }
    }

