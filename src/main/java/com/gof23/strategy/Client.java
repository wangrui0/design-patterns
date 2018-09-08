package com.gof23.strategy;

public class Client {
    public static void main(String[] args) {
        //选择某种策略
        Strategy strategy = new NewCustomerFewStrategy();
        Context context = new Context(strategy);//用户和策略簇分离开，方便后期的扩展操作。
        context.printPrice(20);
        strategy =new NewCustomerMuchStrategy();
        context = new Context(strategy);
        context.printPrice(20);
        strategy =new OldCustomerFewStrategy();
        context = new Context(strategy);
        context.printPrice(20);

    }
}
