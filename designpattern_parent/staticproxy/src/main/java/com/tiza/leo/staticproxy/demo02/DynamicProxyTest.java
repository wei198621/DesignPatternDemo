package com.tiza.leo.staticproxy.demo02;

import java.lang.reflect.Proxy;

/**
 * @author leowei
 * @date 2021/12/24  - 0:26
 *第二步：编写测试类
 * https://blog.csdn.net/A1342772/article/details/91349142
 *
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        BuyHouseImpl buyHouse = new BuyHouseImpl();
        BuyHouse proxyBuyHouse = (BuyHouse)Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        proxyBuyHouse.buyHouse();
    }
}
