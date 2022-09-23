package com.javase.Reflect;

import com.javase.Bean.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
反射属性(了解一下)
* */
public class ReflectTest04 {
    public static void main(String[] args) throws Exception{
        Class studentClass = Class.forName("com.javase.Bean.Student");

        String className = studentClass.getName();
        System.out.println("完成类名：" + className);

        String simpleName = studentClass.getSimpleName();
        System.out.println("简类名："+simpleName);

        // 获取类中所有的Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);// 测试数组中只有1个元素
        Field f = fields[0];
        // 取出这个Field的名字
        String fieldName = f.getName();
        System.out.println(fieldName);

        System.out.println("-------------");
        Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length);
        for(Field field: fs){
            // 获取属性的修饰符列表？？？
            int i = field.getModifiers();
            String modifierString = Modifier.toString(i);
            System.out.println(modifierString);
            //System.out.println(i);

            // 获取属性的类型
            Class fieldType = field.getType();
            //String fName = fieldType.getName();
            String fName = fieldType.getSimpleName();
            System.out.println(fName);

            // 获取属性的名字
            System.out.println(field.getName());
        }

    }
}
