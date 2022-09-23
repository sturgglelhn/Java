public class StaticTest07{
	static int i = 100;

	static{
		System.out.println("i = "+i);
	}
	
	int k = 111;//k变量是实例变量，在构造方法执行时内存空间才会开辟

	static{
		//k变量可以访问吗？
		//static静态代码块在类加载是执行，并且只执行一次
		//类加载时，k变量空间还没有开辟出来呢。
		//错误：无法从静态上下文中引用非静态变量K
		//System.out.println("k =" + k);

		System.out.println("name =" + name);
	}

	static String name = "张三";

	public static void main(String[] args){
		System.out.println("main begin");
	}

	int n = 122;
	static{
		System.out.println(n);
	}
}