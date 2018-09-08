package com.gof23.singleton;
/**
 * 饿汉单例模式：
 * 特点：
 * 线程安全（加载类的时候，天然的线程安全的），调用效率高（不需要同步快）
 * @author jack
 *
 */
public class SingletonDemo1 {
    //类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的线程安全。
    private static SingletonDemo1 instance=new SingletonDemo1();//类初始化时,立即加载；
    private SingletonDemo1(){
        
    }
    public static SingletonDemo1 getInstance(){
        return instance;
    }
}
