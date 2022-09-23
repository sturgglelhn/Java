package com.javase.io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo06 {
    public static void main(String[] args) throws IOException {
        // 第一种方式
       /* // 1.创建输入流，用于读取文件
        FileInputStream fis = new FileInputStream("D:\\class2.txt");
        // 2.创建输出流，用于写出文件
        FileOutputStream fos = new FileOutputStream("D:\\class3.txt");

        // 3.定义数组大小（一次性读取多少个字节）
        byte[] b = new byte[1023];
        // 4.定义变量，接受每次实际读取到的数据长度
        int len;
        // 5.循环读取出并写出
        while((len = fis.read(b)) != -1){
            // 将数据数组中的数据写入关联到指定文件
            fos.write(b,0,len);
        }

        // 6. 释放资源
        fos.close();
        fis.close();*/
    }
}
