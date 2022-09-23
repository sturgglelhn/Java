package com.javase.annotation;

public class AnnotationTest03 {
    public static void main(String[] args) {
        AnnotationTest03 a = new AnnotationTest03();
        a.soSome();
    }

    @Deprecated
    public void soSome(){
        System.out.println("do something!");
    }

    @Deprecated
    public static void doOther(){
        System.out.println("do other...");
    }
}

class T{
    public static void main(String[] args) {
        AnnotationTest03 a = new AnnotationTest03();
        a.soSome();
        AnnotationTest03.doOther();
    }
}