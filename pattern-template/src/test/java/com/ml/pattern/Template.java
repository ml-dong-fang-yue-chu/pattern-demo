package com.ml.pattern;

import com.ml.pattern.abs.AbstractServiceTemplate;
import com.ml.pattern.service.impl.UserServiceImpl;
import com.ml.pattern.util.MLBaseResult;
import org.junit.Test;

/**
 * @ClassName Template
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/20 13:43
 * @Version 1.0
 */
public class Template {

    @Test
    public void userService(){
        AbstractServiceTemplate serviceTemplate = new UserServiceImpl();
        serviceTemplate.execute();
        // jdk AbstractList

    }
}
