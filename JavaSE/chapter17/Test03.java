package com.bjpowernode.javase.chapter17;
import java.util.Scanner;

public class Test03{
	public static void main(String[] args){
		
		//为什么要这样写？
		//Test03类和Scanner类不在同一包下
		//java.util就是Scanner类的包名。
		Scanner s = new Scanner(System.in);
		System.out.print("请您输入字符串：");
		String str = s.next();
		System.out.println("您输入的字符串是：" + str);
	}
}