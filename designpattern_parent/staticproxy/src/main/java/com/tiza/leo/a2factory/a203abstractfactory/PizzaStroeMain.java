package com.tiza.leo.a2factory.a203abstractfactory;

import com.tiza.leo.a2factory.Pizza;

/**
 * @author leowei
 * @date 2021/12/26  - 23:26
 */
public class PizzaStroeMain {
    public static void main(String[] args) {
        AbsFactory factory;
         //读取配置文件
        String strType="";
        if(strType.equals("LD")){
            factory =new LDFactory();
        }else if(strType.equals("NY")){
            factory =new NYFactory();
        }else{
            factory =new LDFactory();  // 默认Ld 生产
        }
        Pizza pizza = factory.CreatePizza("cheese");
        pizza.printName();
    }
}
