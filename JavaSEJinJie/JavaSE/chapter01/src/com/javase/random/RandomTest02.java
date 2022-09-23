package com.javase.random;
import java.util.Random;

/*
编写程序，生成5个不重复的随机数。重复的话重新生成。
最终生成的5个随机数放到数组中，要求数组中这个5个随机数不重复。
* */
public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[5];
        for (int i = 0; i<arr.length; i++){
            arr[i] = -1;
        }

        int index = 0;
        while(index < arr.length){
            int num = random.nextInt(6);
            if(!contains(arr, num)){
                arr[index++] = num;
            }
        }

        for (int i = 0; i <arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    /**
     * 单独编写一个方法，这个方法专门用来判断数组中是否包含某个元素
     *
     */
    public static boolean contains(int[] arr, int key){
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
}
