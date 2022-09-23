package com.javase.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args) {
        // 创建map对象
        Map<String,String> map = new HashMap<>();

        // 添加元素到集合
        map.put("江西","南昌");
        map.put("湖南","长沙");
        map.put("湖北","武汉");

        System.out.println(map); //{湖南=长沙, 湖北=武汉, 江西=南昌}

        System.out.println(map.remove("江西"));

        System.out.println(map);

        System.out.println(map.get("湖北"));
        System.out.println(map.get("湖南"));
    }
}
