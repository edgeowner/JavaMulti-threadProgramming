package com.multithread.demo.chapter1.ThreadMethod.demo1;

/**
 * @author zhangsunny
 * @desc currentThread()方法Demo
 */
public class CurrentThreadMethodTest {


    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
//        myThread.run();

    }
}
