package com.multithread.demo.chapter1.ThreadShareDemo;

/**
 * @author zhangsunny
 * @desc 线程共享操作 (线程同步)
 */
public class MyThread2_1 extends Thread {


    private int count = 10;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("线程" + this.currentThread().getName() + "计算，count = " + count);
    }
}
