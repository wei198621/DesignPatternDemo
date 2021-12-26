package com.tiza.leo.a2factory.a202factory;

import com.tiza.leo.a2factory.Pizza;

/**
 * @author leowei
 * @date 2021/12/26  - 23:05
 */
public class NYOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new NYPepperPizza();
        }
        return pizza;
    }
}
