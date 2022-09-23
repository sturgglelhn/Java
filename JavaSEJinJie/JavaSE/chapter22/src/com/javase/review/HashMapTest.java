package com.javase.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(9,"lisi");
        map.put(10,"wnagwu");
        map.put(2,"king");
        map.put(2,"simth");
        System.out.println(map.size());
        System.out.println(map.get(2));

        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            System.out.println(key+" = "+map.get(key));
        }

        //第二种方式：是将Map集合转换成Set集合，Set集合每一个元素是Node
        // 这个Node节点中有key和value
        Set<Map.Entry<Integer,String>> nodes = map.entrySet();
        for(Map.Entry<Integer,String> node : nodes){
            System.out.println(node.getKey()+","+ node.getValue());
        }
    }
}
