package com.example.threaddemo.thread;

public class Test1 {

    //    运行结束
//    MyThread
    public static void main(String[] args) {
        try {
            MyThread1 myThread = new MyThread1();
            myThread.setName("myThread");
            // 通知线程规划器线程已经准备就绪，让系统安排一个时间来调用线程对象的run方法
            myThread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    // 输出结果  线程执行具有随机性
//    main=main
//            main=main
//    run=myThread
//            main=main
//    run=myThread
//            main=main
//    main=main
//            run=myThread
//    run=myThread
//            main=main
//    run=myThread
//            main=main
//    main=main
//            run=myThread
//    run=myThread
//            main=main
//    run=myThread
//            main=main
//    run=myThread
//            run=myThread

}
