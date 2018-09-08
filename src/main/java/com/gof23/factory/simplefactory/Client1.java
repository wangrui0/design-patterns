package com.gof23.factory.simplefactory;
/**
 * 简单工厂模式：
 * 简单工厂模式，怎么样创建对象，由工厂 决定，而 调用者只需要知道创建什么对象就可以啦。
 * @author jack
 *
 */
public class Client1 {
    public static void main(String[] args) {
       Car audi = CarFactory2.createCar("奥迪");//要一个奥迪对象
       Car byd = CarFactory2.createCar("比亚迪");//要一个比亚迪对象
       audi.run();
       byd.run();
       Car audi2 = CarFactory.creatAudi();
       Car byd2 = CarFactory.createBYD();
       audi2.run();
       byd2.run();
    }
}
