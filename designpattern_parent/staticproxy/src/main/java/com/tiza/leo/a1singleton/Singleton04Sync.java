package com.tiza.leo.a1singleton;

/**
 * @author leowei
 * @date 2021/12/26  - 23:36
 * 我们经过2.3的讨论知道new一个对象的代码是无法保证顺序性的，因此，我们需要使用另一个关键字volatile保证对象实例化过程的顺序性。
 */
public class Singleton04Sync {
    private  static volatile Singleton04Sync instance=null;
    private Singleton04Sync(){
    }

    public  static synchronized Singleton04Sync getInstance(){
        if(instance==null){
            synchronized (Singleton04Sync.class){
                if(instance==null){
                    instance =new Singleton04Sync();
                }
            }
        }
        return instance;
    }
}
