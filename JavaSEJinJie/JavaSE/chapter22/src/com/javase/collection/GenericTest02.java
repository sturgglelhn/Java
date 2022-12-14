package com.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    泛型中的自动判断类型机制
JDK之后引入了：自动类型推断机制（又称为砖石表达式）

* */
public class GenericTest02 {
    public static void main(String[] args) {
        // ArrayList<这里的类型会自动判断>()，前提是JDK8之后才允许
        // 自动类型推断，钻石表达式！
        List<Animal> myList = new ArrayList<>();

        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());

        // 遍历
        Iterator<Animal> it = myList.iterator();
        while(it.hasNext()){
            Animal a = it.next();
            a.move();
        }

        // 只能传字符串
        List<String> strList = new ArrayList<>();
        //类型不匹配。
        //strList.add(new Cat());

        strList.add("http://www.baidu.com");
        strList.add("http://www.123.com");
        strList.add("http://www.bjpowernode.com");

        // 遍历
        Iterator<String> it2 = strList.iterator();
        while(it2.hasNext()){
            String s = it2.next();
            String newString = s.substring(7);
            System.out.println(newString);
        }
    }
}
