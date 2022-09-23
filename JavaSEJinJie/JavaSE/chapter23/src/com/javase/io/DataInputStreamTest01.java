package com.javase.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
DataInputStream：数据字节输入流。
DataOutputStream：写的文件，只能使用DataInputStream去读。并且读的时候你需要提前知道写入的顺序。
读的顺序和写的顺序一致。才可以正常取出数据。
* */
public class DataInputStreamTest01 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("data"));

        byte b = dis.readByte();
        short s = dis.readShort();
        int i  = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        char c = dis.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i + 1300);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
    }
}
