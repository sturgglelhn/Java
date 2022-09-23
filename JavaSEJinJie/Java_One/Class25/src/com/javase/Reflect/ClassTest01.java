package com.javase.Reflect;

import java.util.Date;

/*
要操作一个类的字节码，需要首先获取到这个类的字节码，怎么获取java.lang.Class实例？
    三种方式
        第一种：Class c = Class.forName("完整类名带包名");
        第二种：Class c = 对象.getClass();
        第三种：Class c = 任务类型.class;
* */
public class ClassTest01 {
    public static void main(String[] args) {
        /*
        Class.forName()
            1、静态方法
            2、方法的参数是一个字符串
            3、字符串需要的是一个完整类名。
            4、完整类名必须带有包名。java.lang包也不能省略
        * */
        // 第一种
        Class c1 = null;
        Class c2 = null;
        Class c3 = null;
        Class c5 = null;
        Class a1 = null;
        Class b1 = null;
        try {
            c1 = Class.forName("java.lang.String");//c1代表String.class文件，或者说c1代表String类型
            c2 = Class.forName("java.util.Date");// c2代表Date类型
            c3 = Class.forName("java.lang.Integer");// c3代表Integer类型
            Class c4 = Class.forName("java.lang.System");// c4代表System类型
            c5 = Class.forName("java.lang.Long");
            a1 = Class.forName("java.lang.Character");
            b1 = Class.forName("java.lang.Boolean");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 第二种
        // java中任务一个对象都有一个方法：getClass()
        // String类型
        String s = "abc";
        Class x =  s.getClass();// x代表String.class字节码文件，x代表String类型。
        String s2 = "abcd";
        Class x1 = s2.getClass();
        System.out.println(c1 == x);// true( == 判断的是对象的内存地址。)

        // Date类型
        Date time = new Date();
        Class y = time.getClass();
        // System.out.println(c2 == y);// true（c2和y两个变量中保存的内存地址都是一样的，都指向方向区中的字节码文件）

        System.out.println("------");
        // Integer 类型
        Integer i = 10;
        Class i2 = i.getClass();
        // System.out.println(c3 == i2);

        // char c6 = '中';
        Character c7 = '中';
        Class c8 = c7.getClass();
        // System.out.println(c8 == a1);

        System.out.println("----");
        Boolean b3 = true;
        Class b4 = b3.getClass();
        System.out.println(b4 == b1);

        // 第三种方式：java语言中任务一种类型，包括基本数据类型，它都有.class属性。
        Class z = String.class;
        Class k = Date.class;
        Class f = int.class;
        Class e = double.class;
        Class l = long.class;
        Class b2 = boolean.class;

        System.out.println(b4 == b2);   //false
        /*System.out.println(z == x); // true
        System.out.println(l == c5);    //false
        */
    }
}
