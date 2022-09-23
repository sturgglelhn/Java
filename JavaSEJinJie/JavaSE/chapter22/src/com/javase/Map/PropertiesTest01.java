package com.javase.Map;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
目前只需要掌握Properties属性类的相关方法即可。
Properties是一个Map集合，继承Hashtable,Properties的key和value都是String类型
Properties被称为属性类对象。
* */
public class PropertiesTest01 {
    public static void main(String[] args) {
        // 创建一个Properties对象
        //Map map = new Properties();
        Properties pro = new Properties();
        pro.setProperty("url","jdbc:mysql://localhost:3306/Booksdata");
        pro.setProperty("diver","com.mysql.jdbc.Driver");
        pro.setProperty("username","root");
        pro.setProperty("password","123");

        String url = pro.getProperty("url");
        String diver = pro.getProperty("diver");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        /*Set<Map.Entry<Object,Object>> set = pro.entrySet();
        for (Map.Entry<Object,Object> it : set){
            System.out.println(it.getKey()+","+it.getValue());
        }*/

        System.out.println(url);
    }
}
