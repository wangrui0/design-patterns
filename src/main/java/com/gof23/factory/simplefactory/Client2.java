package com.gof23.factory.simplefactory;
/**
 * 测试在没有工程模式的情况下：
 * 你是 一个司机，你需要知道怎么样去创建奥迪车。(但是你只是想使用车，但是需要知道怎么去创建对象，怎样去传递参数)
 * @author jack
 *
 */
public class Client2 {
    public static void main(String[] args) {
        Car car = new Audi();
        Car car2 = new BYD();
        car.run();
        car2.run();
    }
}
