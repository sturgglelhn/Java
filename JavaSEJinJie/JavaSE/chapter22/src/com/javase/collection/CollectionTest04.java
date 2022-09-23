package com.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection集合的contains方法：
    boolean contains(Object o)
        判断集合中是否包含某个对象o
        如果包含返回true，如果不包含返回false。

    contains方法是用来判断集合中是否包含某个元素的方法，
    那么它在底层是怎么判断集合中包含某个元素的呢？
        调用了equals方法进行比对。
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        //向集合中存储元素
        String s1 = new String("abc");
        c.add(s1);

        String s2 = new String("xyz");
        c.add(s2);

        System.out.println("元素的个数是："+c.size());

        String x = new String("xyz");
        System.out.println(c.contains(x));
    }
}
