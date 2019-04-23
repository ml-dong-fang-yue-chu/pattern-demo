package com.ml.pattern.abs;

import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName ServiceTemplate
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/23 21:16
 * @Version 1.0
 */
public interface ServiceTemplate {

    public void execute(MLBaseResult<?> result,ServiceBack serviceBack);
}
