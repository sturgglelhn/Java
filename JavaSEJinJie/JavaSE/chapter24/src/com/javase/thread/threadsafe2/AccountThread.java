package com.javase.thread.threadsafe2;

public class AccountThread extends Thread{
    // 两个线程必须共享同一个账户对象。
    private Account act;

    // 通过构造方法传递过来账户对象
    public AccountThread(Account act){
        this.act = act;
    }

    public void run(){
        // run方法的执行表示取款操作。
        double money = 5000;

        // 这里不能写this，写this代表AccountThread被new了两次，有两个内存地址，不属于共享，所以操作的是两个不同的两个对象
        //synchronized (this){

        synchronized (act){
            act.withdraw(money);
        }
        System.out.println(Thread.currentThread().getName()+"对" + act.getName() + "取款"+money+"成功，余额" + act.getBalance());
    }
}
