package com.tiza.leo.a1singleton;

/**
 * @author leowei
 * @date 2021/12/26  - 23:36
 * 2.2 懒加载
 * 为了避免内存的浪费，我们可以采用懒加载，即用到该单例对象的时候再创建。
 */
public class Singleton {
    private  static Singleton instance=null;
    private Singleton(){

    }

    public  static Singleton getInstance(){
        if(instance==null){
            instance =new Singleton();
        }
        return instance;
    }
}
