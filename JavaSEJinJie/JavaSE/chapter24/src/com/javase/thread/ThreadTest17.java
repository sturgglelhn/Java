package com.javase.thread;

/*
public class ThreadTest17 {
    public static void main(String[] args) {
        int i = 0;
        Thread t1 = new Thread(new add(i));
        Thread t2 = new Thread(new odd(i));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class add implements Runnable{
    int i;
    public add(int i){
        this.i = i;
    }

    @Override
    public void run() {
        if(i % 2 == 0){

            System.out.println("t1 ---> " + i);
            //++i;
        }
    }
}


class odd implements Runnable{
    int i;

    public odd(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        if(i % 1 == 0){
            System.out.println("t2 --->" + i);
            //++i;
        }
    }
}
*/

/*
public class ThreadTest17{
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        Thread t1 = new Thread(new add(num));
        Thread t2 = new Thread(new odd(num));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class add extends Thread{
    int[] number;

    public add(int[] number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number){
            for(int i = 0; i<number.length; i++){
                if(number[i] % 2 == 1){
                    System.out.println(Thread.currentThread().getName()+"-->"+number[i]);
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                number.notify();
            }
        }
    }
}

class odd extends Thread{
    int[] number;

    public odd(int[] number){
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number){
            for(int i = 0; i<number.length; i++){
                if(number[i] % 2 == 0){
                    System.out.println(Thread.currentThread().getName()+"-->"+number[i]);
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                number.notify();
            }
        }
    }
}
*/

/*
public class ThreadTest17{
    public static void main(String[] args) {
        int[] number = new int[20];

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < number.length; i++) {
                    if (number[i] % 2== 0){
                        System.out.println(Thread.currentThread().getName()+"-->"+number[i]);
                        try {
                            number.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    number.notify();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < number.length; i++) {
                    if (number[i] % 2 == 1){
                        System.out.println(Thread.currentThread().getName()+"-->"+number[i]);
                        try {
                            number.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    number.notify();
                }
            }
        });

        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
*/

public class ThreadTest17{
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        Thread t1 = new Thread(new add(num));
        Thread t2 = new Thread(new odd(num));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class add extends Thread{
    int[] number;

    public add(int[] number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number){
            for(int i = 0; i<number.length; i++){
                if(number[i] % 2 == 1){
                    System.out.println(Thread.currentThread().getName()+"-->"+number[i]);
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                number.notify();
            }
        }
    }
}

class odd extends Thread{
    int[] number;

    public odd(int[] number){
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number){
            for(int i = 0; i<number.length; i++){
                if(number[i] % 2 == 0){
                    System.out.println(Thread.currentThread().getName()+"-->"+number[i]);
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                number.notify();
            }
        }
    }
}





