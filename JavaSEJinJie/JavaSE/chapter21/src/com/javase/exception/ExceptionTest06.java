package com.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
处理异常的第一种方式：
    在方法声明的位置上使用throws关键字抛出，谁调用我这个方法，我就抛给谁。抛给调用来处理
    这种处理异常的态度：上报
处理异常的第二种方式：
    使用try...catch语句对异常进行捕捉
    这个异常不会上报，自己把这个事儿处理了。
    异常抛到此处位置，不再上抛了

注意：
    只要异常没有捕捉，采用上报的方式，此方法的后续代码不会执行。
    另外需要注意，try语句块中的某一行出现异常，该行后面的代码不会执行。
    try...catch捕捉异常之后，后续代码可以执行。

* */
public class ExceptionTest06 {
    public static void main(String[] args) {
        //100/0这个是算术异常，这个异常是运行时异常，你在编译阶段，可以处理，也可以不处理。编译器不管。
        //也可以处理，也可以不处理
        /*try{
            System.out.println(100/0);
        }catch (ArithmeticException e){
            System.out.println("算术异常了！！！");
        }*/
        System.out.println("main begin");
        try {
            m1();
            //以上代码出现异常，直接进入catch语句块中执行
            System.out.println("Hello World!");
        } catch (IOException e) {
            System.out.println("文件不存在，可以路径错误，也可能文件被删除了！");
            System.out.println(e);//java.io.FileNotFoundException: D:\study\Java\学习方法1.txt (系统找不到指定的文件。)

        }
        System.out.println("main over");
    }

    private static void m1() throws IOException {
        System.out.println("m1 begin!");
        //使用try...catch来自己解决，没有上抛throws
        /*try {
            m2();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        m2();
        System.out.println("m1 over!");

    }

    //抛别的异常不行
    //抛IOException可以，因为IOException是FileNotFoundException的父类
    private static void m2() throws IOException {
        System.out.println("m2 begin");
        //编译器报错原因是：m3()方法声明位置上有：throws FileNotFoundException
        //我们在这里调用m3()没有对异常进行预处理，所以编译报错。
        m3();
        System.out.println("m2 over");
    }

    private static void m3() throws FileNotFoundException {
        //调用SUN JDK中某个类的构造方法。
        //这个类还没有接触过，后期IO流的时候就知道了。
        //我们只是借助这个类学习一下异常处理机制。
        //创建一个输入流对象，该流指向一个文件。
        /*
        编译报错的原因是什么？
            第一：这里调用了一个构造方法：FileInputStream(String name)
            第二：这个构造方法的声明位置有：throws FileNotFoundException
            第三：通过类的继承结构看到：FileNotFoundException父类是IOException，IOException的父类是Exception，
            得知，FileNotFoundException编译时异常。
        * */

        //我们采用第一种处理方式：在方法声明的位置上使用throws继续上抛。throws抛给上一级来处理，不是自己解决
        new FileInputStream("D:\\study\\Java\\学习方法1.txt");
    }

}
