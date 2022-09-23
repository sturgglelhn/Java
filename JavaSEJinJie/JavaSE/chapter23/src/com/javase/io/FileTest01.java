package com.javase.io;

import java.io.File;

public class FileTest01 {
    public static void main(String[] args) throws Exception{

        File f1 = new File("D:\\study\\Java\\file");

        // 判断时否存在
        System.out.println(f1.exists());

        /*if(!f1.exists()){
            // 以文件的形式新建
            f1.createNewFile();
        }*/

        // 创建一个目录
        /*if(!f1.exists()){
            // 以目录的形式新建
            f1.mkdir();
        }*/

        //创建多重目录
        /*File f2 = new File("D:/a/b/c/d/e/f");
        if(!f2.exists()){
            f2.mkdirs();
        }*/

        File f3 = new File("D:\\study\\Java\\数据结构.txt");
        // 获取文件的父路径
        String parentPath = f3.getParent();
        System.out.println(parentPath); // D:\study\Java

        // 获取父路径的绝对路径
        File parentFile = f3.getParentFile();
        System.out.println("获取绝对路径："+parentFile.getAbsolutePath());

        // 获取当前路径
        File f4 = new File("file");
        System.out.println("绝对路径：" + f4.getAbsolutePath()); //D:\study\Java\courses\JavaProjects\JavaSEJinJie\JavaSE\chapter01\file
    }
}
