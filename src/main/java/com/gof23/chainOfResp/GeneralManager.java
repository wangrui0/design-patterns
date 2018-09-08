package com.gof23.chainOfResp;

public class GeneralManager extends Leader{

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void dealRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<30){
            System.out.println("员工："+leaveRequest.getName()+"请假"+leaveRequest.getLeaveDays()+"天数；原因："+leaveRequest.getReason());
            System.out.println("总经理："+name+"审批通过！！！");
        }else{
            System.out.println("咋滴，你想辞职么？？");
        }
    }

}
