package com.javase.io.FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo06 {
    public static void main(String[] args) throws IOException {
        FileWriter f2 = new FileWriter("fw.txt");

        f2.write("我是");
        f2.write("\r\n");
        f2.write("中国人");
        f2.close();
    }
}
