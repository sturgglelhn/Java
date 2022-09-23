package com.javase.IO;

import java.util.Scanner;

/*
public class Code02_Max_Min_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int temp;

        for(int i= 0; i<5; i++){
            System.out.println("请输入第"+(i+1)+"个数值");
            int nums = sc.nextInt();
            arr[i] = nums;
        }

        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最大值：" + max + "，最小值：" + min);

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]< arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("排序结果为：");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
*/

public class Code02_Max_Min_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int temp;

        for(int i=0; i<5; i++){
            System.out.println("请输入第" + (i+1) + "个数值");
            int nums = sc.nextInt();
            arr[i] = nums;
        }

        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最大值：" + max + "最小值：" + min);


        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("排序后的值为：");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
