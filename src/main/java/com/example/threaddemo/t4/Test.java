package com.example.threaddemo.t4;

public class Test {
    public static void main(String[] args) {
//        com.example.threaddemo.t4.MyThread a = new com.example.threaddemo.t4.MyThread("A");
//        com.example.threaddemo.t4.MyThread b = new com.example.threaddemo.t4.MyThread("B");
//        com.example.threaddemo.t4.MyThread c = new MyThread("C");
//        com.example.threaddemo.t4.MyThread d = new MyThread("D");
//        com.example.threaddemo.t4.MyThread e = new MyThread("E");
//
//        由 D 计算,count= 4
//        由 E 计算,count= 4
//        由 A 计算,count= 4
//        由 C 计算,count= 4
//        由 B 计算,count= 4

//        a.start();
//        b.start();
//        c.start();
//        d.start();
//        e.start();



        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

        //  run 方法不加 synchronized 关键字多个线程访问同一个变量，会出现线程不安全的问题

//        由 D 计算,count= 1
//        由 A 计算,count= 1
//        由 C 计算,count= 1
//        由 B 计算,count= 1
//        由 E 计算,count= 0

        // run 方法加 synchronized 关键字
//        由 A 计算,count= 4
//        由 E 计算,count= 3
//        由 D 计算,count= 2
//        由 C 计算,count= 1
//        由 B 计算,count= 0






    }
}
