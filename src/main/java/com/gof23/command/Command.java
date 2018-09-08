package com.gof23.command;
/**
 * 命令
 */
public interface Command {
    /**
     * 这个方法是一个一个返回结果为空的方法。
     * 实际项目中可以根据 需求设计多个不同的方法。
     */
    void execute();
}
class ConcreteCommand implements Command{
    private Receiver receiver;//命令的真正的执行者
    
    public ConcreteCommand(Receiver receiver) {
        super();
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("命令执行前进行加工");
        //命令执行前或者执行后，可以执行其他的操作；加工处理
        this.receiver.action();
        System.out.println("命令执行后 的后期处理");
    }
}
