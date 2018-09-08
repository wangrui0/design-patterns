package com.gof23.chainOfResp;

public class Director extends Leader{

    public Director(String name) {
        super(name);
    }

    @Override
    public void dealRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<3){
            System.out.println("员工："+leaveRequest.getName()+"请假"+leaveRequest.getLeaveDays()+"天数；原因："+leaveRequest.getReason());
            System.out.println("主任："+name+"审批通过！！！");
        }else{
            if(this.nextLeader!=null){
                this.nextLeader.dealRequest(leaveRequest);
            }
        }
    }

}
