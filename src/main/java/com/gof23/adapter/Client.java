package com.gof23.adapter;
/**
 * 客户端类，相当于例子中的笔记本(USB接口 )；
 * @author jack
 *
 */
public class Client {
    public void test(Target t){
        t.handleRequest();
    }
    public static void main(String[] args) {
       /* Client client = new Client();//笔记本（USB）
        Target t=new Adapter1();//适配器（USB-> PS/2）
        client.test(t);*/
        Client client = new Client();//笔记本（USB）
        Adaptee adaptee = new Adaptee();//键盘(PS/2)
        Target t=new Adapter2(adaptee);//适配器（USB-> PS/2）
        client.test(t);

    }
}
