package com.javase.Array;

import java.util.Arrays;

/**
 * 使用一下SUM公司提供的数组工具类：java.util.Arrays;
 */
public class ArraysTest01 {
    public static void main(String[] args) {
        int[] arr = {112,3,5,56,76,32,64};
        Arrays.sort(arr);


        //遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
