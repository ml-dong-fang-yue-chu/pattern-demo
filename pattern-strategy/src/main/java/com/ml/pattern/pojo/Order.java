package com.ml.pattern.pojo;

import java.math.BigDecimal;

/**
 * @ClassName Order
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/20 11:26
 * @Version 1.0
 */
public class Order {

    private String id;

    private BigDecimal price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
