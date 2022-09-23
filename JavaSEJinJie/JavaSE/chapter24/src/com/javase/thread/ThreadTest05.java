package com.javase.thread;

import javax.sound.midi.Track;

/*
1、怎么获取当前线程对象？
    Thread currentThread = Thread.currentThread();

2、获取线程对象的名字
    String name = 线程对线.getname();

3、修改线程对象的名字
    线程对象.setName("线程名字");

4、当线程没有设置名字的时候，默认的名字有什么规律？（了解一下）
    Thread-0
    Thread-1
    Thread-2
* */
public class ThreadTest05 {
    public static void main(String[] args) {
        // currentThread就是当前线程对象
        // 这个代码出现在main方法当中，所以当前线程就是主线程。
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());    //main

        // 创建线程对象
        MyThread2 t = new MyThread2();
        // 设置线程的名字
        t.setName("t1");
        // 获取线程的名字
        System.out.println(t.getName());  // Thread-0

        MyThread2 t2 = new MyThread2();
        t2.setName("t2");
        System.out.println(t2.getName());
        t2.start();

        t.start();
    }
}

class MyThread2 extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName()+"-->" + i);
            System.out.println(currentThread.getName()+"-->" + i);
        }
    }
}