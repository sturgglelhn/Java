package com.javase.integer;

/*
关于Integer类的构造方法，有两个：
    Integer(int)
    Integer(String)
* */
public class integerTest03 {
    public static void main(String[] args) {
        //java9之后不建议使用这个构造方法了。出现横线表示已过时。
        //将数字100转换成Integer包装类型(int --> Integer)
        //int --> Integer
        Integer x = new Integer(100);
        System.out.println(x);

        //String --> Integer
        Integer y = new Integer("123");
        System.out.println(y);

        //double --> Double
        Double s = new Double(1.23);
        System.out.println(s);

        //String --> Double
        Double s2 = new Double("1.34");
        System.out.println(s2);
    }




}
