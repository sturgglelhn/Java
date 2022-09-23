package com.javase.Array;

/*
关于java中的二维数组
    1、二维数组其实是一个特殊的一维数组，特殊在这个一维数组当中的每一个元素是一个一维数组
    2、三维数组是什么？
        三维数组是一个特殊的二维数组，特殊在这个二维数组中每个元素是一个一维数组。
    3、二维数组静态初始化
        int[][] array = {{12,4,353},{2,34,5},{00,0}};
* */
public class ArrayTest09 {
    public static void main(String[] args) {
        int[] array = {100,200,300};
        System.out.println(array.length);   //3

        int[][] a1 = {
                {1,2,3,4,5},
                {6,7,8,8,10},
                {20,320,4380},
                {000}
        };
        System.out.println(a1.length);
        System.out.println(a1[0].length);   //5
        System.out.println(a1[1].length);   //5
        System.out.println(a1[2].length);   //3
        System.out.println(a1[3].length);   //1
    }
}
