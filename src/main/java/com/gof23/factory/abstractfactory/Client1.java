package com.gof23.factory.abstractfactory;

public class Client1 {
    public static void main(String[] args) {
        LuxuryCarFactory luxuryCarFactory = new LuxuryCarFactory();
        luxuryCarFactory.createEngine().run();
        luxuryCarFactory.createSeat().massage();
        luxuryCarFactory.creatTyre().revlove();
    }
}
