package com.ml.pattern.pay;

import com.ml.pattern.pojo.Order;
import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName PayService
 * @DESC 支付的抽象类
 * @Author ML
 * @Date 2019/4/20 11:10
 * @Version 1.0
 */
public interface PayService {

    //支付
    MLBaseResult<String> payByType(Order order);
}
