package com.gof23.state;
/**
 * 房间对象，根据房间状态的不同，显示不同的状态，进行不同的操作。
 * @author jack
 *
 */
public class HomeContext {
    //如果是银行系统，这个HomeContext类就是账号。根据金额不同，切换不同的账号。。
    private State state;

    public HomeContext() {
    }
    public HomeContext(State state) {
        super();
        this.state = state;
    }

    public State getState() {
        return state;
    }
    /**
     * 状态模式的核心，修改不同的状态时，调用不同的行为！！！
     * @param state
     */
    public void setState(State state) {
        System.out.println("修改状态为！！！");
        System.out.println("调用不同的行为");
        this.state = state;
        state.handle();
    }
    
}
