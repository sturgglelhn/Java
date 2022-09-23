/*
关系运算符：
	>
	>=
	<
	<=
	==
	=!
	一定要记住一个规则：
		所有的关系运算符的运算结果都是布尔类型，
		不是true就是false，不可能是其他值。

	在java语言中：
		=	赋值
		==  关系运算符，判断是否相等
	注意：运算中不能有空格>= 不能 > =   
*/
public class OperatorTest02
{
	public static void main(String[] args){
		int a= 10;
		int b= 10;
		System.out.println(a > b);//false
		System.out.println(a >= b);//true
		System.out.println(a < b);//false
		System.out.println(a <= b);//true
		System.out.println(a == b);//true
		System.out.println(a != b);//false
	}
}