package com.javase.thread.threadsafe3;

public class AccountThread extends Thread{
    // 两个线程必须共享同一个账户对象。
    private Account act;

    // 通过构造方法传递过来账户对象
    public AccountThread(Account act){
        this.act = act;
    }

    public void run(){
        double money = 5000;

        act.withdraw(money);

        System.out.println(Thread.currentThread().getName()+"对" + act.getName() + "取款"+money+"成功，余额" + act.getBalance());
    }
}
