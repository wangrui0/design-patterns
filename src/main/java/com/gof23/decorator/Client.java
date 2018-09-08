package com.gof23.decorator;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("增加新的功能，可以飞");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("增加新的功能，可以自动驾驶");
        AICar aiCar = new AICar(car);
        aiCar.move();
        System.out.println("增加新的功能，可以飞，可以自动驾驶");
        ICar iCar = new AICar(new FlyCar(new Car()));
        iCar.move();
    }
}
