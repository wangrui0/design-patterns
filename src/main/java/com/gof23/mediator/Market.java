package com.gof23.mediator;

public class Market  implements Department {
    private Mediator mediator;
    
    public Market(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("市场部门好好工作，为公司找活干！！");
    }

    @Override
    public void outAction() {
        System.out.println("市场部找到新的项目了，需要财务部付押金");
        mediator.command("finacial");
    }

}
