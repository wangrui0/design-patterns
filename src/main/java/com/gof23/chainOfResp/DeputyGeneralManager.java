package com.gof23.chainOfResp;

public class DeputyGeneralManager extends Leader{

    public DeputyGeneralManager(String name) {
        super(name);
    }

    @Override
    public void dealRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<20){
            System.out.println("员工："+leaveRequest.getName()+"请假"+leaveRequest.getLeaveDays()+"天数；原因："+leaveRequest.getReason());
            System.out.println("副总经理："+name+"审批通过！！！");
        }else{
            if(this.nextLeader!=null){
                this.nextLeader.dealRequest(leaveRequest);
            }
        }
    }

}
