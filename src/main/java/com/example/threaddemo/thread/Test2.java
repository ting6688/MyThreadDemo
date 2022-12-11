package com.example.threaddemo.thread;

public class Test2 {

    //    运行结束
//    MyThread
    public static void main(String[] args) {
        MyThread2 t11 = new MyThread2(1);
        MyThread2 t12 = new MyThread2(2);
        MyThread2 t13 = new MyThread2(3);
        MyThread2 t14 = new MyThread2(4);
        MyThread2 t15 = new MyThread2(5);
        MyThread2 t16 = new MyThread2(6);
        MyThread2 t17 = new MyThread2(7);
        MyThread2 t18 = new MyThread2(8);
        MyThread2 t19 = new MyThread2(9);
        MyThread2 t20 = new MyThread2(10);
        MyThread2 t21 = new MyThread2(11);
        MyThread2 t22 = new MyThread2(12);
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
        t20.start();
        t21.start();
        t22.start();
    }


    // 输出结果  执行start方法的顺序不代表线程启动的顺序，线程启动顺序与start()执行顺序无关
//1
//        4
//        3
//        2
//        5
//        6
//        7
//        8
//        9
//        10
//        11
//        12

//    1
//            4
//            2
//            3
//            5
//            6
//            7
//            8
//            9
//            10
//            11
//            12

}
