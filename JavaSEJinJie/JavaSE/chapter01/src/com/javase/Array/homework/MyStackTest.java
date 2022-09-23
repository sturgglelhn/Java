package com.javase.Array.homework;

public class MyStackTest {
    public static void main(String[] args) {

        // 创建一个栈对象，初始化容量是10个
        MyStack stack = new MyStack();

        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        //压这个的时候失败了
        stack.push(new Object());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.pop();

    }
}
