package com.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
关于try...catch中的finally子句：
    1、在finally子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了异常
        finally子句必须和try一起出现，不能单独编写。

    2、finally语句通常使用在那些情况下呢？
        通常在finally语句块中完成资源的释放/关闭。
        因为finally中的代码比较有保障。
        即使try语句中的代码出现异常，finally中代码也会正常执行。
* */
public class ExceptionTest10 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            //创建输入流对象
           fis = new FileInputStream("D:\\study\\Java\\学习方法.txt");
            //开始读文件...

            String s = null;
            //这里一定会出现空指针异常！
            s.toString();
            System.out.println("hello world!");

            //流使用完需要关闭，因为流是占用资源的。
            //即使以上程序出现异常，流也必须要关闭
            //放在这里有可能流关不了了。如果出现异常代码不会指向到此处，会直接执行到catch
           //fis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally{
            System.out.println("hello 钢铁侠！");
            //流的关闭放在这里比较保险
            //finally中的代码是一定会执行的。
            //即使try中出现了异常！
            if(fis != null){
                try{
                    //close()方法有异常，采用捕捉的方式。
                    fis.close();
                }catch(IOException e){
                    e.printStackTrace();
                }

            }

        }


        System.out.println("hello kitty!");
    }
}
