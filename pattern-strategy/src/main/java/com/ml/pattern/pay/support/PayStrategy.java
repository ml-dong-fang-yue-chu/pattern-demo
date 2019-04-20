package com.ml.pattern.pay.support;

import com.ml.pattern.pay.PayService;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PayStrategy
 * @DESC 支付策略类
 * @Author ML
 * @Date 2019/4/20 11:19
 * @Version 1.0
 */
public class PayStrategy {

    //定义支付策略容器
    private static  final Map<String, PayService> strategyMap = new HashMap<String,PayService>();

    private static final String ALIPAY  = "ALIPAY";

    private static final String WECHAT  = "WECHAT";

    private PayStrategy() {

    }
    //初始化策略
    static {
        strategyMap.put(ALIPAY,new AlipayService());
        strategyMap.put(WECHAT,new WeChatService());
    }

    public static PayService getPay(String payType){
        return StringUtils.isEmpty(payType)?strategyMap.get(ALIPAY) : strategyMap.get(payType);
    }
}
