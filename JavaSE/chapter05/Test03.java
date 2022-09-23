
/*
	+运算符：
		1、+ 运算符在java语言中有两个作用。
			作用1：求和
			作用2：字符串拼接

		2、什么时候求和？什么时候进行字符串的拼接呢？
			当 + 运算符两边都是数字类型的时候，求和
			当 + 运算符两边的“任意一边”是字符串类型，那么这个+会进行字符串拼接操作

		3、一定要记住：字符串拼接完之后的结果还是一个字符串
*/
public class Test03
{
	public static void main(String[] args){

		int age = 35;
		// +在这里会进行字符串的拼接操作
		System.out.println("年龄="+age);//年龄=35
		
		int a = 100;
		int b = 200;
		int c = a + b;//这里是加法运算
		System.out.println(c);//300

		//注意：当一个表达式当中有多个加号的时候
		//遵循"自左向右"的顺序一次执行。（除非额外添加了小括号，小括号的优先级高）
		//第一个+先运算
		System.out.println(a + b + "110");	//300110	
		
		//先执行小括号当中的程序：b + "110",这里的+会进行字符串的拼接，
		//拼接之后的结果是：“200110”,这个结果是一个字符串类型。
		//代码就变成了：System.out.println(a + "200110");
		//这个时候的+还是字符串的拼接，最终结果是："100200110"
		System.out.println(a + (b + "110"));
		
		//以下的+运算符都是拼接操作
		System.out.println(a + "+"+ b + "=" + c);

		
		System.out.println(a + "+"+ b + "=" + a + b);

		
		System.out.println(a + "+" + b + "=" + (a+b));

		String name = "李四";
		
		//错误：类型不兼容
		//String name = 100;

		System.out.println("登录成功欢迎吗" + name + "回来");
		System.out.println(a + "+" + b + "=" + c);
	}
}