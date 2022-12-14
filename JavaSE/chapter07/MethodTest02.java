/*
	1、方法怎么定义，语法机制是什么？
		[修饰符列表] 返回值类型 方法名(形式参数列表){
			方法体;
		}

	1.1、关于修饰符列表：
		修饰符列表不是必选项，是可选的。目前为止，大家统一写成：public static
		后面你就理解应该怎么写了。
	1.2、返回值类型：
		第一：返回值类型可以是任何类型，只要是java中合法的数据类型就行，数据
		类型包括基本数据类型和引用数据类型，也就说返回值类型可以是：byte short
		ing long float double boolean char String....

		第二：什么是返回值？
			返回值是一般指的事一个方法执行结束之后的结果。
			结果通常是一个数据，所以被称为“值”，而且还叫
			“返回值”。
			方法就是为了完成某个特定的功能，方法结束之后
			大部分情况下都是有一个结果的，而体现结果的一般
			都是数据。数据得有类型。这就是返回值类型。

		第三：当一个方法执行结束不返回任何值的时候，返回值
			类型也不能空白，必须写上void关健字。所以void表示
			该方法执行结束后不返回任何结果。
		
		第四：如果返回值类型不是void，那么你在方法体结果的时候必须使用"return 值;"
			这样的语句来完成“值”的返回，如果没有"return 值;"这样的语句那么编译器会
			报错。
				return 值;这样的语句作用是什么？作用是“返回值”。

		第五：只要有"return"关健字的语句执行，当前方法必然结束。
		return只要执行，当前所有的方法结束，记住：不是整个程序结束。
		
		第六：如果返回值类型是void，那么在方法体当中不能有“return 值;”这样的语句。
		但是可以有“return;”语句。这个语句“return;”的作用就是用来终止当前方法的。

		第七：除了void之外，剩下的都需要有“return 值”语句。

	1.3、方法名
		方法名要见名知意。
		方法名在标识符命名规范中，要求首字母小写，后面每个单词首字母大写。
		只有是合法的标识符就行。

	1.4、形式参数列表
		简称：形参
		注意：形式参数列表中的每一个参数都是“局部变量”，方法结束之后内存释放。
		形参的个数是：0~N个。
		public static void sumInt(){}
		pbulic static void sumInt(int x ){}
		public static void sumInt(int x, int y){}
		public static void sumInt(int a, int b, double d, String s){}
		形参有多个的话使用“逗号,”隔开，逗号是英文的。
		形参的数据类型起决定性作用，形参对应的变量名是随意的。

	1.5、方法体：
		由Java语句构成，java语句以“;”结尾
		在方法体中的代码遵循自上而下的顺序依次执行。
		在方法体中处理业务逻辑代码的时候需要数据，数据来源就是这些形参。

	2、方法定义之后怎么调用呢？
		方法必须调用才能执行。
		怎么调用，语法是什么？
			类名.方法名(实际参数列表)
*/

public class MethodTest02
{
	public static void main(String[] args){
		
	}

	/*
	public static int divide(int x, int y){
		int z = x / y;
		return z;
	}*/

	public static int divide(int x, int y){
		//int z = x / y;
		return x / y;
	}
}