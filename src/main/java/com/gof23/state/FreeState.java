package com.gof23.state;
/**
 * 空闲状态
 * @author jack
 *
 */
public class FreeState implements State{

    @Override
    public void handle() {
        System.out.println("空闲状态！！");
    }

}
