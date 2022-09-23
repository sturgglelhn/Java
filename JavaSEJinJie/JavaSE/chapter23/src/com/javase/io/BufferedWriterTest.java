package com.javase.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/*
BufferedWriter：带有缓冲的字符输出流。
* */
public class BufferedWriterTest{
    public static void main(String[] args) throws Exception{
       // BufferedWriter out = new BufferedWriter(new FileWriter("copy"));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy",true)));
        // 开始写
        out.write("hello World!");
        out.write("\n");
        out.write("hello kitty!");
        out.write("\n");
        out.write("陈吕琦是猪！");
        out.write("琦琦");

        out.flush();
        out.close();
    }
}
