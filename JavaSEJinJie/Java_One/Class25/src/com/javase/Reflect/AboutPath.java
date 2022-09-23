package com.javase.Reflect;

/*
研究一下文件路径的问题
怎么获取一个文件的绝对路径。以下讲解的这种方式是通用的。但前提是：文件需要在类的路径下。才能用这种方式。
* */
public class AboutPath {
    public static void main(String[] args) {
        // 这种方式的路径的缺点是：移植性差，在IDEA中默认的当前路径是project的根。
        // 离开IDEA工具就会找不到这个路径了
        // FileReader reader = new FileReader("Class25/classinfo2.properties");

        // 接下来说一种比较通用的一种路径。即使代码换位置了，这样编写仍然是通用的。
        // 注意：使用以下通用方式的提前是：这个文件必须在类路径下。
        // 什么是类路径下？方式在src下的都是类路径下。【记住它】
        // src是类的根路径。

        // Thread.currentThread() 当前线程对象
        // getContextClassLoader() 是线程对象的方法，可以获取到当前线程的类加载器对象。
        // getResource()    【获取资源】这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源。
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();
        // 这种获取路径的方式是通用的

        // 文件的绝对路径
        // D:/study/Java/courses/JavaProjects/JavaSEJinJie/Java_One/out/production/Class25/classinfo2.properties

        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();*/
        System.out.println(path);

        // 获取db.properties文件的绝对路径（从类的根路径下作为起点开始）
        // 默认从src为起来开始获取路径，所以需要把src下的路径打出来
        String path2 = Thread.currentThread().getContextClassLoader()
                .getResource("com/javase/Bean/db.properties").getPath();
        System.out.println(path2);
    }
}
