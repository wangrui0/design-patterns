package com.gof23.chainOfResp;

public class Manager extends Leader{

    public Manager(String name) {
        super(name);
    }

    @Override
    public void dealRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<10){
            System.out.println("员工："+leaveRequest.getName()+"请假"+leaveRequest.getLeaveDays()+"天数；原因："+leaveRequest.getReason());
            System.out.println("经理："+name+"审批通过！！！");
        }else{
            if(this.nextLeader!=null){
                this.nextLeader.dealRequest(leaveRequest);
            }
        }
    }

}
