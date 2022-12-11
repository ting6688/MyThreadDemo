package com.example.threaddemo.runnable;

public class Test {

    // 输出---
    // 运行中！
    // 运行结束
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.start();
        System.out.println("运行结束");
    }
}
