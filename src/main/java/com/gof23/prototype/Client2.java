package com.gof23.prototype;

import java.util.Date;
/**
 * 进行深clone时，是以当前对象为原本进行复制不同的对象；为不同的对象；（地址不同，但是里面的内容相同；且当里面含有引用时，对引用也进行深Clone。故是浅clone）
 * @author jack
 */
public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(1232435353453553L);
        Sheep2 sheep1 = new Sheep2("少利", date);
        System.out.println(sheep1);
        System.out.println(sheep1.getName());
        System.out.println(sheep1.getBirthday());
        //进行 深clone  此时sheep2的date是一个新的对象；
        Sheep2 sheep2 = (Sheep2)sheep1.clone();//进行深Clone,sheep1的date汇编，但是sheeep2的date不会改变
        date.setTime(22334343434L);
        System.out.println(sheep2);
        System.out.println(sheep2.getName());
        System.out.println(sheep1.getBirthday());
        System.out.println(sheep2.getBirthday());
    }
}
