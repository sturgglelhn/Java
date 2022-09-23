package com.javase.io;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter:
    文件字符输出流：写。
    只能输出普通文本。
* */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            // 创建文件字符输出流对象，加true之后会在后面追加
            out = new FileWriter("file03",true);

            // 开始写
            char[] chars = {'我','是','中','国','人'};
            out.write(chars);
            out.write(chars,2,3);

            out.write("我是一名java软件工程师！");
            out.write("\n");
            out.write("Hello World!");

            // 刷新
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
