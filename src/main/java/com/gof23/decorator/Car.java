package com.gof23.decorator;
/**
 * 真实对象（ConcreteComponent）：
 * 实现对应的功能的接口
 * @author jack
 *
 */
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("汽车在跑！！！");
    }

}
