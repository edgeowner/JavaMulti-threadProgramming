package com.multithread.demo.chapter1.ThreadMethod.demo2;

/**
 * @author zhangsunny
 * @desc currentThread()方法Demo2
 */
public class RunTest {

    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        thread.setName("A");
        thread.start();

    }
}
