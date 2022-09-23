package com.javase.io.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class demo05 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("fw.txt");

        String msg = "我是中国人";
        fw.write(msg);
        fw.write(msg,1,3);
        fw.close();
    }
}
