package com.javase.io.FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        FileWriter fw = new FileWriter(file);

        FileWriter fw2 = new FileWriter("b.txt");
    }
}
