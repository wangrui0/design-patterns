package com.gof23.prototype;

import java.util.Date;
/**
 * 进行浅clone时，是以当前对象为原本进行复制不同的对象；为不同的对象；（地址不同，但是里面的内容相同；且当里面含有引用时，复制的是引用的地址。故是浅clone）
 * @author jack
 */
public class Client1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(1232435353453553L);
        Sheep1 sheep1 = new Sheep1("少利", date);
        System.out.println(sheep1);
        System.out.println(sheep1.getName());
        System.out.println(sheep1.getBirthday());
        //进行 浅复制
        Sheep1 sheep2 = (Sheep1)sheep1.clone();
        System.out.println(sheep2);
        System.out.println(sheep2.getName());
        System.out.println(sheep2.getBirthday());
        //浅clone
        date.setTime(22334343434L);
        Sheep1 sheep3 = (Sheep1)sheep1.clone();
        System.out.println(sheep3);
        //下面的值均被改变为：22334343434L
        System.out.println(sheep1.getBirthday());
        System.out.println(sheep2.getBirthday());
        System.out.println(sheep3.getBirthday());
    }
}
