package com.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DateTest01 {
    public static void main(String[] args) throws Exception{
        //获取系统当前时间（精确到毫秒的系统当前时间）
        Date nowTime = new Date();
        System.out.println(nowTime);    //Wed Apr 20 20:44:46 CST 2022

        //SimpleDateFormat是java.text包下的。专门负责日期格式化的
        //Date --> String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);

        //假设现在有一个日期字符串String，怎么转换成Date类型？
        //String --> Date
        String time = "2008-08-08 08:08:08 888";
        //字符串格式要个SimpleDateFormat指定的格式一样
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf2.parse(time);
        System.out.println(dateTime);   //Fri Aug 08 08:08:08 CST 2008


    }
}
