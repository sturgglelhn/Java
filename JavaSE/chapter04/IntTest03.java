/*
java中有一个语法规则:
	当这个整数型字面量没有超出byte的取值范围，那么这个
	整数型字面量可以直接赋值给byte类型的变量。

这种语法机制是为了方便写代码，而存在的。
	
*/
public class IntTest03
{
	public static void main(String[] args){
		
		//分析：以下代码编译可以通过吗？
		//300 被默认当做int类型
		//b变量是byte类型
		//大容量转换小容量，要想编译通过，必须使用强制了类型转换符
		//错误：不兼容的类型：从int转换到byte可以会损失精度
		//byte b = (byte)300;

		//300这个int类型对应的二进制：00000000 00000000 00000001 00101100
		//byte占用1个字节，砍掉前3个字节：00101100（44）
		byte b = (byte)300;
		System.out.println(b);//输出44
		

		//这个编译能通过吗？
		//1是int类型，默认被当做int类型来看
		//x是byte类型，1个字节，大容量无法直接转换成小容量
		//按说是编译报错
		byte x = 1;
		byte y = 127;
		//没有报错

		System.out.println(x);//1
		System.out.println(y);//127

		
		//当整数型字面量没有超出short类型取值范围的时候，该字面量可以直接赋给short类型的变量。
		short s1 = 1;
		System.out.println(s1);
		short s2 = 32767;
		System.out.println(s2);
		//	是可以通过的

		//short s3 = 32768;
		//System.out.println(s3);
//IntTest03.java:44: 错误: 不兼容的类型: 从int转换到short可能会有损失
//              short s3 = 32768;
//3 个错误
	}
}