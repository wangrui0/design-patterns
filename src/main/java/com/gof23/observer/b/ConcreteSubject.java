package com.gof23.observer.b;

import java.util.Observable;

/**
 * 目标对象的实例
 * @author jack
 */
public class ConcreteSubject extends Observable{
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;//目标对象的状态发送了改变
        this.setChanged();//表示目标对象已经发送了更改
        this.notifyObservers(state);//通知所有的观察者
    }
}
