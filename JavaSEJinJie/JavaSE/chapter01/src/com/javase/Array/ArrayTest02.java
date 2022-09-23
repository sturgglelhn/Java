package com.javase.Array;
/*
    什么时候采用静态初始化方式，什么时候使用动态初始化方法呢？
        当你创建数据的时候，确定数组中存储哪些具体的元素时，采用静态初始化方法。
        当你创建数组的时候，不确定将来数组中存储哪些数据，你可以采用动态初始化的方法，预先分配内存空间。
* */

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] a = new int[4];   //创建长度为4的int数组，数组中每个元素的默认值是0
        //遍历数组
        for(int i = 0; i<a.length; i++){
            System.out.println("数组下标为"+ i +"的元素是："+ a[i]);
        }

        a[0] = 111;
        a[1] = 222;
        a[2] = 333;
        a[3] = 444;

        for(int i = 0; i<a.length; i++){
            System.out.println("数组下标为"+ i +"的元素是："+ a[i]);
        }

        //初始化一个Object类型的数组，采用动态初始化方式
        Object[] objs = new Object[3];  //  3个长度，动态初始化，所以每个元素默认值是null
        for(int i = 0; i<objs.length; i++){
            System.out.println(objs[i]);
        }

        System.out.println("-----------------------------");

        //动态初始化
        String[] strs = new String[3];  //预分配空间
        for(int i = 0; i<strs.length; i++){
            System.out.println(strs[i]);
        }

        //采用静态初始化的方式
        String[] strs2 = {"abc","def","xyz"};
        for(int i = 0; i<strs2.length; i++){
            System.out.println(strs2[i]);
        }

        //存储Object,采用静态初始化呢？
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] objects = {o1,o2,o3};

        for(int i = 0; i < objects.length; i++){
            System.out.println(objects[i]);
        }

    }
}
