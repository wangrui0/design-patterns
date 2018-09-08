package com.gof23.iterator;
/**
 * 自定义 迭代器 ：
 * （1）自定义 迭代器 接口，含有 基本的迭代操作
 * （2）集合对象，集合里面有容器（list或 set），含有自定义迭代器接口的内部类的实现；
 * @author jack
 *
 */

public class Client {
    public static void main(String[] args) {
        ConcreteMyAggregate aggregate = new ConcreteMyAggregate();
        aggregate.addObj("a");
        aggregate.addObj("b");
        aggregate.addObj("c");
        aggregate.addObj("d");
        MyIterator myIterator = aggregate.createIterator();
        while(myIterator.hasNext()){
            System.out.println(myIterator.getCurrentObj());
            myIterator.next();
        }
        
        
    }
}
