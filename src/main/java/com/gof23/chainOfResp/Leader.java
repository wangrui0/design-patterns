package com.gof23.chainOfResp;
/**
 * 抽象类：
 * @author jack
 *
 */
public abstract class Leader {
    protected String name;//姓名
    protected Leader nextLeader;//责任链上的后继对象
    public Leader(String name) {
        super();
        this.name = name;
    }
    /**
     * 处理请求的核心业务方法
     * @param leaveRequest
     */
    public abstract void dealRequest(LeaveRequest leaveRequest);
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }
}
