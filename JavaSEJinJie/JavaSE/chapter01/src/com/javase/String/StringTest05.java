package com.javase.String;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringTest05 {
    public static void main(String[] args) {
        //String类当中常用方法。
        //1(掌握).char charAt(int index)
        char c = "中国人".charAt(1);//"中国人"是一个字符串String对象。只要是对象就能“点.”。
        System.out.println(c);//国

        //2、int compareTo(String anotherString)
        int result = "abc".compareTo("abc");
        System.out.println(result);//0  前后一致等于0

        int result1 = "abcd".compareTo("abce");
        System.out.println(result1);//-1 前小后大等于-1

        int result2 = "abce".compareTo("abcd");
        System.out.println(result2);//1 前小后大等于1

        System.out.println("xyz".compareTo("yxz"));//-1

        //3(掌握).boolean contains(CharSequence s)
        //判断前面的字符床是否包含后面的子字符串。
        System.out.println("HelloWorld.java".contains(".java"));    //true
        System.out.println("Http://www.baidu.com".contains("Https://"));    //false

        System.out.println("-----------");
        //4(掌握).boolean endsWith(String suffix)
        //判断当前字符串是否以某个字符串结尾。
        System.out.println("java.txt".endsWith(".txt"));    //true
        System.out.println("hello.java".endsWith(".java")); //true
        System.out.println("hello.abc".endsWith(".acd"));//false


        //5(掌握).boolean equals(Object anObject)
        //比较两个字符串必须使用equals方法，不能使用“==”
        //equals方法有没有调用compareTo方法？
        System.out.println("abc".equals("abc"));    //true


        //6(掌握).equalsIgnoreCase(String anotherString)
        //判断两个字符串是否相等，并且同时忽略大小写。
        System.out.println("ABc".equalsIgnoreCase("abC"));  //true

        //7(掌握).byte[] getByte()
        byte[] bytes = "abcdef".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
            /*
            输出结果：
                97
                98
                99
                100
                101
                102
            * */
        }

        //8(掌握).int index(String str)
        //判断某个子字符串在当前字符串中第一次出现处的索引（下标）。
        System.out.println("oraclejavac++.netc#phppythonjavaoraclec++".indexOf("java"));    //6


        //9(掌握)、boolean isEmpty()
        //判断某个字符串是否为空
        String s = "";
        //String s = "a";
        System.out.println(s.isEmpty());    //true


        //10(掌握). int length()
        //面试题：判断数组长度和判断字符串长度不一样
        //判断数组长度是length属性，判断字符串长度是length()方法。
        System.out.println("abc".length()); //3


        //11（掌握）.int LastIndex(String str)
        //判断某个子字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("oraclejavac++.netc#phppythonjavaoraclec++".lastIndexOf("java"));    //28


        //12(掌握)、String replace(CharSequence target, CharSequence replacement)
        //String的父类接口就是：CharSequence
        String newString = "http://www.baidu.com".replace("http://","https://");
        System.out.println(newString);  //https://www.baidu.com
        //把以下字符串中的“=”替换成“：”
        String newString2 = "name=zhangsan&password=123&age=20".replace("=",":");
        System.out.println(newString2); //name:zhangsan&password:123&age:20

        //13(掌握)、String[] split(String regex)
        //拆分字符串
        String[] ymd = "1980-10-11".split("-");
        for (int i = 0; i < ymd.length; i++) {
            System.out.println(ymd[i]);
        }
        String param = "name=zhangsan&password=123&age=20";
        String[] params = param.split("&");
        for (int i = 0; i < params.length; i++) {
            System.out.println(params[i]);
        }


        //14(掌握)、boolean startsWith(String prefix)
        //判断某个字符串是否以某个字符串开始
        System.out.println("http://www.baidu.com".startsWith("http"));  //true
        System.out.println("http://www.baudu.com".startsWith("https")); //false

        //15(掌握)、String substring(int beginIndex) 参数是起始下标
        //截取字符串，起始位置开始截图字符串
        System.out.println("http://www.baidu.com".substring(7)); //www.baidu.com

        //16(掌握)、String substring(int beginIndex, int endIndex)
        //beginIndex起始位置（包括）
        //endIndex结束位置（不包括）
        System.out.println("http://www.baidu.com".substring(7,10));//www

        //17(掌握)、char[] toCharArray()
        //将字符串转换成char数组
        char[] chars = "我是中国人".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }


        //18(掌握)、String toLowerCase()
        //转换成小写。
        System.out.println("ABCDefKXyz".toLowerCase());//abcdefkxyz

        //19(掌握)、String toUpperCase()
        System.out.println("ABCDefKXyz".toUpperCase());//ABCDEFKXYZ


        //20(掌握)、String trim();
        //去除字符串前后空白
        System.out.println("       hello    world!".trim());

        //21(掌握)、String中只有一个方法是静态的，不需要new对象
        //这个方法叫做valueOf
        //作用：将“非字符串”转换成“字符串”
        //String s1 = String.valueOf(true);
        //String s1 = String.valueOf(3.14);
        //String s1 = String.valueOf(100);

        //这个静态的valueOf()方法，参数是一个对象的时候，会自动调用该对象的toString()方法吗？
        String s1 = String.valueOf(new Customer());
        //System.out.println(s1);//没有重写toString()方法之前是对象内存地址 com.javase.String.Customer@10f87f48
        System.out.println(s1);//我是一个VIP客户！！！！

        //我们是不是可以研究一下println()方法源代码了
        System.out.println(100);
        System.out.println(3.14);
        System.out.println(true);

        Object obj = new Object();
        //通过源代码可以看出：为什么输出一个引用的时候，会调用toString()方法
        //  本质上System.out.println()这个方法在输出任何数据的时候都是先转换成字符串，在输出。
        System.out.println(obj);
    }
}

class Customer{

    //重写toString()方法
    public String toString(){
        return "我是一个VIP客户！！！！";
    }
}