package com.javase.Reflect;

public class Code01_Class {
    public static void main(String[] args) {

        // 第一种方法：Class c = Class.forName("加上包名，例如：java.lang.String");
        Class c1 = null;
        Class c2 = null;
        Class c3 = null;
        Class c4 = null;
        Class c5 = null;
        Class c6 = null;
        Class c7 = null;
        Class c8 = null;
        Class c9 = null;
        try {
            c1 = Class.forName("java.lang.String");
            /*Class c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.Integer");
            Class c4 = Class.forName("java.lang.System");*/
            c2 = Class.forName("java.lang.Float");
            c3 = Class.forName("java.lang.Double");
            c4 = Class.forName("java.lang.Short");
            c5 = Class.forName("java.lang.Byte");
            c6 = Class.forName("java.lang.Integer");
            c7 = Class.forName("java.lang.Character");
            c8 = Class.forName("java.lang.Boolean");
            c9 = Class.forName("java.lang.Long");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//-------------------------------------------------------------------------------------------------
        // 第二种方式： Class c = 对象.getClass(); 例如：Class s1 = f.getClass();
        Float f = 3.5F;
        Class s1 = f.getClass();
        // System.out.println(s1 == c2);    // true

        Long l = 7823L; // 自动封装
        Class s2 = l.getClass();

        Double b = 78.34134D;
        Class s3 = b.getClass();
        //System.out.println(s3 == c3); //true

        Short sh = 8923;
        Class s4 = sh.getClass();
        Boolean bo = false;
        Class s5 = bo.getClass();
        //System.out.println(s5 == c8);   //true


//--------------------------------------------------------------------------------------------------
        // 第三种方式：Class c = 任务类型.class   例如：Class x = Long.class;
        Class x = Long.class;
        // System.out.println(x == s2);    //true
        Class x1 = Float.class;
        // System.out.println(s1 == x1);   //true
        Class x2 = Short.class;
        //System.out.println(x2 == s4);   //true

        Class x3 = Byte.class;
        System.out.println(x3 == c5);   // true

        Class x4 = Double.class;
        System.out.println(x4 == c3);   //true

    }
}
