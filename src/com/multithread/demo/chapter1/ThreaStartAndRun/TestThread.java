package com.multithread.demo.chapter1.ThreaStartAndRun;

/**
 * @author zhangsunny
 * @desc run()和 start()方法区别
 */
public class TestThread {

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
//        mythread.start();
        mythread.run();
        System.out.println("Main Thread Over!");
    }
}
