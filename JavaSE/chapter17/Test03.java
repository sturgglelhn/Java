package com.bjpowernode.javase.chapter17;
import java.util.Scanner;

public class Test03{
	public static void main(String[] args){
		
		//ΪʲôҪ����д��
		//Test03���Scanner�಻��ͬһ����
		//java.util����Scanner��İ�����
		Scanner s = new Scanner(System.in);
		System.out.print("���������ַ�����");
		String str = s.next();
		System.out.println("��������ַ����ǣ�" + str);
	}
}