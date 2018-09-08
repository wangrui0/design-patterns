package com.gof23.bridge;

public class Client2 {
    public static void main(String[] args) {
        //联想台式机
        Computer2 lenvoDesktop = new Desktop2(new Lenvo2());
        lenvoDesktop.sale();
        //dell台式机
        Computer2 dellDesktop = new Desktop2(new Dell2());
        dellDesktop.sale();
        //销售戴尔平板
        Computer2 dellpad = new Pad2(new Dell2());
        dellpad.sale();
    }
}   
