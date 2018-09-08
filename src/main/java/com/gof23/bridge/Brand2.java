package com.gof23.bridge;

/**
 * 使用桥接模式： 创建品牌的接口以及对应的实现类；
 * @author jack
 */
public interface Brand2 {
    void sale();
}
class Lenvo2 implements Brand2 {
    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}
class HuaWei2 implements Brand2 {
    @Override
    public void sale() {
        System.out.println("销售华为电脑");
    }
}
class Dell2 implements Brand2 {
    @Override
    public void sale() {
        System.out.println("销售Dell电脑");
    }
}
