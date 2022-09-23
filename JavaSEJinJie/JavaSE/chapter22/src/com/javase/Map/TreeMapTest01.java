package com.javase.Map;

import java.util.TreeSet;

/*
1、TreeSet集合底层实际上是一个TreeMap
2、TreeMap集合底层是一个二叉树
3、放到TreeSet集合中的元素，等同于放到TreeMap集合key部分了
4、TreeSet集合中的元素：无序不可重复，但是可以按照元素大小顺序自动排序。
称为：可排序集合。
* */
public class TreeMapTest01 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("db");
        ts.add("da");
        ts.add("afegc");
        ts.add("ifl");
        ts.add("aal");
        for(String s : ts){
            System.out.println(s);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(100);
        ts2.add(200);
        ts2.add(12);
        ts2.add(302);
        ts2.add(10);
        for(Integer s : ts2){
            // 自动升序
            System.out.println(s);
        }
    }
}
