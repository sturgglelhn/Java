package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {

            fis = new FileInputStream("D:\\study\\Java\\courses\\JavaProjects\\JavaSEJinJie\\JavaSE\\temp");

            //开始读
            int readData = fis.read();
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData);

            // 末尾读不到任何数据返回-1
            readData = fis.read();
            System.out.println(readData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 在finally语句块当中确保流一定关闭。
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
