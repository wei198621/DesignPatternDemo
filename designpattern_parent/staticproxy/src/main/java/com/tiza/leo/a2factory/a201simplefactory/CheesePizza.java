package com.tiza.leo.a2factory.a201simplefactory;

import com.tiza.leo.a2factory.Pizza;

/**
 * @author leowei
 * @date 2021/12/26  - 22:52
 */
public class CheesePizza implements Pizza {
    @Override
    public void printName() {
        System.out.println("CheesePizza");
    }
}
