package com.javase.collection;

/*
TreeSet集合存储元素特点：
    1、无序不可重复的，但是存储的元素可以自动按照大小顺序排序！
    称为：可排序集合。

    2、无序：这里指的是存进去的顺序和取出来的顺序不同。并且没有下标
* */
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();

        s.add("A");
        s.add("D");
        s.add("C");
        s.add("K");
        s.add("Y");
        s.add("A");
        s.add("B");


        for (String i : s){
            System.out.println(i);
        }
    }
}
/*
运行结果：
    A
    B
    C
    D
    K
    Y

* */
