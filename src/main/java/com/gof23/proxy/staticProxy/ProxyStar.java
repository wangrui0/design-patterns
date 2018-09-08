package com.gof23.proxy.staticProxy;
/**
 * 静态代理的实现方式：
 * 1：有一个公共的接口共真实角色和代理角色去实现；
 * 2：真实角色和代理角色分别去实现公共接口
 * 3：代理角色采用组合的方式嵌入真实角色，在需要代理的对象的方法上，调用真实的角色
 * @author jack
 *
 */
public class ProxyStar implements Star {
    private Star star;
    public ProxyStar(Star star) {
        super();
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProsyStar.confer");
    }

    @Override
    public void signContact() {
        System.out.println("ProsyStar.signContact");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProsyStar.bookTicket");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProsyStar.collectMoney");

    }

}
