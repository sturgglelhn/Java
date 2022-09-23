package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream类的其它常用方法：
    int available()： 返回流当中剩余的没有读到的字节数量
    long skip(long n)：跳过几个字节不读
* */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file02");
            // 总字节数量
            System.out.println("总字节数量："+fis.available());
            // 读1个字节
            //int readByte = fis.read();
            // 还剩下可以都的字节数量是：5
            //System.out.println("剩余多少个字节没有读："+fis.available());

            // 这个方法有什么用？
            byte[] bytes = new byte[fis.available()];
            // 不需要循环了
            // 直接都一次就行了
            //int readCount = fis.read(bytes);
           // System.out.println(new String(bytes));

            // skip跳过几个字节不读取，这个方法也可能以后会用!
            fis.skip(3);
            System.out.println(fis.read()); //100


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
