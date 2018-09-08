package com.gof23.proxy.staticProxy;

public class RealStar implements Star {

    @Override
    public void confer() {
        System.out.println("RealStar.confer");
    }

    @Override
    public void signContact() {
        System.out.println("RealStar.signContact");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket");
    }

    @Override
    public void sing() {
        System.out.println("RealStar.sing");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar(周杰伦本人唱歌).collectMoney");
    }
}
