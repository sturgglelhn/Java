package com.javase.io.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class demo04 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("fw.txt");

        // 字符数组转换为字节数组
        char[] chars = "我是中国人".toCharArray();

        // 写出字符数组
        fw.write(chars);    // 我是中国人

        // 写出从索引2开始，2个自己。索引2是'中'，两个字节，也就是'中国'。
        fw.write(chars,2,2);    // 中国

        // 关闭资源
        fw.close();
    }
}
