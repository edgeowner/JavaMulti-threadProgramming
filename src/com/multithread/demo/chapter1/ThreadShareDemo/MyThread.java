package com.multithread.demo.chapter1.ThreadShareDemo;


/**
 * @author zhangsunny
 * @dec 测试线程不共享Demo
 */
public class MyThread extends Thread {
    private int count = 10;

    public MyThread(String name) {
        super();
        //设置线程名称
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("线程" + this.currentThread().getName() + "计算，count = " + count);
        }
    }

}
