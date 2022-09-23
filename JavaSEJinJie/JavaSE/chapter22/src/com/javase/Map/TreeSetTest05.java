package com.javase.Map;

import java.util.TreeSet;

/*
先按照年龄升序，如果年龄一样的在按照姓名升序
* */
public class TreeSetTest05 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();
        vips.add(new Vip("zhangsi",20));
        vips.add(new Vip("zhangsan",20));
        vips.add(new Vip("king",18));
        vips.add(new Vip("soft",17));
        for(Vip vip : vips){
            System.out.println(vip);
        }
    }
}

class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    compareTo方法的返回值很重要：
        返回0表示相同，value会覆盖
        返回>0，会继续在右子树上找。【10-9=1, 1>0的说明左边这个数字比较大。】
        返回<0，会继续在左子树上找。
    * */
    @Override
    public int compareTo(Vip o) {
        if(this.age == o.age){
            return this.name.compareTo(o.name);
        }else {
            return this.age - o.age;
        }

        //return this.age - o.age; //如果age相等的话就直接覆盖了
    }
}
