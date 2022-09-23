package com.javase.thread.ThreadExercise;

/*
死锁：
    当线程0拿到s1执行s1中的打印语句时,如果线程切换到线程1
    那么线程1拿到了s2锁对象,此时就造成了线程死锁
    线程1想执行s1锁里面的代码执行不了,因为s1在线程0中还没有释放
    那么此时线程1就会切换到线程0
    线程0也不会执行s2锁里面的代码,因为此时s2已经被线程0中的锁拿去了
    还没有释放,因此造成了线程的死锁
    两个都没有释放  都卡住了  线程就卡住了
* */
public class DeadLock {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";

        new Thread(){
            @Override
            public void run() {

                    synchronized (s1){
                        System.out.println(this.getName()+" s1");
                        synchronized (s2){
                            System.out.println(this.getName()+" s2");
                        }
                    }

            }
        }.start();

        new Thread(){
            @Override
            public void run() {

                    synchronized (s2){
                        System.out.println(this.getName()+" s2");
                        synchronized (s1){
                            System.out.println(this.getName()+" s1");
                        }
                    }

            }
        }.start();
    }
}


