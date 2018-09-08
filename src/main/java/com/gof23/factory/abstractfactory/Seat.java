package com.gof23.factory.abstractfactory;

public interface Seat {
    public void massage();
}
class LuxurySeat implements Seat{

    @Override
    public void massage() {
           System.out.println("可以按摩的座椅");
    }
    
}
class LowerSeat implements Seat{

    @Override
    public void massage() {
           System.out.println("不能按摩的座椅");
    }
    
}