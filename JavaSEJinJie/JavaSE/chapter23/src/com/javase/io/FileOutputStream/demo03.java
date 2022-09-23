package com.javase.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class demo03 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象（如果有这个文件将清空这个文件的数据）
        FileOutputStream fos = new FileOutputStream("abc.txt");
        // 字符串转换为字节数组
        byte[] b = "东方准备".getBytes();
        // 写出字节数组数据
        fos.write(b);
        // 关闭资源
        fos.close();
    }
}
