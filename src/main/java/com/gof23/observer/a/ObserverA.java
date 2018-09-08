package com.gof23.observer.a;

public class ObserverA implements Observer{
    private int subjectState;

    public int getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(int subjectState) {
        this.subjectState = subjectState;
    }

    @Override
    public void update(Subject subject) {
        this.subjectState=((ConcreteSubject)subject).getState();
    }
}
