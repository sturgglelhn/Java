package com.javase.Array;

import java.sql.SQLOutput;
import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class ArraysTest02 {
    public static void main(String[] args) {
        int[] arr = {2,3,89,34,23,622,21};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int index = Arrays.binarySearch(arr,34);
        System.out.println(index == -1 ? "该元素不存在":"该元素下标是："+index);
    }

}
