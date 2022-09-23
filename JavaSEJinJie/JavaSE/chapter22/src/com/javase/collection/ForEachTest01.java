package com.javase.collection;

/**
 * 
 */
public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr = {1,2 ,4,54,64 ,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 增强for(foreach)
        // 以下是语法
        /*for(元素类型 变量名 : 数组或集合){
            System.out.println(变量名);
        }*/

        System.out.println("---------------");
        // foreach有一个缺点：没有下标。在需要使用下标的循环中，不建议使用增强for循环
        for(int data : arr){
            System.out.println(data);
        }

    }
}
