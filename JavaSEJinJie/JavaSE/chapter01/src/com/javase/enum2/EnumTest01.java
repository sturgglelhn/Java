package com.javase.enum2;

/*
分析以下程序，在设计方面有什么缺陷？
* */
public class EnumTest01 {
    public static void main(String[] args) {

    }

    public static int divide(int a, int b){
        try{
            int c = a / b;
            return 1;
        }catch(Exception e){
            return 0;
        }

    }
}
