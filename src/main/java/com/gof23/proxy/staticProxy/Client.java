package com.gof23.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        Star star=new RealStar();//真实对象
        ProxyStar proxyStar = new ProxyStar(star);//代理对象
        proxyStar.confer();//代理角色
        proxyStar.signContact();//代理角色
        proxyStar.bookTicket();//代理角色
        proxyStar.sing();//调用真实角色
        proxyStar.collectMoney();//代理角色
    }
}
