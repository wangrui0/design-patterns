package com.gof23.strategy;

public class OldCustomerFewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrices) {
        System.out.println("老用户小批量");
        return standardPrices*0.85;
    }

}
