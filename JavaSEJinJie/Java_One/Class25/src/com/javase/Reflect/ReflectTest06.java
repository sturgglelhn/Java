package com.javase.Reflect;

import com.javase.Bean.Student;

import java.lang.reflect.Field;

/*
必须掌握：
    怎么通过反射机制访问一个java对象的属性？
        给属性赋值set
        获取属性的值get
* */
public class ReflectTest06 {
    public static void main(String[] args) throws Exception{
        // 我们不使用反射机制，怎么去访问一个对象的属性呢？
        Student s = new Student();
        s.no = 1111;
        //System.out.println(s.no);// 不使用反射机制代码不灵活

        // 使用反射机制，怎么去访问一个对象的属性。（get set）
        Class studentClass = Class.forName("com.javase.Bean.Student");
        Object obj = studentClass.newInstance(); //obj就是Student对象。（底层调用无参数构造方法）

        // 获取no属性（根据属性的名称来获取Field），拿到属性
        Field noFiled = studentClass.getDeclaredField("no");

        // 给obj对象（Student对象）的no属性赋值
        /*
        虽然使用了反射机制，但是三要素还是缺一不可：
            要素1：obj对象
            要素2：no属性
            要素3：22222值
        注意：反射机制让代码复杂了，但是为了一个“灵活”
        * */
        // 给属性赋值
        noFiled.set(obj,22222); // 给obj对象的no属性赋值22222

        // 读取属性的值
        // 两个要素：获取obj对象的no属性的值。
        System.out.println(noFiled.get(obj));  // 取出属性


        // 可以访问私有的属性吗？
        Field nameField = studentClass.getDeclaredField("name");
        // 打破封装（反射机制的缺点：打破封装，可能会给不法分子留下机会！！！！）
        // 这样设置完之后，在外部也是可以访问private的。
        nameField.setAccessible(true);
        // 给name属性赋值
        nameField.set(obj,"jackson");
        // 获取name属性的值
        System.out.println(nameField.get(obj));
    }
}
