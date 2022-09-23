package com.javase.Reflect;

/*
研究一下：Class.forName()发生了什么？
    记住，重点：
        如果你只是希望一个类的静态代码块执行，其它代码一律不执行，
        你可以使用：
            Class.forName("完整类名");
        这个方法的执行会导致类加载，类加载时，静态代码块执行。
提示：
    后面JDBC技术的时候我们还需要。
* */
public class ReflectTest03 {
    public static void main(String[] args) {
        try {
            // Class.forName()这个方法的执行会导致：类加载
            Class.forName("com.javase.Reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass{

    // 静态代码块在类加载时执行，并且只执行一次
    static {
        System.out.println("MyClass类执行了");
    }
}
