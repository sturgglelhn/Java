package com.javase.collection;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于java.util.Collection接口中常用的方法。
    1、Collection中能存放什么元素？
        没有使用“泛型”之前，Collection中可以存储Object的所有子类型。
        使用了“泛型”之后，Collection中只能存储某个具体的类型。
        集合后期我们会学习“泛型”语法。目前先不用管。Collection中什么都能存，
        只要是Object的子类型就行。（集合中不能直接存储基本数据类型，也不能存
        java对象，只能存储java对象的内存地址。）
    2、Collection中的常用方法
        boolean add(E e)    向集合中添加元素
        int size()  获取集合中元素的个数
        void clear()  清空集合
        boolean contains(Object o) 判断当前集合中是否包含元素o，包含返回true，不包含返回false
        boolean remove(Object o)删除集合中的某个元素
        boolean isEmpty()   判断该集合中元素的个数是否为0
        Object[] toArray()  调用这个方法可以把集合转换成数组。【作为了解】

* */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        //Collection c = new Collection();  //接口是抽象的，无法实例化。

        // 多态
        /*Collection c = new ArrayList();
        // 测试Collection接口中的常用方法
        c.add(1300);//自动装箱（java5的新特性。）实际上是放进去了一个对象的内存地址，Integer x = new Integer();
        c.add("中国人");//自动装箱
        c.add(true);//自动装箱
        c.add(new Student());
        c.add(new Object());

        //获取集合中元素的个数
        System.out.println("获取集合中的个数："+c.size());

        //清空集合
        c.clear();
        System.out.println("集合元素个数是："+c.size());

        //再向集合中添加元素
        c.add("Hello World!");  //"hello"对象的内存地址放到了集合当中。
        c.add("world");
        c.add("浩克");
        c.add("钢铁侠");
        c.add(1);

        //判断结合中是否包含"绿巨人"
        boolean flag = c.contains("绿巨人");
        System.out.println(flag);//false
        boolean flag2 = c.contains("钢铁侠");
        System.out.println(flag2); //true
        boolean flag3 = c.contains("Hello World!");
        System.out.println(flag3);//true
        boolean flag4 = c.contains("wrold!");//false
        System.out.println(flag4);
        System.out.println(c.contains(1));

        System.out.println("集合中元素的个数"+c.size());

        //删除集合中的"浩克"
        c.remove("浩克");
        System.out.println("集合中元素的个数"+c.size());

        //判断集合是否为空（集合中是否存在元素）
        System.out.println(c.isEmpty());    //false
        //清空
        c.clear();
        System.out.println(c.isEmpty());//true

        c.add("abc");
        c.add("hello ");
        c.add(100);
        c.add(new Student());

        //转换成数组(作为了解，使用的不多)
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length; i++) {
            //遍历数组
            Object o = objs[i];
            System.out.println(o);

        }
        */
         Collection c = new ArrayList();
         //向集合中添加元素
         c.add(1);
         c.add(2);
         c.add(3);
         c.add("中国人");

         //查看集合中有多少个元素
        System.out.println(c.size());
        //查看集合中是否包含此元素
        System.out.println(c.contains(2));
        c.remove(2);

        Iterator it = c.iterator();
        while(it.hasNext()){
            /*Object obj = it.next();
            System.out.println(obj);*/
            //等价于上面的
            System.out.println(it.next());

        }

        System.out.println(c.isEmpty());//判断集合中是否有元素：返回Boolean  //false，有元素

        //清空集合中的元素
        c.clear();
        System.out.println(c.isEmpty());//true，集合中没有元素



    }
}

class Student{

}