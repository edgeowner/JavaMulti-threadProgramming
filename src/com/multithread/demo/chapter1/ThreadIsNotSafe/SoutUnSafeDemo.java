package com.multithread.demo.chapter1.ThreadIsNotSafe;

/**
 * @author zhangsunny
 * @desc  i--和sout异常
 */
public class SoutUnSafeDemo {

    public static void main(String[] args) {

        MySoutThread run = new MySoutThread();
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        Thread thread3 = new Thread(run);
        Thread thread4 = new Thread(run);
        Thread thread5 = new Thread(run);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }

}
