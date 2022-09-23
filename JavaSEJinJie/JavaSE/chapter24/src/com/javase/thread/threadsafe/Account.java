package com.javase.thread.threadsafe;

/*
银行账户
    不适用线程同步机制，多线程同一账户进行取款，出现线程安全问题。
* */
public class Account {
    private String name;
    private double balance;

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
        // t1和t2并发这个方法....(t1和t2是两个栈，两个栈操作堆中同一个对象。)
        // 获取取款钱的余额
        double before = this.getBalance();

        // 取款之后的余额
        double after = before - money;

        // 在这里模型一下网络延迟
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 更新余额
        // 思考：t1执行到这里了，但还没有来得及执行这行代码，t2线程进来withdraw方法了。此时一定出问题。
        this.setBalance(after);
    }
}
