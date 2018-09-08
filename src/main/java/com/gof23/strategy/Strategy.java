package com.gof23.strategy;
/**
 * 策略模式：是一个策略簇的概念；
 * 由接口，和针对不同的算法定义的不同的策略子类。
 * @author jack
 *
 */
public interface Strategy {
    double getPrice(double standardPrices);
}
