package com.gof23.prototype;

import java.io.Serializable;
import java.util.Date;
/**
 * 实现浅复制：
 * （1）实现cloneable接口（该接口没有抽象方法，只是一个标记接口）
 * （2）重写Object的clone方法
 * @author jack
 *
 */
public class Sheep1 implements Cloneable ,Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = -7776505897451577294L;
    private String name;
    private Date birthday;
    public Sheep1() {
    }
    public Sheep1(String name, Date birthday) {
        super();
        this.name = name;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
