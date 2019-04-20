package com.ml.pattern.pay.support;

import com.ml.pattern.pay.PayService;
import com.ml.pattern.pojo.Order;
import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName AlipayServiceImpl
 * @DESC 微信支付
 * @Author ML
 * @Date 2019/4/20 11:12
 * @Version 1.0
 */
public class WeChatService implements PayService {

    @Override
    public MLBaseResult<String> payByType(Order order) {
        System.out.println("欢迎使用微信支付");
        MLBaseResult result = new MLBaseResult();
        return result;
    }
}
