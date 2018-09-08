package com.gof23.command;
/**
 * 真正命令的执行者
 * @author jack
 *
 */
public class Receiver {
    public void action(){
        System.out.println("命令的执行者已经接受到命令，正在准备执行。");
    }
}
