package com.ml.pattern.util;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @ClassName ToString
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/20 10:49
 * @Version 1.0
 */
public class ToString implements Serializable {
    private static final long serialVersionUID = -8053308645059477979L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
