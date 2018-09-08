package com.gof23.strategy;

public class NewCustomerFewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrices) {
        System.out.println("普通用户小批量");
        return standardPrices;
    }

}
