package com.gof23.observer.a;

import java.util.ArrayList;
import java.util.List;
/**
 * 目标对象
 * @author jack
 *
 */
public class Subject {
    //该目标对象，对应的观察者的集合
    protected List<Observer> list=new ArrayList<Observer>();
    //添加观察者
    public boolean registerObserver(Observer observer){
        return list.add(observer);
    }
    //删除观察者
    public boolean removeObserver(Observer observer){
        return list.remove(observer);
    }
    //通知所有的观察者,更新对应的状态
    public void notifyAllObserver(){
        for (Observer observer : list) {
            observer.update(this);
        }
    }
}
