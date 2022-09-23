package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        /*FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\study\\Java\\courses\\JavaProjects\\JavaSEJinJie\\JavaSE\\temp");
            *//*while(true){
                int readData = fis.read();
                if(readData == -1){
                    break;
                }
                System.out.println(readData);
            }*//*

            int readData = 0;
            while((readData = fis.read()) != -1){
                System.out.println(readData);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file02");
            byte[] bytes = new byte[5];
            int readData = 0;
            while((readData = fis.read(bytes)) != -1){
                System.out.print(new String(bytes,0,readData));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
