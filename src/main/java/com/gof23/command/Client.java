package com.gof23.command;
/**
 * 命令模式
 * @author jack
 *
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver=new Receiver();//接收者
        Command command=new ConcreteCommand(receiver);//命令
        Invoke invoke = new Invoke(command);//发送者/命令者
        invoke.call();
    }
}
