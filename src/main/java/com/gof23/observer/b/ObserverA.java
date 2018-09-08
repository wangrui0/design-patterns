package com.gof23.observer.b;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * @author jack
 *
 */
public class ObserverA implements Observer {
    private int subjectState;
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("aaa"+arg);
        this.subjectState=((ConcreteSubject)o).getState();
    }
    public int getSubjectState() {
        return subjectState;
    }
}
