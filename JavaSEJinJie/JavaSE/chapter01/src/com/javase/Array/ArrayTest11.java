package com.javase.Array;

public class ArrayTest11 {
    public static void main(String[] args) {
        String[][] array = {
                {"mysql","python","jdbc","C#","C++"},
                {"张三","王五","李四"},
                {"jack","lucy","rose"}
        };


        for (int i = 0; i < array.length; i++) {//外层循环3次。（负责纵向）
            for(int j = 0; j< array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
