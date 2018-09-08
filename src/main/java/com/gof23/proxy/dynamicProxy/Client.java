package com.gof23.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/**
 * 动态代理：
 * （1）真实对象的接口和真实对象
 * （2）创建一个真实对象的处理器，该处理器实现了InvocaitonHandler方法，且采用组合的方式进行使用真实对象
 * （3）真实对象的处理器中invoke方法进行代理操作。
 * （4）使用方式：创建一个真实角色，真实角色的处理器，动态代理对象
 * @author jack
 *
 */
public class Client {
    public static void main(String[] args) {
        Star star = new RealStar();
        InvocationHandler handler = new StarHandler(star);
        Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class<?>[]{Star.class}, handler);
        proxy.sing();
    }
}
