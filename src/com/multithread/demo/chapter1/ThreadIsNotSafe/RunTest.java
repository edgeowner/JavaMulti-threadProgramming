package com.multithread.demo.chapter1.ThreadIsNotSafe;


/**
 * @author zhangsunny
 * @desc   非线程安全Demo测试
 */
public class RunTest {

    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        aLogin.start();
        BLogin bLogin = new BLogin();
        bLogin.start();
    }
}
