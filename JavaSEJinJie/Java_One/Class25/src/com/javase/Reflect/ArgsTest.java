package com.javase.Reflect;

/*
可变长度参数
    int... args 这就是可变长度参数
    语法是：类型...   (注意：一定是3个点。)

    1、可变长度参数要求的参数个数是：0~N个。
    2、可变长度参数的参数列表中必须在最后一个位置上，而且可变长度参数只能有1个。
    3、可变长度可以当做一个数组来看待

* */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,20);

        m2(100);
        m2(200,"abc","deg");
        m2(200,"abc","deg","zhy");

        m3("ab","bsd","dfe","fii");

        m3("我","是","中","国","人");
    }

    public static void m(int... args){
        System.out.println("m方法执行了！");
    }

    //可变长度只能出现在最后，只能有一个
    public static void m2(int a, String... args1){

    }

    public static void m3(String... args){
        // args有length属性，说明args是一个数组！
        // 可以将可变长度参数当作一个数组来看。
        for(int i = 0; i< args.length; i++){
            System.out.println(args[i]);
        }
    }
}
