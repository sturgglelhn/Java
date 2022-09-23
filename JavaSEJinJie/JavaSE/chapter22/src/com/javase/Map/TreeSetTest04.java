package com.javase.Map;

import java.util.TreeSet;

public class TreeSetTest04 {
    public static void main(String[] args) {
        User p1 = new User(20);
        User p2 = new User(30);
        User p3 = new User(25);
        User p4 = new User(14);

        TreeSet<User> personTreeSet = new TreeSet<>();
        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p4);

        for (User p : personTreeSet){
            System.out.println(p);
        }
    }
}

class User implements Comparable<User>{
    int age;
    public User(int age){
        this.age = age;
    }

    // 需要在这个方法中编写比较的逻辑，或者说比较规则，按照什么进行比较！
    @Override
    public int compareTo(User o) {
        //return 0;

        return this.age - o.age;
    }

    public String toString(){
        return "User[age="+age+"]";
    }

}

