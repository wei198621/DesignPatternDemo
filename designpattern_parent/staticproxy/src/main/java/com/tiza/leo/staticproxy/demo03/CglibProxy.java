package com.tiza.leo.staticproxy.demo03;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author leowei
 * @date 2021/12/24  - 0:35
 * 第二步： 生成动态代理类
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    /**
     * 首先将被代理类TargetObject设置成父类，然后设置拦截器TargetInterceptor，最后执行enhancer.create()动态生成一个代理类，并从Object强制转型成父类型TargetObject。
     * @param target
     * @return
     */
  public Object getInstance(final Object target){
      this.target =target;
      Enhancer enhancer = new Enhancer();
      enhancer.setSuperclass(this.target.getClass());
      enhancer.setCallback(this);
      return enhancer.create();
  }


    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("买房前准备");
        Object result = methodProxy.invoke(object, args);
        System.out.println("买房后装修");
        return result;
    }
}
