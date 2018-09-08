package com.gof23.singleton;
/**
 * 通过枚举方式实现单例
 * 注意:枚举本身就是单例,由jvm根本保证!避免通过反射和反序列化的漏洞
 * 本身 是线程安全的，而且调用效率也高
 * 但是没有延迟加载，
 * @author jack
 *
 */
public enum SingletonDemo5 {
    /**
     * 定义一个枚举元素，他代表了一个 实例
     */
    INSTANCE;
    /**
     * 单例可以有自己的操作
     */
    public  void singletonOperation(){
        //功能处理
    }
    public static void main(String[] args) {
        SingletonDemo5 instance = SingletonDemo5.INSTANCE;
        SingletonDemo5 instance2 = SingletonDemo5.INSTANCE;
        System.out.println(instance==instance2);//true
    }
}
