package com.gof23.observer.a;
/**
 * 目标对象对应的实力对象
 * @author jack
 *
 */
public class ConcreteSubject extends Subject{
    private int state;//目标对象对应的状态
    public ConcreteSubject() {
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        //目标对象改变，通知所有的观察者
        this.notifyAllObserver();
    }
}
