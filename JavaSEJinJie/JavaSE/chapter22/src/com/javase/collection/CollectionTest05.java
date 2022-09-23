package com.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        User u1 = new User("jack");
        c.add(u1);
        User u2 = new User("jack");
        //没有重写equals之前：这个结果是false
        //System.out.println(c.contains(u2));//false
        //重写equals方法之后，比较的时候会比较name.
        System.out.println(c.contains(u2)); //true

        Collection cc = new ArrayList();
        //创建字符串对象
        String s1 = new String("hello");
        //加进去
        cc.add(s1);
        //创建了一个新的字符串对象
        String s2 = new String("hello");
        //删除s2
        cc.remove(s2);
        System.out.println(cc.size());//0
        //说明底层调用的也是equals方法，java认为s1和s2是一样的。
    }
}

class User{
    private String name;
    public User(){

    }
    public User(String name){
        this.name = name;
    }

    //重写equals方法
    //将来调用equals方法的时候，一定是调用这个重写的equals方法。
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }
}
