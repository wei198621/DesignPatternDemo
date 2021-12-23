package com.tiza.leo.staticproxy.demo02;

/**
 * @author leowei
 * @date 2021/12/24  - 0:13
 */
public class BuyHouseProxy implements  BuyHouse {

    private BuyHouse buyHouse;

    public BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }



    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        this.buyHouse.buyHouse();
        System.out.println("买房后装修");

    }
}
