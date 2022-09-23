/*
	接口：
		1、接口也是一种引用数据类型，编译之后也是class字节码文件
		2、接口是完全抽象的。（抽象类是半抽象）或者也可以说接口是特殊的抽象类
		3、接口怎么定义，语法是什么？
			[修饰符列表] interface 接口名{

			}
		4、接口支持多继承，一个接口可以继承多个接口。
		5、接口中只包含两部分内容：一部分是：常量。一部分是：抽象方法。接口中没有
		其他内容了。只有以上两部分。
		6、接口中的所有元素都是public修饰的。（都是公开的）
		7、接口中的抽象方法定义时：public abstract修饰符可以省略。
		8、接口中的方法不能有方法体。
		9、接口中常量的public static final可以省略。
*/
public class Test01{
	public static void main(String[] args){
		

		System.out.println(MyMath.PI);

		//MyMath.PI = 3.14;
	}
}

//定义接口
interface A{

}

interface B{

}

//接口支持多继承，继承A,B
interface C extends A,B{

}

interface MyMath{
	double PI = 3.1415926;
	//public abstract int sum(int a, int b);
	int sum(int a, int b);

}
