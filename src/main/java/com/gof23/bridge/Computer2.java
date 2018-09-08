package com.gof23.bridge;
/**
 * 创建电脑父类；父类中采用组合的方式去关联品牌；而且调用品牌的方法
 * 不通类型的电脑实现电脑，并且重写方法
 */
public class Computer2 {
    protected Brand2 brand2;
    public Computer2(Brand2 brand2) {
        super();
        this.brand2 = brand2;
    }
    void sale(){
        brand2.sale();
    }
}
class Desktop2 extends Computer2{
    public Desktop2(Brand2 brand2) {
        super(brand2);
    }
    @Override
    void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}
class Laptop2 extends Computer2{
    public Laptop2(Brand2 brand2) {
        super(brand2);
    }
    @Override
    void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
    
}
class Pad2 extends Computer2{
    public Pad2(Brand2 brand2) {
        super(brand2);
    }
    @Override
    void sale() {
        super.sale();
        System.out.println("销售Pad");
    }
}
