package javase.HomeWorks;

public class ThreadTest01 {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        Thread t1 = new Thread(new One(number));
        Thread t2 = new Thread(new Two(number));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

    }
}

class One implements Runnable{
    int[] num;

    public One(int[] num) {
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (num){
            for(int i = 0; i<num.length; i++){
                if(num[i] % 2 == 0) {
                    System.out.println(Thread.currentThread().getName()+"--->"+num[i]);
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                num.notify();
            }
        }
    }
}

class Two implements Runnable{
    int[] num;

    public Two(int[] num) {
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (num){
            for(int i = 0; i<num.length; i++){
                if(num[i] % 2 == 1){
                    System.out.println(Thread.currentThread().getName()+"--->"+num[i]);
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                num.notify();
            }
        }
    }
}
