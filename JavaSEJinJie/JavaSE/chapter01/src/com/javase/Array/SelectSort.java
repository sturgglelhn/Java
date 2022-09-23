package com.javase.Array;

/**
 * 选择排序:
 *  每一次从这堆参与比较的数据当中找出最小值，
 *  选择排序比冒泡排序的效率高
 *
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {293,34,2,4,12,435,64,78,98};
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            //System.out.println(i);
            //i证号是“参加比较的这堆数据中”最左边那个元素的下标。
            //System.out.println(i);
            //i是一个参与比较这堆数据中的起点下标。
            //假设起点i下标位置上的元素是最小的。
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                //System.out.println("-->" + j);
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            //当i和min相等时，表示最初猜测是对的。
            //当i和min不相等时，表示最初猜测是错的，有比这个元素更小的元素。
            //需要拿着这个更小的元素和最左边的元素交换位置
            if(min != i){
                //表示存在更小的数据
                //arr[min]最小的数据
                //arr[i]最前面的数据
                count++;
                int temp;
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        //System.out.println("比较的次数："+count);
        System.out.println("交换次数：" + count);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
