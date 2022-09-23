package com.javase.Array;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {293,34,2,4,12,435,64,78,98};

        int count = 0;
        for (int i =  arr.length-1; i > 0; i--) {
            for(int j = 0; j < i; j++){

                if(arr[j] > arr[j+1]){
                    count++;
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

       // System.out.println("比较次数：" + count);
        System.out.println("交换次数：" + count);
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
