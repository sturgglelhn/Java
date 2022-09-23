package com.javase.io.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo03 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileReader fr = new FileReader("read");
        // 定义变量，保存有效字符个数
        int len ;
        // 定义字符数据，作为装字符数据的容器
        char[] cbuf = new char[2];

        // 循环读取
        while((len = fr.read(cbuf)) != -1){
            System.out.println(new String(cbuf,0,len));
        }
        // 关闭资源
        fr.close();
    }
}
