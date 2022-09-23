package com.javase.thread.ThreadExercise;

/*
使用synchronized同步
* */
public class Demo03 {
    public static void main(String[] args) {
        Shower s = new Shower();

        new Thread(){
            @Override
            public void run() {

                    s.show();

            }
        }.start();

        new Thread(){
            @Override
            public void run() {

                    s.show2();

            }
        }.start();
    }
}

class Shower{
    // 非静态同步方法的锁对象默认是this
    public synchronized void show(){
       // for (int i = 0; i < 5; i++) {
            System.out.print("犯");
            System.out.print("我");
            System.out.print("中");
            System.out.print("华");
            System.out.print("者");
            System.out.println();
        //}

    }

    public void show2(){
        // 使用this锁也能够保证代码同步
        //for (int i = 0; i < 5; i++) {
            synchronized (this) {
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("诛");
                System.out.println();
            }
        //}

    }
}
