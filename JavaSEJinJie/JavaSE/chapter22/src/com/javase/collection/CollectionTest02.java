package com.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest02 {
    public static void main(String[] args) {
        //注意：以下讲解的遍历方式/迭代方式，是所有Collection通用的一种方式
        //在Map集合中不能用。在所有的Collection以及子类中使用。
        //创建集合对象
        /*Collection c = new ArrayList();  //后面的集合无所谓，主要是看前面的Collection接口，怎么遍历/迭代。
        //添加元素
        c.add("abc");
        c.add("Hello");
        c.add(100);
        c.add(new Object());

        // 对集合Collection进行遍历/迭代
        //第一步：获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();
        //第二步：通过以上获取的迭代器对象开始迭代/遍历集合。
        *//*
            以下两个方法是迭代器对象Iterator中的方法：
                boolean hasNext() 如果仍有元素可以迭代，则返回true
                Object next() 返回迭代的下一个元素。
        * *//*
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }*/

        Collection cc = new ArrayList();
        cc.add("中国人");
        cc.add("人民手上没有钱！");
        cc.add("不甘命运就如此这样");
        cc.add("好好学习，努力，加油！");
        cc.add("在我的生命力总是全力以赴");
        cc.add("没有退路就是最好的前进");

        Iterator it = cc.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
