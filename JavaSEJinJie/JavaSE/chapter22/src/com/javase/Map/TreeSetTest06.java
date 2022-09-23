package com.javase.Map;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;


/*
TreeSet集合中元素可排序的第二种方式：使用比较器的方式
最终的结论：
    放到TreeSet或者TreeMap集合key部分的元素要想做到排序，包括两种方式：
        第一种：放在集合中的元素实现java.lang.Comparable接口。
        第二种：在构造TreeSet或者TreeMap集合的时候给它一个比较器对象。(Comparator)
 Comparable和Comparator怎么选择呢？
    当比较规则不会发生改变的时候，或者说当比较规则只有1个的时候，建议实现Comparable接口。
    如果比较规则有多个，并且需要多个规则之间频繁切换，建议使用Comparator接口
* */
public class TreeSetTest06 {
    public static void main(String[] args) {
        //TreeSet<WuGui>
        //TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());

        //使用匿名内部内的方式
        TreeSet<WuGui> wuGuis = new TreeSet<>(new Comparator<WuGui>() {
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o1.age - o2.age;
            }
        });

        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(800));
        wuGuis.add(new WuGui(810));

        for(WuGui wuGui : wuGuis){
            System.out.println(wuGui);
        }
    }
}

//乌龟
class WuGui{
    int age;

    public WuGui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "乌龟[" +
                "age=" + age +
                ']';
    }

}

// 单独在这里编写一个比较器
// 比较器实现java.util.Comparator接口。（Comparable是java.lang包下的。Comparator是java.util包下的）
/*
class WuGuiComparator implements Comparator<WuGui> {
    public int compare(WuGui o1,WuGui o2){
        return o1.age - o2.age;
    }

}*/

/*
class WuGuiComparator implements Comparator<WuGui>{

    @Override
    public int compare(WuGui o1, WuGui o2) {
        return o1.age - o2.age;
    }
}*/
