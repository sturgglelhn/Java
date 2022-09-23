package com.javase.date;

/*
获取自1970年1月1日 00:00:00 000当前系统时间的总毫秒数。
1秒 = 1000毫秒
* */
public class DateTime02 {
    public static void main(String[] args) {
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis); //1650460021085

        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("耗费时长"+(end - begin)+"毫秒");
    }

    public static void print(){
        for (int i = 0; i < 1000000000; i++) {
            //System.out.println("i = " + i);
        }
    }
}
