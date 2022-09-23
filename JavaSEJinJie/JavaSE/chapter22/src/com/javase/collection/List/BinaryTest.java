package com.javase.collection.List;

/*
位运算符 >>
* */
public class BinaryTest {
    public static void main(String[] args) {
        // >> 1 二进制右移1位
        // >> 2 二进制右移2位
        // 10的二进制位是：00001010  【10】
        // 10的二进制右移1位是：00000101 【5】
        System.out.println(10 >> 1); //右移1位就是除以2

        System.out.println(10 << 1);
        System.out.println(3 >> 1); //1
        System.out.println(3 << 1); //6
    }
}
