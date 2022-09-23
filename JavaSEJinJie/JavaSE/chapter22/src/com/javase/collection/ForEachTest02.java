package com.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        // 添加元素
        strList.add("hello");
        strList.add("world!");
        strList.add("kitty");


        //使用迭代器遍历
        Iterator<String> it = strList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------");
        // 使用for遍历循环
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        System.out.println("---------");
        // 使用foreach遍历循环
        for (String s : strList){
            System.out.println(s);
        }

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        for(Integer i : list){
            System.out.println(i);
        }
    }
}
