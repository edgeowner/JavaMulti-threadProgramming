package com.multithread.demo.chapter1.ThreadIsNotSafe;

import java.text.MessageFormat;

/**
 * @author zhangsunny
 * @desc 非线程安全LoginServlet
 */
public class LoginServlet {

    private static String username;
    private static String password;

    synchronized public static void doPost(String usernameParam, String passwordParam) {
        try {
            username = usernameParam;
            if (usernameParam.equals("a")) {
                Thread.sleep(5000);
            }
            password = passwordParam;

            System.out.println(MessageFormat.format("username = {0} , password = {1}", username, password));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
