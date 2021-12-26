package com.tiza.leo.a2factory.a202factory;

import com.tiza.leo.a2factory.Pizza;

/**
 * @author leowei
 * @date 2021/12/26  - 23:04
 */
public abstract class OrderPizza {
    abstract Pizza createPizza(String orderType);
}
