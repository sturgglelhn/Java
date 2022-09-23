package com.javase.collection.FanXing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        //Collection List = new ArrayList();
       List<City> list = new ArrayList();

        list.add(new City("台湾","台","华东"));
        list.add(new City("澳门","澳","华南"));
        list.add(new City("香港","港","华南"));
        list.add(new City("河北","冀","华北"));

        /*List.add(new Book("《史记》","司马迁"));
        List.add(new Book("《三国志》","陈寿"));*/

        Iterator<City> iterator = list.iterator();
        while(iterator.hasNext()){
            //集合中的元素都被提升为Object对象了
            //Object obj = iterator.next();

            //强制转换为子类
            //City city = (City) obj;

            City city = iterator.next();

            // 调用子类特有的功能
            city.intro();
        }
    }
}

/*
如果不适用泛型会出现问题：java.lang.ClassCastException

* */