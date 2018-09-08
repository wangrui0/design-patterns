package com.gof23.factory.factorymethod;

public class BYDFactory implements  CarFactory {

    @Override
    public Car createCar() {
        return new BYD();
    }
}
