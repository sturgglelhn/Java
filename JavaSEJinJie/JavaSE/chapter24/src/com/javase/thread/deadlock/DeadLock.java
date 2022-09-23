package com.javase.thread.deadlock;

/*
死锁代码要会写。
一般面试官要求你会写。
只有会写的，才会在以后开发中注意这个事
因为死锁很难调试。
* */
public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        // t1和t2两个线程共享o1,o2
        MyThread1 m1 = new MyThread1(o1,o2);
         MyThread2 m2 = new MyThread2(o1,o2);

         m1.start();
         m2.start();
    }
}

class MyThread1 extends Thread{
    Object o1;
    Object o2;
    public MyThread1(Object o1, Object o2){
        this.o1 = o1;
        this.o2 = o2;
    }
    public void run(){
        synchronized (o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){

            }
        }
    }
}

class MyThread2 extends Thread{
    Object o1;
    Object o2;
    public MyThread2(Object o1, Object o2){
        this.o1 = o1;
        this.o2 = o2;
    }
    public void run(){
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){

            }
        }
    }
}