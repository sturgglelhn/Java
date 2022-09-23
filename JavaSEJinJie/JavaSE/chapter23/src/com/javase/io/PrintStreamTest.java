package com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
java.io.printStream：标准的字节输出流。默认输出到控制台。
* */
public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hello world!");

        PrintStream ps = System.out;
        ps.println("hello zhangsan");
        ps.println("hello lisi");
        ps.println("hello wangwu");


        // 这些是之前System类使用过的方法和属性。
        /*System.gc();
        System.currentTimeMillis();
        PrintStream ps2 = System.out;
        System.exit(0);
        System.arraycopy(...);*/

        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        System.setOut(printStream);
        System.out.println("hello world！");
        System.out.println("hello kitty!");
        System.out.println("hello zhangsan");

    }
}
