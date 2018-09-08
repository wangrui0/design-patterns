package com.gof23.mediator;

public class Finacial  implements Department {
    private Mediator mediator;
    
    public Finacial(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("finacial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("财务部门好好工作，管好公司里面的钱！！");
    }

    @Override
    public void outAction() {
        System.out.println("财务部门 完成发钱的任务了");
    }

}
