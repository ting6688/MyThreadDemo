package com.example.threaddemo.t3;

public class MyThread extends Thread{
    private int count = 5;
    public MyThread(String name){
        super();
        // 设置线程名称
        this.setName(name);
    }

    public void run(){
        super.run();
        while(count > 0){
            count --;
            // 此示例不要用for语句，因为使用同步后其它线程就得不到运行的机会了，一直由一个线程进行减法运算
            System.out.println(" 由 " + this.currentThread().getName() + " 计算,count= "+ count);
        }
    }

    // 输出结果，线程不共享变量，每个线程都有各自的count变量，自己减少自己count变量的值
//    由 B 计算,count= 4
//    由 C 计算,count= 4
//    由 A 计算,count= 4
//    由 C 计算,count= 3
//    由 B 计算,count= 3
//    由 C 计算,count= 2
//    由 A 计算,count= 3
//    由 A 计算,count= 2
//    由 A 计算,count= 1
//    由 C 计算,count= 1
//    由 B 计算,count= 2
//    由 B 计算,count= 1
//    由 C 计算,count= 0
}
