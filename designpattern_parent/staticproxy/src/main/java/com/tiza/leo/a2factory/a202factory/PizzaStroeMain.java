package com.tiza.leo.a2factory.a202factory;

import com.tiza.leo.a2factory.Pizza;

/**
 * @author leowei
 * @date 2021/12/26  - 23:12
 */
public class PizzaStroeMain {
    public static void main(String[] args) {
        OrderPizza orderPizza;
        orderPizza= new NYOrderPizza();
        Pizza pizza = orderPizza.createPizza("cheese");
        if(pizza!=null){
            pizza.printName();
        }else {
            System.out.println("没有实例化成功");
        }
    }
}
