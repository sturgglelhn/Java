package com.javase.io.FileWriter;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        File f = new File("D:\\study\\Java");
        File[] files = f.listFiles();
        for(File file : files){
            // 获取当前文件下的所有子文件路径
            //System.out.println(file.getAbsolutePath());
            // 获取当前文件下的所有子文件名
            System.out.println(file.getName());
        }

    }
}
