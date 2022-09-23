package com.javase.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListTest {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();
        //向集合中添加元素
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        // 通过下标，从集合中取出某个元素
        System.out.println(list.get(0));

        // 遍历（下标方式）
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        // 遍历（迭代器方式，这个是通用的，所有Collection都能用）
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(String s : list){
            System.out.println(s);
        }
    }
}
