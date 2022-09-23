package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
int read(byte[] b)
    一次最多读取b.length个字节
* */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //fis = new FileInputStream("chapter01/tempfile");
            fis = new FileInputStream("D:\\study\\Java\\courses\\JavaProjects\\JavaSEJinJie\\JavaSE\\temp");

            // 开始读，采用byte数组，一次读取多个字节。最多读取“数组.length”个字节。
            byte[] bytes = new byte[4]; // 准备一个4个长度的byte数组，一次最多读取4个字节。
            // 这个方法的返回值是：读取到的字节数量。（不是字节本身）
            int readCount = fis.read(bytes);
            System.out.println(readCount);  //第一次读到了4个字节
            System.out.println(new String(bytes,0,readCount));  // abcd

            readCount = fis.read(bytes);
            System.out.println(readCount);  //第二次读到了2个字节
            System.out.println(new String(bytes,0,readCount));  // efcd

            readCount = fis.read(bytes);    // 1个字节都没有读取到返回-1
            System.out.println(readCount);  // -1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
