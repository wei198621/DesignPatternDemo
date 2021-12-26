package com.tiza.leo.a2factory.a202factory;

import com.tiza.leo.a2factory.Pizza;
import org.springframework.core.annotation.Order;

/**
 * @author leowei
 * @date 2021/12/26  - 23:05
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza =new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza =new LDPepperPizza();
        }
        return pizza;
    }
}
