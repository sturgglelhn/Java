package com.javase.collection;

import java.util.*;

/*
java.util.Collection 集合接口
java.util.Collections 集合工具类，方便集合的操作。
* */
public class collectionsTest01 {
    public static void main(String[] args) {
        //ArrayList集合不是线程安全的
        List<String> list = new ArrayList<>();

        // 变成线程安全的。
        Collections.synchronizedList(list);

        list.add("abz");
        list.add("abx");
        list.add("abf");
        list.add("abc");
        Collections.sort(list);

        for (String s : list){
            System.out.println(s);
        }

        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("kingsoft");
        set.add("king2");
        set.add("king1");
        List<String> myList = new ArrayList<>(set);
        Collections.sort(myList);
        for(String s : myList){
            System.out.println(s);
        }
    }
}
