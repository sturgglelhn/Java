/*
	赋值运算符：
		1.赋值运算符包括"基本赋值运算符"和"扩展赋值运算符"：基本的、扩展的
		2.基本赋值运算符？
			=
		3.扩展赋值运算符？
			+=
			-=
			*=
			/=
			%=
		注意：扩展赋值运算符在编写的时候，两个符号之间不能有空格。
		4.很重要的语法机制：
			使用扩展运算符的时候，永远都不会改变运算结果类型
*/
public class OperatorTest04
{
	public static void main(String[] args){
		//研究：
		//i += 10 和i = i + 10真的是完全一样吗？
		//答案：不一样，只能说相似，其实本质上并不是完全相同。
		byte x= 100;
		System.out.println(x);	//100

		//分析：这个代码是否能够编译通过？
		//错误：不兼容的类型：从int转换到byte可能会有损失
		//x = x + 1;//编译器检测到x+1是int类型，int类型可以直接赋值给byte类型的变量x吗？

		//使用扩展赋值运算符可以吗？
		//可以的，所以得出结论：x += 1和 x = x+1不一样
		x += 1;
		System.out.println(x);//101

		//超出byte值，也不会报错
		x += 199;
		System.out.println(x);//44

		int y = 100;
		y += 100;
		System.out.println(y);

		y -= 100;
		System.out.println(y);

		y *= 10;
		System.out.println(y);

		y /= 30;
		System.out.println(y);

		y %= 10;
		System.out.println(y);
	}
}