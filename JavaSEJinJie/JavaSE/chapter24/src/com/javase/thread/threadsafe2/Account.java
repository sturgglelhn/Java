package com.javase.thread.threadsafe2;

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
    public void withdraw(double money){
        // 以下这几行代码必须是线程排队的，不能并发。
        // 一个线程把这里的代码全部执行结束之后，另一个线程才能进来
        /*
        线程同步机制的语法是：
            synchronized (){
                // 线程同步代码块
            }

            synchronized后面小括号中传的这个“数据”是相当关键的。
            这个数据必须是多线程共享的数据。才能达到多线程排队。

            ()中写什么？
                看需要同步哪些线程
                如果当前有t1,t2,t3,t4,t5，五条线程
                你只希望t1 t2 t3排队，t4,t5不需要排队，怎么办？
                你一定要在()中写一个t1 t2 t3共享的对象，而这个
                对象对于t4 t5来说不是共享的

            这里的共享对象：账户对象
            账户对象是共享的，那么this就是账户对象吧！！！
            比一定是this，这里只要是多线程共享的那个对象就行。
        * */
        //synchronized (obj){
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
