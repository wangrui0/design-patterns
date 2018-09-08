package com.gof23.strategy;

public class OldCustomerMuchStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrices) {
        System.out.println("普通用户大批量");
        return standardPrices*0.9;
    }

}
