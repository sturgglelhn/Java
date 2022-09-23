package com.javase.integer;

//实际开发中不用自己写
//SUN公司已经写好了，我们直接调用就行了
public class MyInt {
    int value;

    public MyInt() {
    }

    public MyInt(int value) {
        this.value = value;
    }

    public String toString(){
        return String.valueOf(value);//变成字符串100返回String
    }
}
