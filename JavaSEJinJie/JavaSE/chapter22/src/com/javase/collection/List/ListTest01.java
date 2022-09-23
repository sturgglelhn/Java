package com.javase.collection.List;

import java.util.*;

/*
测试List接口中常用方法
    1、List集合存储元素特点：有序可重复
        有序：List集合中的元素有下标
        从0开始，以1递增。
        可重复：存储一个1，还可以在存储1.
    2、List既然是Collection接口的子接口，那么肯定List接口有自己“特色”的方法：
        以下只列出List接口特有的常用的方法：
            void add(int index, Object element) 在列表的指定位置插入指定元素
            Object set(int index, Object element) 修改指定位置的元素
            Object get(int index)   通过下标来获取元素
            int indexOf(Object o)   获取指定对象第一次出现处的索引
            int LastIndexOf(Object o)   获取指定对象最后一次出现处的索引。
            Object remove(int index)  通过下标来删除指定的元素


* */
public class ListTest01 {
    public static void main(String[] args) {
        //List li = new LinkedList();
        //List li = new Vector();
        List li = new ArrayList();

        li.add("A");
        li.add("B");
        li.add("C");
        li.add("C");
        li.add("D");

        //在列表的指定位置插入指定元素（第一个参数是下标）
        //这个方法使用不多，因为对于ArrayList集合来说效率比较低。
        li.add(1,"KING");

        Iterator it = li.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Object firstObj = li.get(0);
        System.out.println(firstObj);
        System.out.println("集合中的个数："+li.size());

        //因为有下标，所以List集合有自己比较特殊的遍历方式了
        //通过小标遍历。【List集合特有的方式，Set没有。】
        System.out.println("-----------");
        for(int i = 0; i < li.size(); i++){
            Object obj = li.get(i);
            System.out.println(obj);
        }
        //获取指定对象第一次出现处的索引
        System.out.println(li.indexOf("C"));//3

        //获取指定对象最后一次出现处的索引。
        System.out.println(li.lastIndexOf("C"));//4

        //
        li.remove(0);
        System.out.println(li.size());

        System.out.println("----------------------");
        //修改指定位置的元素
        li.set(2,"Soft");
        //li.set(3,"sb");
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }

    }
}
