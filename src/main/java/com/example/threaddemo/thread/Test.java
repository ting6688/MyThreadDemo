package com.example.threaddemo.thread;

public class Test {

//    运行结束
//    MyThread
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束");
    }
}
