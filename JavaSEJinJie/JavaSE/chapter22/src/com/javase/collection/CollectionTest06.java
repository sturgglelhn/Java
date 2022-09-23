package com.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合元素的remove
    重点：当集合的结构发生改变时，迭代器必须重新获取，如果还是用以前老的迭代器，会出现
    异常：java.util.ConcurrentModificationException

    重点：在迭代器元素的过程中，不能调用集合对象的remove方法，删除元素：
        cc.remove(); 迭代过程中不能这样。
        会出现： java.util.ConcurrentModificationException

    重点：在迭代器元素的过程当中，一定要使用迭代器中的方法去删除
* */
public class CollectionTest06 {
    public static void main(String[] args) {
        Collection cc = new ArrayList();
        cc.add("abc");
        cc.add("def");
        cc.add("xyz");

        Iterator it = cc.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            //删除元素
            //删除元素之后，集合的结构发生了变化，应该重新去获取迭代器
            //但是，循环下一次的时候并没有重新获取迭代器，所以会java.util.ConcurrentModificationException
            //cc.remove(obj); //直接通过集合去删除元素，没有通知迭代器。（导致迭代器的快照和原集合状态不同。）
            //根本原因：不知道迭代器变化了

            //使用迭代器中的remove()方法来删除
            //迭代器remove()删除时，会自动更新迭代器
            it.remove();    //删除的一定是迭代器指向当前的元素。
            System.out.println(obj);
        }
        System.out.println(cc.size());
    }
}
