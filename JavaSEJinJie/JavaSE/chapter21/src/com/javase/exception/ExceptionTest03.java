package com.javase.exception;

public class ExceptionTest03 {
    public static void main(String[] args) {
        /*
        程序执行到此处发生了ArithmeticException异常，
        * */
        System.out.println(100/0);

        //没有输出
        System.out.println("Hello World!");
    }
}
