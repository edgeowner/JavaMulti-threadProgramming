package com.multithread.demo.chapter1.ThreadIsNotSafe;


/**
 * @author zhangsunny
 * @desc   非线程安全BLogin
 */
public class BLogin extends Thread {

    @Override
    public void run() {

        LoginServlet.doPost("b","bb");

    }
}
