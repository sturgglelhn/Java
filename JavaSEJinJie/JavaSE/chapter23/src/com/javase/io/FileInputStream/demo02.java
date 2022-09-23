package com.javase.io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");

        int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        // 读取到末尾,返回-1
        read = fis.read();
        System.out.println(read);
        // 再读还是-1
        read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);
        // 关闭资源
        fis.close();


        fis.close();
    }
}
