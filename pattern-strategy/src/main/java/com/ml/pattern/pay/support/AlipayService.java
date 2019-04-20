package com.ml.pattern.pay.support;

import com.ml.pattern.pay.PayService;
import com.ml.pattern.pojo.Order;
import com.ml.pattern.util.MLBaseResult;

import java.math.BigDecimal;

/**
 * @ClassName AlipayServiceImpl
 * @DESC 支付宝支付
 * @Author ML
 * @Date 2019/4/20 11:12
 * @Version 1.0
 */
public class AlipayService implements PayService {

    private static final BigDecimal BALANCE = new BigDecimal(100);

    @Override
    public MLBaseResult<String> payByType( Order order) {
        System.out.println("欢迎使用支付宝支付");
        MLBaseResult result = new MLBaseResult();
        return result;
    }
}
