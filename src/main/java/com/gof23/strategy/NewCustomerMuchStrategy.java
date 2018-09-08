package com.gof23.strategy;

public class NewCustomerMuchStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrices) {
        System.out.println("老用户大批量");
        return standardPrices*0.8;
    }

}
