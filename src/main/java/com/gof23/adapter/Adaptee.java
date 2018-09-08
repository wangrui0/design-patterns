package com.gof23.adapter;
/**
 * 被适配的类
 * 相当于项目中的PS/2键盘
 * @author jack
 */
public class Adaptee {
    public void request(){
        System.out.println("被适配的类,处理客户端的请求！！！");
    }
}
