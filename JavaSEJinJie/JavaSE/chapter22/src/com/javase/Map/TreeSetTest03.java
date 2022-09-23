package com.javase.Map;

import java.util.TreeSet;

/*
对自定义的类型来说，TreeSet可以排序吗？
    以下程序中对于Person类型来说，无法排序。因为没有指定Person对象之间的比较规则
    谁大谁小并没有说明啊。

    以下程序运行的时候出现了这个异常：
        java.lang.ClassCastException:
        class com.javase.Map.Person cannot be cast to class java.lang.Comparable
    出现这个异常的原因是：
        Person类没有实现java.lang.Comparable
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        Person p1 = new Person(20);
        Person p2 = new Person(30);
        Person p3 = new Person(25);
        Person p4 = new Person(14);

        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p4);

        for (Person p : personTreeSet){
            System.out.println(p);
        }

    }

}

class Person{
    int age;
    public Person(int age){
        this.age = age;
    }

    public String toString(){
        return "Person[age="+age+"]";
    }
}
