package com.javase.Reflect;

import com.javase.Bean.User;

/*
获取到Class，能干什么？
    通过Class的newInstance()方法来实例化对象。
    注意：newInstance()方法内部实际上调用了无参数构造方法，必须保证无参构造存在才可以。

   反射机制灵活？
   灵活在哪里呢？
   请看ReflectTest02.java
* */
public class ReflectTest01 {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user);

        // 下面这段代码是以反射极致的方式创建对象。
        try {
            // 通过反射机制，获取Class，通过Class来实例化对象
            Class c = Class.forName("com.javase.Bean.User");// c代表User类型。

            // newInstance() 这个方法会调用User这个类的无参数构造方法，完成对象的创建
            // 重点是：newInstance()调用的是无参构造，必须保证无参构造是存在的！
            Object obj = c.newInstance();

            System.out.println(obj);// com.javase.Bean.User@1d81eb93
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
