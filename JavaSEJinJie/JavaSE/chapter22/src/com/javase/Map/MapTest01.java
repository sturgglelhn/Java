package com.javase.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
java.util.Map接口中常用的方法：
    1、Map和Collection没有继承关系。
    2、Map集合以key和value的方式存储数据：键值对
        key和value都是引用数据类型。
        key和value都是存储对象的内存地址。
        key起到主导的地位，value是key的一个附属品。
            V put(K key, V value)  向Map集合中添加键值对
            V get(Object key)   通过key获取value
            void clear()    清空Map集合
            boolean containsKey(Object key) 判断Map中是否包含某个key
            boolean containsValue(Object value) 判断Map中是否包含某个value
            boolean isEmpty()   判断Map集合中的个数是否为0

            V remove(Object key)    通过key删除键值对
            int size()   获取Map集合中键值对的个数。
            Collection<V> values()  获取Map集合中所有的value，返回一个Collection
            Set<K> keySet() 获取Map集合所有的key(所有的键是一个set集合)
            Set<Map.Entry<K,V>> entrySet()
                将Map集合转换成Set集合
                假设现在有一个Map集合，如下所示：
                    map集合对象
                    key             value
                    ---------------------------
                    1               zhangsan
                    2               lisi
                    3               wangwu
                    4               zhaoliu

                    Set set = map.entrySet();
                    set集合对象
                    1=zhangsan
                    2=lisi
                    3=wangwu
                    4=zhaoliu
* */
public class MapTest01 {
    public static void main(String[] args) {
        // 创建Map集合对象
        Map<Integer, String> map = new HashMap<>();
        // 向Map集合中添加键值对
        map.put(1,"lihaonan");  //1在这里自动装箱
        map.put(2,"chenlvqi");
        map.put(3,"wangwu");
        map.put(4,"lisi");

        // 获取键值对的数量
        System.out.println("键值对的数量："+ map.size());
        map.remove(2);
        System.out.println("键值对的数量："+map.size());

        //contains()方法底层调用的都是equals方法进行比对的，所以自定义的类型需要重写equals方法。
        //判断是否包含某个key
        System.out.println(map.containsKey(3)); //true
        //判断是否包含某个value
        System.out.println(map.containsValue("wangwu")); //true
        System.out.println(map.containsValue("lishi")); //false

        System.out.println("-----------");
        /*Collection<String> values = map.values();
        for(String s : values){
            System.out.println(s);
        }*/

        Collection<Integer> keys = map.keySet();
        for (Integer s : keys){
            System.out.println(s);
        }

        System.out.println("-----------");
        map.clear();

        System.out.println(map.size());

        System.out.println(map.isEmpty());//true,此时集合中为空
    }
}
