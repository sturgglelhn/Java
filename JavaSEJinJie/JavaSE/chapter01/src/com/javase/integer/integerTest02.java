package com.javase.integer;

/*
8种基本数据类型对应的包装类型名是什么？
    基本数据类型              包装类型
    ---------------------------------------
    byte                    java.lang.Byte
    short                   java.lang.Short
    int                     java.lang.Integer
    long                    java.lang.Long
    float                   java.lang.Float
    double                  java.lang.Double
    boolean                 java.lang.Boolean
    char                    java.lang.Character

2、以上八种包装类中，重点以java.lang.Integer为代表进行学习，其它的类型照葫芦画瓢就行。

3、八种包装类中其中6个都是数字对应的包装类，他们的父类都是Number，可以先研究一下Number中公共的方法：
    Number是一个抽象类，无法实例化对象。
    Number类中有这样的方法：
        byte  byteValue() 返回指定号码作为值 byte ，这可能涉及舍入或截断。
        abstract double  doubleValue() 返回指定数字的值为 double ，可能涉及四舍五入。
        abstract float  floatValue() 返回指定数字的值为 float ，可能涉及四舍五入。
        abstract int  intValue() 返回指定号码作为值 int ，这可能涉及舍入或截断。
        abstract long  ongValue() 返回指定数字的值为 long ，可能涉及四舍五入或截断。
        short  shortValue() 返回指定号码作为值 short ，这可能涉及舍入或截断。

* */

public class integerTest02 {
    public static void main(String[] args) {
        //123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换
        //基本数据类型  -(转换为)-->  引用数据类型（装箱）
        Integer i = new Integer(123);

        //引用数据类型  -(转换为)-->  基本数据类型
        float f = i.floatValue();
        System.out.println(f);  //123.0

        //将引用数据类型  -->  基本数据类型（拆箱）
        int retValue = i.intValue();
        System.out.println(retValue);   //123
    }
}
