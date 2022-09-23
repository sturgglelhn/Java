
public class Test04{
	public static void main(String[] args){
		D d = new D();
		d.methodA();
		d.methodB();
		d.methodC();
		d.method();
	}
}


interface A{
	void methodA();
	void method();	//父接口中的method()方法
}

interface B{
	void methodB();
	void method();	//子接口中的method()方法
}

interface C extends A,B{
	void methodC();
	void method();
}

class D implements C{
	public void methodA(){
		System.out.println("methodA");
	}

	public void methodB(){
		System.out.println("methodB");
	}

	public void methodC(){
		System.out.println("methodC");
	}

	public void method(){
		System.out.println("我是D");
	}
}
/*
总结：一个接口能继承另一个接口或者多个接口，这和类之间的继承比较相似。
	接口的继承使用extends关键字，子接口继承父接口的方法。如果父接口中
	的默认方法有重名的，那么子接口需要重写一次。
*/
