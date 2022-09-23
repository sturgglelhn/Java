package com.javase.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历。【非常重要】
* */
public class MapTest02 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");

        //第一种方式
        // 遍历Map集合
        // 获取所有的key,所有的key是一个Set集合
       //Set<Integer> keys = map.keySet();

        // 遍历key，通过key获取value
        //迭代器
        /*Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            // 取出其中一个key
            Integer key = it.next();
            // 通过key获取value
            String value = map.get(key);
            System.out.println(key+","+value);
        }*/
        // foreach也可以
        /*Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            System.out.println(key + "," + map.get(key));
        }*/
        // 等价于上面的
        for(Integer key: map.keySet()){
            System.out.println(key+","+map.get(key));
        }

        //---------------------------------------------

        //第二种方式： Set<Map.Entry<K,V>> entrySet()
        // 以上这个方法是把Map集合直接全部转换成Set集合
        // Set集合中元素的类型是：Map.Entry
        Set<Map.Entry<Integer,String>> set = map.entrySet();


        Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
        // 遍历Set集合，每一次取出一个Node
        // 迭代器
        while(it2.hasNext()){
            Map.Entry<Integer, String> node = it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key+","+value);
        }

        // foreach
        // 这种方式效率比较高，因为获取key和value都是直接从node对象中获取的属性值
        // 这种方式比较适合与大数据量
        for (Map.Entry<Integer,String>node : set){
            System.out.println(node.getKey()+"-->"+node.getValue());
        }
    }
}
