package com.multithread.demo.chapter1.ThreadIsNotSafe;

/**
 * @author zhangsunny
 * @desc   非线程安全ALogin
 */
public class ALogin extends Thread {


    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }


}
