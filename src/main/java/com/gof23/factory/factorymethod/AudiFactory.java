package com.gof23.factory.factorymethod;

public class AudiFactory implements  CarFactory {

    @Override
    public Car createCar() {
        return new Audi();
    }
}
