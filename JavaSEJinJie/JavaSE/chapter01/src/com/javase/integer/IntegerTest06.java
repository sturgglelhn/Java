package com.javase.integer;

/*
这个题目是Integer非常重要的面试题。
* */
public class IntegerTest06 {
    public static void main(String[] args) {
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); //false

        /*
        java中为了提高程序的执行效率，将[-128到127]之间的包装对象提前创建好，
        放到了一个方法区的“整数型常量池”当中了，目的是只要用这个区间的数据不需要
        在new了，直接从整数型常量池当中取出来。

        原理：x变量中保存的对象的内存地址和y变量中保存的对象的内存地址是一样的。
        * */

        Integer a = 127;
        Integer b = 127;

        System.out.println(a == b); //ture
    }
}
