package com.javase.io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo07 {
    public static void main(String[] args) {
        // 第二种方式
        // 写入
        FileInputStream fis = null;
        // 写出
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("D:\\数据结构.txt");
            fos = new FileOutputStream("D:\\数据读出.txt");

            int readCount = 0;
            byte[] bytes = new byte[1024];

            while((readCount = fis.read(bytes)) != -1){
                fos.write(bytes,0,readCount);
            }

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
