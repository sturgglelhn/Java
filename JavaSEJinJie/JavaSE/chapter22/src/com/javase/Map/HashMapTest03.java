package com.javase.Map;

import java.util.HashMap;
import java.util.Map;

/*
HashMap集合key部分允许null吗
    允许
    但是要注意：HashMap集合的key中null值只能有一个。
* */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null, null);
        System.out.println(map.size());//1

        map.put(null,100);
        System.out.println(map.size());//1
    }
}
