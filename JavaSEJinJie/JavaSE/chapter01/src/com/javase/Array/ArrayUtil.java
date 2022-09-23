package com.javase.Array;

/*
1、数组工具类：自己写的。不是SUN的
2、关于查找算法中：二分法查找
    10 11 12 13 14 15 16 17 18 19 20(小标10)
    通过二分法查找，找出18这个元素的下标
3、二分法查找效率要高于“一个挨着一个”的这种查找方式。
* */
public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {100, 200 ,230, 235, 600, 1000, 2000, 9999};

        //找出arr这个数组中200所在的小标。
        //调用方法
        int index= binarySearch2(arr, 230);
        System.out.println(index == -1 ? "该元素不存在！" : "该元素小标" + index);
    }

    /**
     * 从数组中查找目标元素的下标
     * @param arr   被查找的数组（这个必须是已经排序的）
     * @param dest  目标元素
     * @return  -1表示该元素不存在，其它表示返回该元素的下标
     */
    private static int binarySearch2(int[] arr, int dest) {
        int begin = 0;
        int end = arr.length-1;

        //开始元素的下标只要在结束元素下标的左边，就有机会继续循环
        while(begin <= end) {
            int mid = (begin + end) / 2;
            if (arr[mid] == dest) {
                return mid;
            } else if (arr[mid] < dest) {
                // 目标在“中间”右边
                //开始元素下标需要发生变化（开始元素的下标需要重新赋值）
                begin = mid + 1;    //一直增
            } else {
                //arr[mid] > dest
                //目标在“中间”的左边
                //修改结束元素的下标
                end = mid - 1;  //一直减
            }
        }
        return -1;
    }

}
