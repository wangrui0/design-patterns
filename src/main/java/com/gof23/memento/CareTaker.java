package com.gof23.memento;

/**
 * 负责人类，负责管理备忘录对象。
 * 可以是个对象，或者集合，或者栈
 * @author jack
 *
 */
public class CareTaker {
    
    private EmpMemento empMemento;
//    private List<EmpMemento> list=new ArrayList<EmpMemento>();

    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }
}
