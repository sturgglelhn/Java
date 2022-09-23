package com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
文件字节输出流，负责写。
从内存到硬盘
* */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // myfile文件不存在的时候会自动新建
            //fos = new FileOutputStream("myfile");
            // 这种方式谨慎使用，这种方式会先将元文件清空，然后重新写入。
            //fos = new FileOutputStream("tempfile");

            // 以追加的方式在文件末尾写入。不会清空原文件内容。
            fos = new FileOutputStream("tempfile",true);

            // 开始写
            byte[] bytes = {97, 98, 99, 100, 101};
            // 将byte数组全部写出，并生成文件
            fos.write(bytes);   // abcde

            fos.write(bytes, 0, 2); // 在写出ab

            //字符串
            String s = "我是一个中国人，我骄傲！";
            // 将字符串转换成byte数组。
           byte[] bs = s.getBytes();
           // 写
           fos.write(bs);

            // 写完最后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
