package com.javase.thread.threadsafe3;

/*
银行账户
    不适用线程同步机制，多线程同一账户进行取款，出现线程安全问题。
* */
public class Account {
    private String name;
    private double balance;

    Object obj = new Object();

    public Account() {
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 取款的方法
    public synchronized void withdraw(double money){
        //synchronized (this){
            double before = this.getBalance();
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        //}
    }
}
