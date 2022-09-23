public class SuperTest01{
	public static void main(String[] args){
		new B();
	/*
	模拟的是现实世界中的要想有儿子必须先有父亲。
	运行结果：
		A类的无参数构造方法！
		B类的无参数构造方法！
	*/
	}
}

class A{
	public A(){
		System.out.println("A类的无参数构造方法！");
	}
}

class B extends A{
	public B(){
		System.out.println("B类的无参数构造方法！");
	}
}