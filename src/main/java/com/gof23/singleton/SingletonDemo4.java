package com.gof23.singleton;
/**
 * 静态内部类的方式，创建单例模式
 * 优点：
 * 线程安全，调用效率高，延迟加载
 * @author jack
 *
 */
public class SingletonDemo4 {
    private static class SingleClassInstance{
        private  static final SingletonDemo4 instance=new SingletonDemo4();
    }
    private SingletonDemo4(){
        
    }
    public static SingletonDemo4  getInstance(){
        return SingleClassInstance.instance;
    }
}
