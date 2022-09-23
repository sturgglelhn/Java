package com.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);

        //迭代器
        Iterator it = c.iterator();
        while(it.hasNext()){
            //存进去是什么类型，取出来还是什么类型。
            Object obj = it.next();
            //只不过输出的时候会转换成字符串。因为这里println会调用toString()方法。
            System.out.println(obj);
        }

        //HashSet集合：无序不可重复
        Collection c2 = new HashSet();
        //无序：存进去和取出的顺序不一定相同。
        //不可重复：存储100，不能存储100.
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(100);
        c2.add(30);
        c2.add(50);

        Iterator it2 = c2.iterator();
        while(it2.hasNext()){
            Object obj2 = it2.next();
            System.out.println(obj2);
        }
    }
}
