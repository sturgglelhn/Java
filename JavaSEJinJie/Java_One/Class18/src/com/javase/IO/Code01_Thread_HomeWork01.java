package com.javase.IO;

/*
使用线程synchronized同步线程
并且设置wait：释放之前的锁，让线程等待
notify：唤醒等待的线程
* */
/*
public class Code01_Thread_HomeWork01 {
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5,6,7,8,9,10};
        Thread t1 = new Thread(new Add(i));
        Thread t2 = new Thread(new Odd(i));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class Add implements Runnable{
    int[] number;

    public Add() {
    }

    public Add(int[] number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number){
            for(int i=0; i<number.length; i++){
                if(number[i] % 2 == 1){
                    System.out.println(Thread.currentThread().getName() + "-->" + number[i]);
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

class Odd implements Runnable{
    int[] number;

    public Odd(){}

    public Odd(int[] number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number){
            for(int i = 0; i<number.length; i++){
                if(number[i] % 2 == 0){
                    System.out.println(Thread.currentThread().getName() + "-->" + number[i]);
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
}*/


/*
public class Code01_Thread_HomeWork01{
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

class add implements Runnable{
    int[] number;

    public add(int[] number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number){
            for(int i=0; i<number.length;i++){
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

class odd implements Runnable{
    int[] number;

    public odd(int[] number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number){
            for(int i=0; i<number.length;i++){
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


public class Code01_Thread_HomeWork01{
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        Thread t1 = new Thread(new One(num));
        Thread t2 = new Thread(new Two(num));
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}

class One implements Runnable{
    int[] number;
    public One() {
    }

    public One(int[] number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number){
            for(int i = 0; i<number.length ; i++){
                if(number[i] % 2 == 1){
                    System.out.println(Thread.currentThread().getName() + "-->" + number[i]);
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

class Two implements Runnable{
    int[] number;
    public Two() {
    }

    public Two(int[] number) {
        this.number = number;
    }

    @Override
    public void run() {
        for(int i = 0; i<number.length; i++){
            if(number[i] % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "-->" + number[i]);
                try {
                    number.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                number.notify();
            }
        }
    }
}

























