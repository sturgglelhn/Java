package com.javase.String;

public class StringTest02 {
    public static void main(String[] args) {
        //"hello"是存储在方法区的字符串常量池当中
        //所以这个"hello"不会新建。（因为这个对象已经存在了！）
        String s1 = "hello";
        String s2 = "hello";
        //分析结果是true还是false？
        // == 双等号比较的是不是变量中保存的内存地址？是的
        System.out.println(s1 == s2);   //true

        String x = new String("xyz");
        String y = new String("xyz");
        //分析结果是true还是false?
        // == 双等号比较的是不是变量中保存的内存地址？是的
        System.out.println(x == y); //false


        System.out.println(x.equals(y));    //true

        String k = new String("testString");
        //String k = null;
        //"testString"这个字符串可以后面加"."呢？
        //因为"testString"是一个String字符串对象。只要是对象都能调用方法。
        System.out.println("testString".equals(k)); //建议使用这种方式，因为这个可以避免空指针异常。
        System.out.println(k.equals("testString")); //存在空指针异常的风险。不建议这样写。


    }
}
