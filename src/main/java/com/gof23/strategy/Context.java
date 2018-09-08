package com.gof23.strategy;
/**
 * 负责和具体的对象交互
 * 这样的话，具体的算法和直接的客户端调用分离了，使得算法可以独立于客户端独立的变化
 *如果使用了spring的依赖注入功能，还可以通过配置文件，动态的注入不同的策略对象，动态的切换不同的算法
 */
public class Context {
    
    private Strategy strategy;//当前采用的算法对象
    //可以通过构造器来注入
    public Context(Strategy strategy) {
        super();
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }
    //可以通过set方法来注入
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void printPrice(double price){
        System.out.println("您报价为："+strategy.getPrice(price));
        
    }
}
