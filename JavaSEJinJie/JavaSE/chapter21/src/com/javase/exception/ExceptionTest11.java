package com.javase.exception;

/*
finally语句。
* */
public class ExceptionTest11 {
    public static void main(String[] args) {
        /*
        try和finally，没有catch可以吗？可以。
            try不能单独使用。
            try finally可以联合使用。
        以下代码的执行顺序：
            先执行try...
            在执行finally...
            最后执行return（return执行方法必然结束）
        * */
        try{
            System.out.println("try...");
            return;
        }finally{
            System.out.println("finally...");
        }

        //无法执行到的语句
       // System.out.println("hello world!");
    }
}
