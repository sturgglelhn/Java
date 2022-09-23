package com.javase.integer;

/*
好消息：在JDK1.5之后，支持自动拆箱和自动装箱了
    自动装箱：基本数据类型自动转换成包装类
    自动拆箱：包装类自动转换成基本数据类型

有了自动拆箱之后，Number类中的方法就用不着了！

自动拆箱和自动装箱有什么好处
    方便编程
* */
public class integerTest05 {
    public static void main(String[] args) {
        //自动装箱
        Integer x = 100;

        //自动拆箱
        int y = x;

        //z是一个引用，z是一个变量，z还是保存了一个对象的内存地址。
        Integer z = 1000;   //等同于：Integer z = new Integer(1000);
        System.out.println(z+1);

        Integer a = 1000;
        Integer b = 1000;
        // ==比较的是对象的内存地址，a和b两个引用中保存的对象内存地址不同。
        System.out.println(a == b); //false
    }
}
