/*
	final
		1、final是java语言中的一个关健字
		2、final表示:最终的，不可变的

		3、【重点】final修饰的变量？
			final修饰的局部变量，只能赋一次值，一旦赋值不能重新赋值

		4、【重点】final修饰的方法？
			final修饰的方法无法被覆盖，被重写

		5、【重点】final修饰的类？
			final修饰的类无法继承

		6、【提示】final控制不了能不能被调用的问题。final管的是啥？
			final修饰的是表示最后的，不能变的，不能改的

	【重点：final修饰的局部变量，只能赋一次值】
*/
/*
final class A{
}
//B类继承A类，相当于对A类的功能进行扩展。如果你不希望别人对A类型进行扩展
//你可以给A类加final关键字，这样的话A类就无法继承了。
//错误: 无法从最终A进行继承
class B extends A{
}
*/
public class FinalTest01{
	public static void main(String[] args){
		int i = 100;
		i = 200;
	
		int k = 100;
		k = 200;
		
		//错误: 可能已分配变量m
		final int m;
		m = 100;
		m = 200;
		
	}
	
}

/*
class C{
	public void doSome(){
		System.out.println("C's doSome...");
	}
}

class D extends C{
	//错误: D中的doSome()无法覆盖C中的doSome()
	public void doSome(){
		System.out.println("D's doSome...");
	}
}*/