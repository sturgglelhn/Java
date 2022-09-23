package com.javase.thread.ThreadExercise;

public class Demo02 {
    public static void main(String[] args) {
        // 创建线程1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("线程1：" + i);

                }
            }
        });

        // 创建线程2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("线程2：" + i);
                    if(i == 500){
                        try {
                            t1.join(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        t1.start();

        t2.start();


    }
}
