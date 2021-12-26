package com.tiza.leo.staticproxy.demo01;

/**
 * @author leowei
 * @date 2021/12/23  - 23:42
 *
 * 被代理类： 实现接口方法
 * 代理类：  同被代理类一样，都要实现接口的方法，构造函数传入接口类型的值
 */
public class ProxyClass implements FindHouse {

    private FindHouse findHouse;
    public ProxyClass(FindHouse findHouse){
        this.findHouse= findHouse;
    }


    @Override
    public void find() {
        System.out.println(" ProxyClass.find() ----------中介正在努力帮你找房子");
        this.findHouse.find();
        System.out.println("ProxyClass.find() 可以装修了");
    }
}
