package com.tiza.leo.a2factory.a201simplefactory;

import com.tiza.leo.a2factory.Pizza;

/**
 * @author leowei
 * @date 2021/12/26  - 22:50
 * 简单工厂
 */
public class SimplePizzaFactory {

    public Pizza CreatePizza(String pizzaType){
        Pizza pizza=null;
        if(pizzaType.equals("cheese")){
            pizza =new CheesePizza();
        }else if(pizzaType.equals("greek")){
            pizza =new GreekPizza();
        }else if(pizzaType.equals("pepper")){
            pizza=new PepperPizza();  //胡椒粉; 甜椒;
        }
        return pizza;
    }

}
