package com.gof23.observer.b;

import java.util.Observable;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者
        ObserverA a = new ObserverA();
        ObserverA b = new ObserverA();
        ObserverA c = new ObserverA();
        //将观察者添加到目标对象中
        subject.addObserver(a);
        subject.addObserver(b);
        subject.addObserver(c);
        subject.setState(1);
        System.out.println("目标对象，状态改变======");
        System.out.println(a.getSubjectState());
        System.out.println(b.getSubjectState());
        System.out.println(c.getSubjectState());
        subject.setState(2);
        System.out.println("目标对象，状态改变======");
        System.out.println(a.getSubjectState());
        System.out.println(b.getSubjectState());
        System.out.println(c.getSubjectState());
    }
}
