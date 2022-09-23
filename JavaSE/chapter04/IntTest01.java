
/*
public class IntTest01
{
	public static void main(String[] args)
	{
		int a = 10;
		System.out.println(a);
		int b = 010;
		System.out.println(b);
		int c = 0x10;
		System.out.println(c);
		int d = 0b10;
		System.out.println(d);
	}
}*/



/*
在java中有一条非常重要的规则，必须记住:
	在任何情况下，整数型的"字面量/数据"默认被当做int类型处理。（记住就行）
	如果希望该"整数型字面量"被当做long类型来处理，需要在"字面量"后面添加L/l
	建议使用大写的L,因为小写l和1分不清

*/
public class IntTest01
{
	public static void main(String[] args)
	{
		//分析这个代码存在类型转换吗，以下代码什么意思？
		//不存在的类型转换
		//100这个字面量被当做int类型处理
		//a变量是int类型，所以存在类型的转换
		//int类型的字面量赋值给int类型的变量
		int a = 100;
		System.out.print(a);
		
		//分析：200这个字面量默认被当做int类型来处理
		//b变量是long类型，int类型占4个字节，long类型占8个字节
		//小容量可以自动转换成大容量，这种操作被称为：自动类型转换
		long b = 200;
		System.out.println(b);

		//这个不存在类型转换
		//在整数型字面量300后面添加一个L之后，300L联合起来就是一个long类型的字面量
		//c变量是long类型，long类型赋值给long类型不存在类型转换
		long c = 300L;
		System.out.println(c);

		long d = 2147483647;
		System.out.println(d);

		//long e = 2147483648;
		//System.out.println(e);
		/*
		IntTest01.java:54: 错误: 过大的整数: 2147483648
                long e = 2147483648;
                         ^
		1 个错误
		解决办法是在字面量后面加L
		*/
		long e = 2147483648L;
		System.out.println(e);//能正确输出
	}
}



