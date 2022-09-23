package com.javase.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo05 {
    public static void main(String[] args) throws IOException {
        /*FileOutputStream fos = new FileOutputStream("abc.txt",true);

        byte[] b = "abcde".getBytes();
        fos.write(b);
        fos.close();*/
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("abc.txt");
        // 定义字节数组
        byte[] words = {97,98,99,100,101};
        // 遍历数组
        for(int i = 0; i<words.length; i++){
            // 写出一个字节
            fos.write(words[i]);
            // 写出一个换行，换行符号转成数组写出
            fos.write("\r\n".getBytes());
        }
        // 关闭资源
        fos.close();
    }
}
