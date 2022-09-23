package com.javase.exception;

public class ExceptionTest13 {
    public static void main(String[] args) {
        /*int result = m();
        System.out.println(result);*/

        System.out.println(m());
    }

    /*
    java语法规则（有一些规则是不能破坏的，一旦这么说了，就必须这么做！）：
        java中有一条这样的规则：
            方法体中的代码必须遵循自上而下顺序依次逐行执行（亘古不变的语法！）
        java中有一条语法规则：
            return语句一执行，整个方法必须结束（亘古不变的语法！），一定最后执行的
    * */
    public static int m(){
        int i = 100;
        try{
            // 这行代码出现在int i = 100;的下面，所以最终结果必须是返回100
            // return语句还必须保证是最后执行的。一旦执行，整个方法结束。
            //
            return i;
        }finally {
            i++;

        }
    }
}


