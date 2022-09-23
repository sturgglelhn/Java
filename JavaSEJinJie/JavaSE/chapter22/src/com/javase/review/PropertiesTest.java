package com.javase.review;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("username","zhangsan");
        pro.setProperty("password","123456");

        /*String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        System.out.println(username);
        System.out.println(password);*/

        System.out.println(pro.getProperty("username"));
        System.out.println(pro.getProperty("password"));

    }
}
