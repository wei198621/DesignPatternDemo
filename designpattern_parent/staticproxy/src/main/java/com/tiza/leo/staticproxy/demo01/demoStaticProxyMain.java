package com.tiza.leo.staticproxy.demo01;

/**
 * @author leowei
 * @date 2021/12/23  - 23:47
 */
public class demoStaticProxyMain {
    public static void main(String[] args) {
        XiaoFang xiaoFang = new XiaoFang();
        ProxyClass proxyClass = new ProxyClass(xiaoFang);
        proxyClass.find();
    }
}
