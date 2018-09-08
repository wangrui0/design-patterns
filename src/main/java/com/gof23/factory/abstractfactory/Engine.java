package com.gof23.factory.abstractfactory;

public interface Engine {
    public void run();
    public void start();
}
class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("跑的快");
    }

    @Override
    public void start() {
        System.out.println("启动的快");
    } 
    
}
class LowerEngine implements Engine{

    @Override
    public void run() {
        System.out.println("跑的慢");
    }

    @Override
    public void start() {
        System.out.println("启动的慢");
    } 
    
}
