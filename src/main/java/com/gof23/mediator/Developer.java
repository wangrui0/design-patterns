package com.gof23.mediator;

public class Developer  implements Department {
    private Mediator mediator;
    
    public Developer(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("developer", this);
    }

    @Override
    public void selfAction() {
        System.out.println("研发部好好工作，干研发，为公司的核心技能做贡献！！");
    }

    @Override
    public void outAction() {
        System.out.println("研发没有工作了，需要市场部，找项目");
        mediator.command("market");
    }

}
