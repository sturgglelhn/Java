package com.javase.Array;

public class ArrayTest12 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int[][] a = {{12,4,34,5},{43,5,6,464,2},{91,43,123}};


        ArrayTest(a);
        ArrayTest(new int[][]{{12,4,34,5},{43,5,6,464,2},{91,43,123}});
    }

    public static void ArrayTest(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
