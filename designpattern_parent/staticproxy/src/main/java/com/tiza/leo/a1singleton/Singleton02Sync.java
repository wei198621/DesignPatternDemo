package com.tiza.leo.a1singleton;

/**
 * @author leowei
 * @date 2021/12/26  - 23:36
 * 我们首先想到的就是使用synchronized关键字。synchronized加载getInstace()函数上确实保证了线程的安全。
 * 但是，如果要经常的调用getInstance()方法，不管有没有初始化实例，都会唤醒和阻塞线程。
 * 为了避免线程的上下文切换消耗大量时间，如果对象已经实例化了，我们没有必要再使用synchronized加锁，
 * 直接返回对象。
 */
public class Singleton02Sync {
    private  static Singleton02Sync instance=null;
    private Singleton02Sync(){

    }

    public  static synchronized  Singleton02Sync getInstance(){
        if(instance==null){
            instance =new Singleton02Sync();
        }
        return instance;
    }
}
