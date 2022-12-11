package com.example.threaddemo.t4;

public class MyThread extends Thread {
    private int count = 5;
//    public MyThread(String name){
//        super();
//        // 设置线程名称
//        this.setName(name);
//    }

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println(" 由 " + this.currentThread().getName() + " 计算,count= " + count);

    }
}
