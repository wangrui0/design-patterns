package com.gof23.chainOfResp;

public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("张三", 15,"回家探亲！！！");
        Director director = new Director("王主任");
        Manager manager = new Manager("张经理");
        GeneralManager generalManager = new GeneralManager("李总经理");
        DeputyGeneralManager deputyGeneralManager = new DeputyGeneralManager("小李副总经理");
        director.setNextLeader(manager);
        manager.setNextLeader(deputyGeneralManager);
        deputyGeneralManager.setNextLeader(generalManager);
        director.dealRequest(leaveRequest);
        //添加新的情况，只需要添加对象即可。
    }
}
