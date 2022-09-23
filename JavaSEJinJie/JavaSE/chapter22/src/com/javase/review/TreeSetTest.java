package com.javase.review;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //TreeSet<Integer> it = new TreeSet<>();
        TreeSet<Integer> it = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        // 遍历（迭代器方式）
        Iterator<Integer> its = it.iterator();
        while(its.hasNext()){
            Integer i = its.next();
            System.out.println(i);
        }
        it.add(100);
        it.add(99);
        it.add(36);
        it.add(27);
        it.add(129);


        // 遍历（foreach）
        for(Integer integer : it){
            System.out.println(integer);
        }


        /*TreeSet<A> atree = new TreeSet<>();
        atree.add(new A(100));
        atree.add(new A(800));
        atree.add(new A(200));
        atree.add(new A(500));
        atree.add(new A(1000));

        for(A a : atree){
            System.out.println(a);
        }*/

        TreeSet<A> tree = new TreeSet<>();
        A a1 = new A(500);
        A a2 = new A(300);
        A a3 = new A(1093);
        tree.add(a1);
        tree.add(a2);
        tree.add(a3);
        for (A aa : tree){
            System.out.println(aa);
        }

        System.out.println("-------------");
        TreeSet<B> b = new TreeSet<>(new Comparator<B>() {
            @Override
            public int compare(B o1, B o2) {
                return o2.i - o1.i;
            }
        });
        b.add(new B(1000));
        b.add(new B(200));
        b.add(new B(100));
        b.add(new B(800));
        b.add(new B(3200));
        b.add(new B(1200));
        b.add(new B(1400));

        for(B bb : b){
            System.out.println(bb);
        }
    }
}

class A implements Comparable<A>{
    int i;

    public A(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }


    @Override
    public int compareTo(A o) {
        return o.i - this.i;
    }
}

class B{
    int i;

    public B(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "B{" +
                "i=" + i +
                '}';
    }
}

/*class BComparator implements Comparator<B>{

    @Override
    public int compare(B o1, B o2) {
        return o1.i - o2.i;
    }
}*/
