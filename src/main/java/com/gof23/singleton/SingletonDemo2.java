package com.gof23.singleton;
/**
 * 懒汉
 * @author jack
 *
 */
public class SingletonDemo2 {
    //类加载时，不进行初始化该对象，当真正使用时，才进行初始化。
    private static  SingletonDemo2 instance;
    private  SingletonDemo2(){//私有构造器
        
    }
    //方法同步，调用效率低
    public static synchronized SingletonDemo2  getInstance(){
        if(null==instance){
            instance=new  SingletonDemo2();
        }
        return  instance;
    }
}
