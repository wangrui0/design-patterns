package com.gof23.state;
/**
 * 已经入住状态
 * @author jack
 *
 */
public class CheckedState implements State{

    @Override
    public void handle() {
        System.out.println("已经入住状态！！");
    }

}
