package com.zyl.thread;

import java.util.concurrent.locks.LockSupport;

public class TestLockSupport {

    public static void main(String[] args) {

        Thread t0 = new Thread(new Runnable() {

            @Override
            public void run() {
                Thread current = Thread.currentThread();
                System.out.println("开始执行");
                // log.info("{},开始执行!",current.getName());
                for(;;){//spin 自旋
                   // log.info("准备park住当前线程：{}....",current.getName());
                    System.out.println("准备park住当前线程");
                    LockSupport.park();
                    System.out.println("当前线程{}已经被唤醒");
                    //log.info("当前线程{}已经被唤醒....",current.getName());
                }
            }

        },"t0");

        t0.start();

        try {
            Thread.sleep(5000);
            System.out.println("准备唤醒{}线程");
         //  log.info("准备唤醒{}线程!",t0.getName());
            LockSupport.unpark(t0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
