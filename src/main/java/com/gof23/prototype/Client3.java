package com.gof23.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
/**
 * 深clone的方式2，不采用Clone方法，而采用序列化和反序列化进行深Clone
 * @author jack
 */
public class Client3 {
    public static void main(String[] args) throws Exception {
        Date date = new Date(1232435353453553L);
        Sheep1 sheep1 = new Sheep1("少利", date);
        System.out.println(sheep1);
        System.out.println(sheep1.getName());
        System.out.println(sheep1.getBirthday());
        //进行 浅复制
//        Sheep1 sheep2 = (Sheep1)sheep1.clone();
        //现将数据写到数组中
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(sheep1);
        byte[] array = baos.toByteArray();//将数据写到数组中
        //从数组中读取数据
        ByteArrayInputStream bais = new ByteArrayInputStream(array);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Sheep1 sheep2 =(Sheep1) ois.readObject();//深Clone数据
        //深clone
        date.setTime(22334343434L);
        System.out.println(sheep2);
        //下面的值均被改变为：22334343434L
        System.out.println(sheep1.getBirthday());
        System.out.println(sheep2.getBirthday());
    }
}
