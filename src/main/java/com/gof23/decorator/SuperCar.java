package com.gof23.decorator;
/**
 * 装饰角色Decorator:
 * 持有一个装饰 对象的引用（采用组合的方式），将客户端的请求转发给真实的对象，这样就能在真实对象的调用中增加新的功能；
 * @author jack
 *
 */
public class SuperCar implements ICar{
    private ICar car;
    public SuperCar(ICar car) {
        super();
        this.car = car;
    }
    @Override
    public void move() {
        car.move();
    }
}
