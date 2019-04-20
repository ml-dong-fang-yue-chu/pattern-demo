package com.ml.pattern;

import com.ml.pattern.pay.PayService;
import com.ml.pattern.pay.support.PayStrategy;
import com.ml.pattern.pojo.Order;
import org.junit.Test;

/**
 * @ClassName Pay
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/20 11:34
 * @Version 1.0
 */
public class Pay {

    @Test
    public void PayService(){

        PayService payService = PayStrategy.getPay("ALIPAY");
        payService.payByType(new Order());
        //jdk Comparator
        //Spring 源码中的Resource类 ；InstantiationStrategy 接口


    }

}
