package com.javase.io.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class demo02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("fw.txt");

        fw.write(97);
        fw.write('b');
        fw.write('c');
        fw.write(22909);

        /*
        【注意】关闭资源时，与FileOutputStream不同。
        如果不关闭，数据只是保存到缓冲区，并未保存到文件。
        * */
        fw.close();
    }
}
