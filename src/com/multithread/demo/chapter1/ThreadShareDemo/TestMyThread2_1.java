package com.multithread.demo.chapter1.ThreadShareDemo;

/**
 * @author zhangsunny
 * @desc  测试线程共享Demo（线程同步）
 */
public class TestMyThread2_1 {
    public static void main(String[] args) {
        MyThread2_1 myThread2 = new MyThread2_1();
        Thread a = new Thread(myThread2, "A");
        Thread b = new Thread(myThread2, "B");
        Thread c = new Thread(myThread2, "C");
        Thread d = new Thread(myThread2, "D");
        Thread e = new Thread(myThread2, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }

}
