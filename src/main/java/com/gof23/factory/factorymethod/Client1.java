package com.gof23.factory.factorymethod;
/**
 * 工厂方法模式：
 * （1）有一个工厂接口
 * （2）有几个对象，就 有几个对应的工厂接口的实现；每个 工厂接口的实现对应的创建该对象
 * 故符合ocp原则，也就是开闭原则；
 * @author jack
 *
 */
public class Client1 {
    public static void main(String[] args) {
        CarFactory audiFactory = new AudiFactory();
        Car audi = audiFactory.createCar();
        audi.run();
        CarFactory bydFactory = new BYDFactory();
        Car byd = bydFactory.createCar();
        byd.run();
    }
}
