package com.javase.annotation5;

public class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception{
        // 获取这个类
        Class c = Class.forName("com.javase.annotation5.Test5_1");
        // 判断类上面是否有@MyAnnotation5_1
        //System.out.println(c.isAnnotationPresent(MyAnnotation5_1.class));//true
        if(c.isAnnotationPresent(MyAnnotation5_1.class)){
            // 获取该注解对象
            MyAnnotation5_1 myAnnotation5_1 = (MyAnnotation5_1) c.getAnnotation(MyAnnotation5_1.class);
            System.out.println("类上面的注解对象" + myAnnotation5_1);//类上面的注解对象@com.javase.annotation5.MyAnnotation5_1()

            // 获取注解对象的属性怎么办？和调接口没有区别
            String value = myAnnotation5_1.value();
            System.out.println(value);
        }


        // 判断String类上面是否存在这个注解
        Class StringClass = Class.forName("java.lang.String");
        System.out.println(StringClass.isAnnotationPresent(MyAnnotation5_1.class)); //false



    }
}
