package com.gof23.factory.simplefactory;

/**
 * 简单工厂模式(又称为静态工厂模式)：
 * 根据要求，进行创建不同的对象，但是对新增加的产品需要修改代码；
 * @author jack
 *
 */
public class CarFactory {
   public static Car creatAudi(){
       return new Audi();
   }
   public static Car createBYD(){
       return new BYD();
   }
}
