package com.javase.io;

import java.io.*;

public class Copy02 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            // 读
            in = new FileReader("D:\\数据结构.txt");
            // 写
            out = new FileWriter("D:\\study\\Java\\courses\\JavaProjects\\JavaSEJinJie\\JavaSE\\chapter23\\数据结构.txt");

            // 一边都读一边写
            char[] chars = new char[1024 * 512];    // 1MB
            int readCount = 0;
            while((readCount = in.read(chars)) != -1){
                out.write(chars,0,readCount);
            }

            // 刷新
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
