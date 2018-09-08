package com.gof23.prototype;

import java.util.Date;
/**
 * 实现深clone：
 * （1）实现cloneable接口（该接口没有抽象方法，只是一个标记接口）
 * （2）重写Object的clone方法
 * (3)对对象里面的引用，也采用clone
 * @author jack
 *
 */
public class Sheep2 implements Cloneable {
    private String name;
    private Date birthday;
    public Sheep2() {
    }
    public Sheep2(String name, Date birthday) {
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
        Object clone = super.clone();//Clone出另外的一个对象,每次clone出的对象都是不一样的
        Sheep2 sheep=(Sheep2)clone;
        sheep.setBirthday((Date)this.birthday.clone());//对对象里面的引用进行clone
        return sheep;
    }
}
