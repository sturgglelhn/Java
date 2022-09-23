package com.javase.thread.ThreadExercise;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(){
            @Override
            public void run() {
                // 开启锁
                lock.lock();
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("诛");
                System.out.println();
                // 释放锁
                lock.unlock();
            }
        }.start();


        new Thread(){
            @Override
            public void run() {
                lock.lock();
                System.out.print("犯");
                System.out.print("我");
                System.out.print("中");
                System.out.print("华");
                System.out.print("者");
                System.out.println();
                lock.unlock();

            }
        }.start();
    }
}
