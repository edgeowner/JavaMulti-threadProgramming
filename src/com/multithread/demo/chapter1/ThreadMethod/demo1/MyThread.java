package com.multithread.demo.chapter1.ThreadMethod.demo1;

/**
 * @author zhangsunny
 * @desc currentThread()方法Demo
 */
public class MyThread extends Thread {

    public MyThread() {

        System.out.println("构造函数打印标记：" + Thread.currentThread().getName());

    }

    @Override
    public void run() {
        System.out.println("重写run()方法打印：" + Thread.currentThread().getName());
    }
}

