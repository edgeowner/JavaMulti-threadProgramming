package com.multithread.demo.chapter1.ThreadMethod.demo2;

/**
 * @author zhangsunny
 * @desc   currentThread()方法Demo2
 */
public class CountOperate extends Thread {

    public CountOperate() {
        System.out.println("CountOperate 构造函数开始");
        System.out.println("Thread.currentThread.getName()方法获取的是   " + Thread.currentThread().getName());
        System.out.println("this.getName()方法" + this.getName());
        System.out.println("CountOperate 构造函数结束");
        System.out.println("============================");
    }


    @Override
    public void run() {
        System.out.println("run()方法开始");
        System.out.println("Thread.currentThread.getName()方法获取的是      " + Thread.currentThread().getName());
        System.out.println("this.getName()方法" + this.getName());
        System.out.println("run()方法结束");
    }
}
