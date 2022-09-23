/*
	在方法调用的时候，什么时候“类名.”是可以省略的。什么时候不能省略？
		a()方法调用b()方法的时候，a和b都在同一个类中，“类名.”可以省略。
		如果不在同一个类中“类名.”不能省略。
*/

public class MethodTest04
{
	public static void daYin03(){
		System.out.println("我和你同在");
	}
	public static void main(String[] args){
		//调用println()方法。
		MethodTest04.daYin();
		MethodTest04.daYin02();
		MethodTest04.daYin03();
		
		
		System.out.println();
		//"类名."可以省略吗？
		daYin();
		daYin02();
		daYin03();

		System.out.println();
		//第一次跨类调用。
		//像这种情况下："类名."就不能省略了
		Myclass.daYin();
		Myclass.daYin02();
		Myclass.daYin03();

	}
	public static void daYin(){
		System.out.println("Hello World!");
	}

	public static void daYin02(){
		System.out.println("Hello World!!");
	}
}

class Myclass
{
	public static void daYin(){
		System.out.println("打印1");
	}

	public static void daYin02(){
		System.out.println("打印2");
	}
	public static void daYin03(){
		System.out.println("打印3");
	}
}