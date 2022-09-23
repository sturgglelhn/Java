package com.javase.collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayListTest02 {
    public static void main(String[] args) {

        // 默认初始化容量10
        List list = new ArrayList();

        // 指定初始化容量100
        List list2 = new ArrayList(100);

        // 创建一个HasSet集合
        Collection c = new HashSet();
        // 添加元素到Set集合
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);

        // 通过这个构造方法就可以将HasSet集合转换成List集合。
        List list3 = new ArrayList(c);
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
    }
}
