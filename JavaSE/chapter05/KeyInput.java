/*
1、输出信息到控制台：
	System.out.println(...);
2、在Java中怎么接受键盘的输入呢？
	

*/
public class KeyInput
{
	public static void main(String[] args){
		
	//创建一个键盘扫描器对象
	java.util.Scanner s = new java.util.Scanner(System.in);

	//接收用户的输入，从键盘上接收一个int类型的数据
	//解释这行代码，尽量让大家明白：代码执行到这里的时候，会暂停下来
	//等待用户的输入，用户可以从键盘上输入一个整数，然后回车，回车之后
	//i变量就有值了，并且i变量中保存的这个值是用户输入的数字。
	//i变量就是接收键盘数据的。
	int i = s.nextInt();
	System.out.println("您输入的数字是：" + i);

	int j = s.nextInt();
	System.out.println("您输入的数字是：" + j);

	String str = s.next();
	System.out.println("您输入了:" + str);

	System.out.print("请输入用户名：");
	String name = s.next();
	System.out.println("欢迎"+name+"回来");
	}
}