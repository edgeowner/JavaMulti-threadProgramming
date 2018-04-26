package com.multithread.demo.chapter1.ThreadIsNotSafe;

import java.text.MessageFormat;

/**
 * @author zhangsunny
 */
public class MySoutThread extends Thread {

    private int i = 5;

    @Override
    public void run() {
        //println()方法在内部是同步的，但i--的操作却是在进入println()之前发生的，
        // 所以有发生非线程安全问题的概率
        System.out.println(MessageFormat.format("i = {0}  ,  threadName = {1}", i--, Thread.currentThread().getName()));

    }

}
