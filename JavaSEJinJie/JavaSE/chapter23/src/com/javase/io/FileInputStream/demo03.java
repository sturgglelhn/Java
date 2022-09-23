package com.javase.io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo03 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("a.txt");
        // 定义变量，保存数据
        int b;
        // 循环读取，只要读取的不是-1 就继续读
        while((b = fis.read()) != -1){
            System.out.print((char)b);
        }
        // 关闭资源
        fis.close();
    }
}
