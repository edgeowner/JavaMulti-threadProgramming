package com.multithread.demo.chapter1.ThreadShareDemo;

/**
 * @author  zhangsunny
 * @desc    测试线程共享Demo（线程不安全）
 */

public class MyThread2 extends Thread {

    private int count = 10;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("线程" + this.currentThread().getName() + "计算，count = " + count);
    }
}
