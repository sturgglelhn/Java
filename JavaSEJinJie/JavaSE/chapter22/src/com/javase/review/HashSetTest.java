package com.javase.review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("def");
        set.add("king");

        // 迭代器（遍历）
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 遍历集合（foreach）
        for(String s : set){
            System.out.println("-->"+s);
        }
        set.add("king");
        set.add("abc");
        System.out.println(set.size());

        Set<Student> students = new HashSet<>();
        Student s1 = new Student(111,"zhangsan");
        Student s2 = new Student(222,"lisi");
        Student s3 = new Student(111,"zhangsan");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students.size());

        for(Student stu : students){
            System.out.println(stu);
        }
    }
}

class Student{
    int no;
    String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}

