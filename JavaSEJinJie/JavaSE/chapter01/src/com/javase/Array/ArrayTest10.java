package com.javase.Array;

/*
*关于二维数组中元素的：读和改。
*   a[]
* */
public class ArrayTest10 {
    public static void main(String[] args) {
        int[][] a = {
                {23,12,34},
                {5,6,2,3},
                {209,32}
        };
        int[] a0 = a[0];
        int array1 = a0[0];
        System.out.println(array1);
        //以上三行代码，等价于下面的这行代码
        System.out.println(a[0][0]);//23

        //取出第二个一维数组中第三个元素
        System.out.println("第二个一维数组中第三个元素："+ a[1][2]);  //2
        System.out.println("第三个一维数组中第一个元素："+ a[2][0]);  //209

        //改
        a[2][1] = 56;
        System.out.println(a[2][1]);
    }
}
