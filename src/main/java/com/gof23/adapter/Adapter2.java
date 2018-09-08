package com.gof23.adapter;
/**
 * 组合方式的适配器(因为java是的单继承，多实现)
 * @author jack
 *
 */
public class Adapter2  implements Target{
    private Adaptee adaptee;
    public Adapter2(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }
    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
