package com.gof23.templateMethod;
/**
 * 模板方法模式
 * @author jack
 *
 */
public abstract class BankTemplateMethod {
    //具体方法
    public void takeNumber() {
        System.out.println("取号排队！！！");
    }
    //抽象方法，具体的子类实现
    public abstract void transact();// 办理具体的业务，钩子方法

    public void evaluate() {
        System.out.println("反馈评分");
    }
    //模板方法，子类只可以继承。不能重写。（由父类定义具体的步骤。）
    public final void process() {
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
