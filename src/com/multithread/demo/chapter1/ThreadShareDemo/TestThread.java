package com.multithread.demo.chapter1.ThreadShareDemo;


/**
 * @author zhangsunny
 * @desc 测试线程共享Demo
 */
public class TestThread {

    public static void main(String[] args) {
        MyThread myThreadA = new MyThread("A");
        MyThread myThreadB = new MyThread("B");
        MyThread myThreadC = new MyThread("C");
        myThreadA.start();
        myThreadB.start();
        myThreadC.start();



    }
}
