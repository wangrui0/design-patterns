package com.gof23.factory.abstractfactory;

public interface Tyre {
    public void revlove();
}
class  LuxuryTyre implements Tyre{

    @Override
    public void revlove() {
        System.out.println("磨损慢！！");
    }
    
}
class  LowerTyre implements Tyre{

    @Override
    public void revlove() {
        System.out.println("磨损快！！");
    }
}
