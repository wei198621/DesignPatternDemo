package com.tiza.leo.staticproxy.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author leowei
 * @date 2021/12/24  - 0:22
 * 第一步：编写动态处理器
 * https://blog.csdn.net/A1342772/article/details/91349142
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前准备 by DynamicProxyHandler.invoke()");
        Object result = method.invoke(object, args);
        System.out.println("买房后装修 by DynamicProxyHandler.invoke()");
        return result;
    }
}
