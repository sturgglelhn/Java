package com.javase.io.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo01 {
    public static void main(String[] args) throws FileNotFoundException {
        // 使用File对象创建流对象
        File file = new File("a.txt");
        FileInputStream fos = new FileInputStream(file);

        // 使用文件名称创建对象
        FileInputStream fos2 = new FileInputStream("b.txt");

    }
}
