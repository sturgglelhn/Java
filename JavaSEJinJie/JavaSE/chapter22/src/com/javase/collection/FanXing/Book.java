package com.javase.collection.FanXing;

public class Book {
    private String name;
    private String price;

    public void detail(){
        System.out.println("书名："+name+"，价格"+price);
    }

    public Book() {
    }

    public Book(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
