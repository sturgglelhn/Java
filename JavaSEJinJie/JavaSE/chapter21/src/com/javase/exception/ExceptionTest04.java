package com.javase.exception;

/*
以下报错的原因是什么？
    因为doSome()方法声明位置上使用了：throws ClassNotFoundException
    而ClassNotFoundException。必须编写代码时处理，不处理就会报错
* */
public class ExceptionTest04 {
    public static void main(String[] args) {
        //main方法中调用doSome()方法
        //doSome();   //Unhandled exception: java.lang.ClassNotFoundException
    }

    /**
     * doSome方法在方法声明的位置上使用了：throws ClassNotFoundException
     * 这个代码表示doSome()方法在执行过程中，有可能会出现ClassNotFoundException异常。
     * 叫做类没找到异常。这个异常直接父类是：Exception，所以ClassNotFoundException属于编译时异常。
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!!");
    }
}
