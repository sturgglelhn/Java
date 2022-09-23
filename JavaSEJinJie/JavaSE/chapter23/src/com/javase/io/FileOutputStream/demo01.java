package com.javase.io.FileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
FileOutputStream的构造方法如下：
    public FileOutputStream(File file)：创建文件输出流以写入由指定的 File对象表示的文件。
    public FileOutputStream(String name)： 创建文件输出流以指定的名称写入文件。

    注意：当创建一个流对象时，需要指定一个文件路径，如果该文件以及存在则会清空文件中的数据，
        如果不存在则创建一个新的文件；

* */

public class demo01 {
    public static void main(String[] args) throws FileNotFoundException {
        // 使用File对象创建流对象
        File file = new File("a.txt");
        FileOutputStream fos1 = new FileOutputStream(file);

        // 使用文件名称创建流对象
        FileOutputStream fos2 = new FileOutputStream("b.txt");
    }
}
