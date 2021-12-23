package com.tiza.leo.staticproxy.demo03;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;

/**
 * @author leowei
 * @date 2021/12/24  - 0:32
 * 第一步：建立拦截器
 */
public class intercept   {

    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("买房前准备");
        Object result = methodProxy.invoke(object, args);
        System.out.println("买房后装修");
        return result;
    }
}
