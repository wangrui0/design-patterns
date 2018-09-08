package com.gof23.prototype;
/**
 * 不采用clone技术和采用原型模式进行效率测试
 * 如果需要短时间内创建大量的对象，并且new的过程比较耗时。则可以考虑使用原型模式；
 * 不使用clone技术创建对象用时：10376
       使用clone技术创建对象用时：10
 * @author jack
 *
 */
public class Client4 {
    public static void testNew(int size){
        long beginTime=System.currentTimeMillis();
        for(int i=0;i<size;i++){
            LapTop lapTop = new LapTop();  
        }
        long endTime=System.currentTimeMillis();
        System.out.println("不使用clone技术创建对象用时："+(endTime-beginTime));
    }
    public static void testClone(int size) throws CloneNotSupportedException{
        long beginTime=System.currentTimeMillis();
        LapTop lapTop = new LapTop();  
        for(int i=0;i<size;i++){
            LapTop lapTopTemp=(LapTop) lapTop.clone();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用clone技术创建对象用时："+(endTime-beginTime));
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        int size=1000;
        testNew(size);
        testClone(size);
    }
}
class LapTop implements Cloneable{
    public LapTop() {
        try {
            Thread.sleep(10);//模拟创建对象非常耗时
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
