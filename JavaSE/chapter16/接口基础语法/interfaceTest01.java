public class interfaceTest01{
	public static void main(String[] args){
		A a = new D();
		B b = new D();
		C c = new D();

		a.m1();
		B b2 = (B)a;
		b2.m2();

		C c2 = (C)a;
		c2.m3();
	}
}

interface K{
}

interface M{
}

class E implements M{
}

//---------------------------------
interface A{
	void m1();
}

interface B{
	void m2();
}

interface C{
	void m3();
}

class D implements A,B,C{
	public void m1(){
		System.out.println("m1....");
	}
	
	public void m2(){
		System.out.println("m2....");
	}

	public void m3(){
		System.out.println("m3....");
	}
}

/*
总结：类可以多继承接口，但是必须实现继承接口中的方法。
*/