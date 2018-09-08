package com.gof23.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式模式。（如何防止反射和反序列化破解枚举）
 * 
 * @author jack
 *
 */
public class SingletonDemo6  implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -3423017222120593309L;
    // 类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的线程安全。
    private static SingletonDemo6 instance = new SingletonDemo6();// 类初始化时,立即加载；

    private SingletonDemo6() {
        //防止反射
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    public static SingletonDemo6 getInstance() {
        return instance;
    }
    //反序列化时，如果定义了readResolve则直接返回此方法指定的对象。而 不需要单独再创建对象。（单例模式，避免反序列化创建多个对象，则必须加入这个方法）
    private Object readResolve() throws  ObjectStreamException{
        return instance;
    }
}
