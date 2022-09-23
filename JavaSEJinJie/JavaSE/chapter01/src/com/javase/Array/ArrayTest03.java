package com.javase.Array;

//当一个方法上，参数的类型是一个数组的时候，我们应该怎么传参

public class ArrayTest03 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] a1 = {1,2,34,5};
        for(int i = 0; i<a1.length; i++){
            System.out.println(a1[i]);
        }

        System.out.println("--------------------");
        int[] x = {1,2,3,4,5};
        printArray(x);

        String[] StringArray = {"One","Two", "three","four","five"};
        printArray(StringArray);

        System.out.println("-------------------");
        String[] strArray = new String[10];
        printArray(strArray);

        System.out.println("-------------------");
        printArray(new String[2]);
        System.out.println("-------------------");
        printArray(new int[4]);
    }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void printArray(String[] args){
        for(int i = 0; i<args.length; i++){
            System.out.println("数组中的元素：" + args[i]);
        }
    }

}
