package com.javase.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
FileOutputStream中的方法：
    writer(int b)方法，每次可以写出一个字节数据，代码使用演示
* */
public class demo02 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("abc.txt");

        // 写出数据
        fos.write(97);  // 第一个字符1个字节（a）
        fos.write(98);  // 第二个字符2个字节（b）
        fos.write(99);  // 第三个字符3个字节（c）


        // 关闭资源
        fos.close();
    }
}
