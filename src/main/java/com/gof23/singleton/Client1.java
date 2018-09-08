package com.gof23.singleton;

public class Client1 {
    public static void main(String[] args) {
        SingletonDemo1 instance = SingletonDemo1.getInstance();
        SingletonDemo1 instance2 = SingletonDemo1.getInstance();
        System.out.println(instance==instance2);
    }
}
