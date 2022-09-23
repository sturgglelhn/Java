package com.javase.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        // 获取文件名
        File f1 = new File("D:\\study\\Java\\数据结构.txt");
        // 判断是否是一个目录
        System.out.println("文件名："+f1.getName());
        // 判断是否是一个文件
        System.out.println(f1.isDirectory());
        // 获取文件最后一次修改时间
        System.out.println(f1.isFile());

        // 获取文件最后一次修改时间
        long haoMiao = f1.lastModified();   // 这个毫秒是从1970年到现在的总毫秒。
        Date time = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        System.out.println(f1.length());

    }
}
