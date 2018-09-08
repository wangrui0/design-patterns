package com.gof23.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试反射和反序列化破解枚举
 * @author jack
 *
 */
public class Client2 {
    public static void main(String[] args) throws Exception {
        SingletonDemo6 instance = SingletonDemo6.getInstance();
        SingletonDemo6 instance2 = SingletonDemo6.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);
        // 采用反射跳过
        // 获取类的注解码文件
        /*
         * Class<SingletonDemo06> clazz
         * =(Class<SingletonDemo06>)Class.forName("gof23.singleton.SingletonDemo06"); //获取构造器
         * Constructor<SingletonDemo06> constructor = clazz.getDeclaredConstructor(); //设置私有变量的可访问性
         * constructor.setAccessible(true); //创建对象 SingletonDemo06 instance3 =
         * constructor.newInstance(); SingletonDemo06 instance4 = constructor.newInstance();
         * System.out.println(instance3); System.out.println(instance4);
         * System.out.println(instance3==instance4);
         */
        // 测试反序列化
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("C://copy//a.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(instance);
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C://copy//a.txt"));
            SingletonDemo6 instance6 = (SingletonDemo6) objectInputStream.readObject();
            System.out.println(instance6);
            System.out.println(instance6 == instance);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
        }
    }
}
