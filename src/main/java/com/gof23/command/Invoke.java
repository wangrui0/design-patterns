package com.gof23.command;
/**
 * 调用者/发起者
 */
public class Invoke {
   /**
   * 调用者调用的命令，也可以通过容器List<Command>容纳很多的对象，进行批处理。
   * 数据库底层的事物操作就是类似的结构。
   */
    private Command command;

    public Invoke(Command command) {
        super();
        this.command = command;
    }
    //业务方法，用于调用命令类的方法
    public void call(){
        this.command.execute();
    }
    
}
