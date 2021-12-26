package com.tiza.leo.a1singleton;

/**
 * @author leowei
 * @date 2021/12/26  - 23:37
 * 2.1 预加载
 * 顾名思义，就是预先加载。再进一步解释就是还没有使用该单例对象，但是，该单例对象就已经被加载到内存了。
 */
public class PreloadSingleton {
    public static PreloadSingleton instance= new PreloadSingleton();

    private PreloadSingleton(){

    }

    public static PreloadSingleton getInstance(){
        return instance;
    }
}
