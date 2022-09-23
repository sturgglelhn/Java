package com.javase.thread;

/*
怎么合理的终止一个线程的执行。这种方式是很常用的。
* */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        try {
            t.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        r.run = false;

    }
}

class MyRunnable4 implements Runnable{
    // 打一个布尔标签
    boolean run = true;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(run) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                // 终止当前线程
                return;
            }
        }
    }
}
