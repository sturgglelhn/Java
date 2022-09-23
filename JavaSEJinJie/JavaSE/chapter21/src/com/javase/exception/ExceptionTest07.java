package com.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
深入try...catch
    1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型
    2、catch可以写多个。建议catch的时候，精确的一个一个处理。这样有利于程序的调试。
    3、catch写多个的时候，从小到下，必须遵守从小到大。
* */
public class ExceptionTest07 {
    public static void main(String[] args) {

        /*try{
            //创建输入流
           FileInputStream fis = new FileInputStream("D:\\study\\Java\\学习方法02.txt");
           fis.read();
        }catch(FileNotFoundException e){
            System.out.println("文件不存在！");
        }catch(IOException e){
            System.out.println("读文件报错了！");
        }*/

        //异常的处理必须遵守从小到大的处理方式
        /*try{
            //创建输入流
            FileInputStream fis = new FileInputStream("D:\\study\\Java\\学习方法02.txt");
            fis.read();
        }catch(IOException e){
            System.out.println("文件不存在！");
        }catch(FileNotFoundException e){
            System.out.println("读文件报错了！");
        }*/

        try{
            //创建输入流
            FileInputStream fis = new FileInputStream("D:\\study\\Java\\学习方法02.txt");

            //进行数学运算
            System.out.println(100/0);//这个异常是运行时异常，编写程序时可以处理，也可以不处理。
        }catch(FileNotFoundException | ArithmeticException e){//JDK8新特性，才能这么写
            System.out.println("文件报错了！");
        }

    }
}
