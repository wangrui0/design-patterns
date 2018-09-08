package com.gof23.decorator;
/**
 * ConcreteDecorator具体装饰角色：
 * 负责给构建对象增加新的功能；
 * @author jack
 *
 */
public class FlyCar extends SuperCar{
    
    public FlyCar(ICar car) {
        super(car);
    }
    public void fly(){
        System.out.println("在天上飞行！！！");
    }
    @Override
    public void move() {
        super.move();
        this.fly();
    }
}
