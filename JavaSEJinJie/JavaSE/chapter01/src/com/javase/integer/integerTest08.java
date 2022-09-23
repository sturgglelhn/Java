package com.javase.integer;

public class integerTest08 {
    public static void main(String[] args) {
        //String --> int
        int i1 = Integer.parseInt("100");
        System.out.println(i1+1);

        //int --> String
        String s2 = i1+"";

        //String --> Integer
        Integer k = Integer.valueOf("123");
    }
}
