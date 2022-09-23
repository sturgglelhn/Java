public class Static{
	public static void main(String[] args){
		System.out.println(A.abc);
		System.out.println(B.abc);
		A.method();
		B.method();
	}
}

class A{
	static int abc = 10;

	static void method(){
		System.out.println("aa");
	}
}

class B extends A{
	static void method(){
		System.out.println("bb");
	}
}

/*
总结：说明被static修饰的成员是可以被继承到子类中的
运行结果：
————————————————
10
10
aa
bb
————————————————
*/