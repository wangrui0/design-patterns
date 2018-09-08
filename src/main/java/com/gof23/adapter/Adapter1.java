package com.gof23.adapter;
/**
 * 适配器，相当于USB-->PS/2接口（类适配器的方式）
 * @author jack
 *
 */
public class Adapter1 extends Adaptee implements Target{

    @Override
    public void handleRequest() {
        super.request();
    }
}
