package com.javase.integer;

/*
总结一下之前所学的经典异常？
    空指针异常：NullPointerException
    类型转换异常：ClassCastException
    数组下标越界异常：ArrayIndexOutOfBoundsException
    数字格式化异常：NumberFormatException
* */
public class integerTest07 {
    public static void main(String[] args) {
        //手动装箱
        Integer x = new Integer(1000);

        //手动拆箱
        int y = x.intValue();
        System.out.println(y);

       // Integer a = new Integer("中文");//NumberFormatException

        //重点方法
        //static int parseInt(String s)
        //静态方法，传参String，返回int
        int retValue = Integer.parseInt("123");
        System.out.println(retValue+100);

        double retValue2 = Double.parseDouble("3.14");
        System.out.println(retValue2+2);//5.140000000000001 存储的是近似值，精度问题

        float retValue3 = Float.parseFloat("1.0");
        System.out.println(retValue3+2);

        long retValue4 = Long.parseLong("46424");
        System.out.println(retValue4 + 23);


        //-------------------------以下内容作为了解---------------------------
        //static String toBinaryString(int i)
        //静态的：将十进制转换成二进制字符串。
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString);

        //static String toHexString(int i)
        //静态的：将十进制转换成十六进制字符串。
        String hexString = Integer.toHexString(16);
        System.out.println(hexString);

        //static String toOctalString(int i)
        //静态的：将十进制转换成八进制字符串。
        String octalString = Integer.toOctalString(8);
        System.out.println(octalString);
    }
}
