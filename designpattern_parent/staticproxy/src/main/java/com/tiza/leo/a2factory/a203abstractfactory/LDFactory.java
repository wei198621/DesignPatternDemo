package com.tiza.leo.a2factory.a203abstractfactory;

import com.tiza.leo.a2factory.Pizza;
import com.tiza.leo.a2factory.a202factory.LDCheesePizza;
import com.tiza.leo.a2factory.a202factory.LDPepperPizza;

/**
 * @author leowei
 * @date 2021/12/26  - 23:22
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza =new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza =new LDPepperPizza();
        }
        return pizza;
    }
}
