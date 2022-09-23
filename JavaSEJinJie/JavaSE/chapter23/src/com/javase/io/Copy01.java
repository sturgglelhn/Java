package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
使用FileInputStream + FileOutputStream完成文件的拷贝
拷贝的过程应该是一边读，一边写
使用以上的字节流拷贝文件的时候，文件类型随意，万能的。什么样的文件都能拷贝。
* */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 创建一个输入流对象
            fis = new FileInputStream("D:\\study\\Java\\03-尚学堂高琪Java300集\\1_java300集大型基础课程介绍_如何学习.wmv");
            // 创建一个输出流对象
            fos = new FileOutputStream("D:\\study\\Java\\1_java300集大型基础课程介绍_如何学习.wmv");

            // 最核心的：一边读，一边写。
            byte[] bytes = new byte[1024 * 1024];
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1){
                fos.write(bytes,0,readCount);
            }

            // 刷新，输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 一定要分开处理异常，如果一旦出现异常，就会停止，不会在处理异常。
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
