package com.gof23.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试多线程环境下，创建单例模式的效率
 * @author jack
 *
 */
public class Client3 {
    public static void main(String[] args) throws Exception {
        int threadNum=10;
        final int circleNum=20000000;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        ExecutorService threadPool = Executors.newFixedThreadPool(threadNum);
        long beginTime=System.currentTimeMillis();
        for(int i=0;i<threadNum;i++){
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                      for(int j=0;j<circleNum;j++){
//                          SingletonDemo1 singletonDemo1= SingletonDemo1.getInstance();
//                          SingletonDemo2 singletonDemo2= SingletonDemo2.getInstance();
//                          SingletonDemo3 singletonDemo3= SingletonDemo3.getInstance();
//                          SingletonDemo4 singletonDemo4= SingletonDemo4.getInstance();
                          SingletonDemo5 singletonDemo5= SingletonDemo5.INSTANCE;
                      }
                      countDownLatch.countDown();
//                      System.out.println(countDownLatch.getCount());
                }
            });
        }
        countDownLatch.await();
        long endTime=System.currentTimeMillis();
        System.out.println("时间间隔:"+(endTime-beginTime));
        threadPool.shutdown();
    }
}
