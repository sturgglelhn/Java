package com.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
异常对象的两个方法：
    String msg = e.getMessage();
    e.printStackTrace();

我们以后查看异常的追踪信息，我们应该怎么看，可以快速的调试程序呢？
    异常信息追踪信息，从上往下一行一行看。
    但是需要注意的是:SUN写的代码就不用看了。主要的问题是出现在自己编写的代码上。
* */
public class ExceptionTest09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            String msg = e.getMessage();
            System.out.println(msg);
            //打印异常堆栈追踪信息！！！
            //在实际的开发中，建议使用这个。养成好习惯！
            e.printStackTrace();
           /* java.io.FileNotFoundException: D:\study\Java\学习方法02.txt (系统找不到指定的文件。)
                at java.base/java.io.FileInputStream.open0(Native Method)
                at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:155)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:110)
                at com.javase.exception.ExceptionTest09.m3(ExceptionTest09.java:29)
                at com.javase.exception.ExceptionTest09.m2(ExceptionTest09.java:25)
                at com.javase.exception.ExceptionTest09.m1(ExceptionTest09.java:21)
                at com.javase.exception.ExceptionTest09.main(ExceptionTest09.java:12)
                因为31行问题导致了27行
                27行出问题导致23行
                23行出问题导致14行。
                先查看27行看（27是错误的根源）
*/
        }

        //这里程序不耽误执行，很健壮。《服务器不会因为遇到异常而宕机》
        System.out.println("服务器不会宕机");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("D:\\study\\Java\\学习方法02.txt");
    }
}
