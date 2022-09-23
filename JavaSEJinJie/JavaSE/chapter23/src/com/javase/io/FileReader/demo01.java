package com.javase.io.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo01 {
    public static void main(String[] args) throws FileNotFoundException {
        // 使用File对象创建流对象
        File file = new File("a.txt");
        FileReader fr = new FileReader(file);

        // 使用文件名称创建流对象
        FileReader fr2 = new FileReader("b.txt");
    }
}
