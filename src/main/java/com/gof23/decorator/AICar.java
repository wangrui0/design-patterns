package com.gof23.decorator;
/**
 * ConcreteDecorator具体装饰角色：
 * 负责给构建对象增加新的功能；
 * @author jack
 *
 */
public class AICar extends SuperCar{

    public AICar(ICar car) {
        super(car);
    }
    public void auto(){
        System.out.println("人工智能汽车，自动驾驶");
    }
    @Override
    public void move() {
        super.move();
        this.auto();
    }
}
