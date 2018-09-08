package com.gof23.strategy;
/**
 * 实现起来比较容易，符合 一般开发人员的思路。
 * 假如类型特别多，算法比较复杂。整个条件语句的代码变的很长，难以维护。
 * 如果有新增加的类型，需要频繁的修改此处的代码。
 * 不符合开闭原则
 * @author jack
 *
 */
public class NoStrategy {
    public static void main(String[] args) {
        
    }
    public double getPrice(String type,double price){
        if(type.equals("普通用户小批量")){
            System.out.println("不打折，原价");
            return price;
        }else if(type.equals("普通用户大批量")){
            System.out.println("打九折");
            return price*0.9;
        }else if(type.equals("老用户小批量")){
            System.out.println("打八五折");
            return price*0.85;
        }else if(type.equals("老用户大批量")){
            System.out.println("打八折");
            return price*0.8;
        }
        return price;
    }
}
