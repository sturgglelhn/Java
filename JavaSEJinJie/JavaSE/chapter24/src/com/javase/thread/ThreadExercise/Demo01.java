package com.javase.thread.ThreadExercise;

/*
Thread.sleep(睡眠毫秒数);// 让当前线程睡眠（暂时睡眠）
* */
public class Demo01 {
    public static void main(String[] args) {

        // 使用匿名内部类开启1个线程
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    // 当i等于50 的时候让当前线程睡眠1秒钟
                    if(i == 50){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("线程1执行：" + i);
                }
            }
        }.start();


        // 使用匿名内部类开启第2个线程
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("线程2执行："+i);
                }
            }
        }.start();
    }
}
