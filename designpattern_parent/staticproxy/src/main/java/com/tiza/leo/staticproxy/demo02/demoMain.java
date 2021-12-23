package com.tiza.leo.staticproxy.demo02;

/**
 * @author leowei
 * @date 2021/12/24  - 0:15
 */
public class demoMain {
    public static void main(String[] args) {
        BuyHouseImpl buyHouse = new BuyHouseImpl();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }
}
