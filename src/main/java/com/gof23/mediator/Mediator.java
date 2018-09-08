package com.gof23.mediator;
/**
 * 中介者接口
 * @author jack
 *
 */
public interface Mediator {
    /**
     * 各个部门进行注册
     */
    void register(String dname, Department department);
    /**
     * 各个部门向中介的请求（也就是让中介干什么）
     */
    void command(String dname);
}
