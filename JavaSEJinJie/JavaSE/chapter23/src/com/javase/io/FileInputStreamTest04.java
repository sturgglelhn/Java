package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 【重点掌握】
* */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file03");

            byte[] bytes = new byte[4];
            /*while(true){
                int readCount = fis.read(bytes);
                if(readCount == -1){
                    break;
                }
                // 把byte数组转换成字符串，读到多少个转换多少个。
                System.out.print(new String(bytes,0,readCount));
            }*/

            int readCound = 0;
            while((readCound = fis.read(bytes)) != -1){
                System.out.print(new String(bytes, 0,readCound));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
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
