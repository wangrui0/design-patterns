package com.gof23.mediator;

public interface Department {
    void selfAction();//本部门的事情
    void outAction();//向其他部门发出的命令 
}
