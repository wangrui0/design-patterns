package com.gof23.state;
/**
 * 已经预定状态
 * @author jack
 *
 */
public class BookedState implements State{

    @Override
    public void handle() {
        System.out.println("已经预定状态！！");
    }

}
