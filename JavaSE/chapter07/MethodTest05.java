public class MethodTest05{
	public static void main(String[] args){
		//调用m1方法
		System.out.println("main begin");
		m1();
		System.out.println("main over");
	}
	
	public static void m1(){
		//调用程序不一定写到main方法中，不要main方法特殊化。
		//main方法也是一个普通方法。
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 begin");
	}

	//m2方法可以调用T类的m3()方法吗？
	public static void m2(){
		System.out.println("m2 begin");
		T.m3();
		System.out.println("m2 begin");
	}

}

class T{
	public static void m3(){
		System.out.println("m3 begin");
		System.out.println("this m2 method execute!");
		System.out.println("m3 begin");
	}
}
/*
遵循自上而下的顺序执行
结果：
——————————————————————————
main begin
m1 begin
m2 begin
m3 begin
this m2 method execute!
m3 begin
m2 begin
m1 begin
main over
——————————————————————————
*/