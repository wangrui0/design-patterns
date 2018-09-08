package com.gof23.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator president = new President();
        Developer developer = new Developer(president);
        Finacial finacial = new Finacial(president);
        Market market = new Market(president);
        //研发部任务
        developer.selfAction();
        //研发部请求
        developer.outAction();
        //市场部请求
        market.outAction();
        //财务部请求
        finacial.outAction();
    }
}
