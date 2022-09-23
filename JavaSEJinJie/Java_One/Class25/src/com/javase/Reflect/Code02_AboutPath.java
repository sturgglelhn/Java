package com.javase.Reflect;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class Code02_AboutPath {
    public static void main(String[] args) throws Exception{
        // 获取绝对路径的地址
        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("com/javase/Bean/Add.properties").getPath();
        System.out.println(path);*/
        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("com/javase/Bean/Add.properties").getPath();
        FileReader reader = new FileReader(path);*/

        //InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/javase/Bean/Add.properties");

        /*Properties pro = new Properties();
        pro.load(reader);
        reader.close();

        String password = pro.getProperty("password"); //通过获取key来读取value的值
        System.out.println(password);*/







        /*String path = Thread.currentThread().getContextClassLoader().getResource("com/javase/Bean/Add.properties").getPath();
        FileReader reader = new FileReader(path);*/

        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/javase/Bean/Add.properties");

        Properties pro = new Properties();
        pro.load(reader);
        reader.close();

        String password = pro.getProperty("password");
        System.out.println(password);
    }
}
