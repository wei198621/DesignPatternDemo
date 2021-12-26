package com.tiza.leo.a2factory.a203abstractfactory;

import com.tiza.leo.a2factory.Pizza;
import com.tiza.leo.a2factory.a202factory.NYCheesePizza;
import com.tiza.leo.a2factory.a202factory.NYPepperPizza;

/**
 * @author leowei
 * @date 2021/12/26  - 23:24
 */
public class NYFactory  implements AbsFactory{
    @Override
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza =new NYCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza =new NYPepperPizza();
        }
        return pizza;
    }
}
