package com.ml.pattern.util;

import com.ml.pattern.excepion.MLException;
import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName ParametersCheck
 * @DESC 参数校验工具类
 * @Author ML
 * @Date 2019/4/23 21:21
 * @Version 1.0
 */
public class ParametersCheck {

    public static MLException isEmpty(String param,String message){
        if(StringUtils.isEmpty(param)){
            return new MLException(message,param);
        }
        return null;
    }
}
