package com.example.threaddemo.thread;

public class MyThread2 extends Thread {

    private int i;

    public MyThread2(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
