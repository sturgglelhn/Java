package com.javase.io.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo02 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileReader fr = new FileReader("read");
        // 定义变量，保存数据
        int b;
        // 循环读取
        while((b = fr.read()) != -1){
            System.out.print((char)b);
        }
        // 关闭资源
        fr.close();
    }
}
