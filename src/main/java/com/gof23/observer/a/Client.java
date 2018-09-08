package com.gof23.observer.a;
/**
 * 观察者模式：
 * 目标对象：
 * 目标对象中含有更改的状态信息，和对应的绑定的观察者集合。当状态改变时，要通知对应的观察者。
 * 观察者（接口+子类）：
 * 当收到目标对象的通知时，做出对应的呢改变。
 * @author jack
 *
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ObserverA a = new ObserverA();
        ObserverA b = new ObserverA();
        ObserverA c = new ObserverA();
        concreteSubject.registerObserver(a);
        concreteSubject.registerObserver(b);
        concreteSubject.registerObserver(c);
        concreteSubject.setState(1);
        System.out.println(a.getSubjectState());
        System.out.println(b.getSubjectState());
        System.out.println(c.getSubjectState());
        System.out.println("============目标对象状态改变");
        System.out.println("============目标对象状态改变");
        concreteSubject.setState(2);
        System.out.println(a.getSubjectState());
        System.out.println(b.getSubjectState());
        System.out.println(c.getSubjectState());
        
    }
}
