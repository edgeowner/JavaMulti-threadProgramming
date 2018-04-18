package com.multithread.demo.chapter1.ThreaStartAndRun;



/**
 * @author zhangsunny
 * @desc
 */
public class Mythread extends Thread {


    @Override
    public void run() {
        super.run();
        System.out.println("Mythread  Start");
    }

}
