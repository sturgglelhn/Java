package com.javase.thread;

/*
如果sleep睡眠太久，如果希望中途叫醒正在睡眠的线程怎么做？
    注意：这个不是终止线程的执行，是终止线程的睡眠。
* */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();

        try {
            t.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 终段t线程的睡眠（这种终断睡眠的方式依靠了java的异常处理机制。）
        t.interrupt();  // 干扰
        //System.out.println(Thread.currentThread().getName());
    }
}

class MyRunnable2 implements Runnable{

    // 重点：run()当中的异常不能throws，只能try catch
    // 因为run()方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常。
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---> begin");
        // 之类重写不能比父类抛出更多的异常，所以只能try/catch，不能Throws
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"---> end");
    }
}