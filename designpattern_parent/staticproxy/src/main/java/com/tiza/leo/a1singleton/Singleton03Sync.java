package com.tiza.leo.a1singleton;

/**
 * @author leowei
 * @date 2021/12/26  - 23:36
 * 我们把sychronized加在if(instance==null)判断语句里面，保证instance未实例化的时候才加锁
 */
public class Singleton03Sync {
    private  static Singleton03Sync instance=null;
    private Singleton03Sync(){
    }

    public  static synchronized Singleton03Sync getInstance(){
        if(instance==null){
            synchronized (Singleton03Sync.class){
                if(instance==null){
                    instance =new Singleton03Sync();
                }
            }
        }
        return instance;
    }
}
