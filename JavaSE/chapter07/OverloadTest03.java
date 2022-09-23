/*
方法重载（overload）
	什么时候需要考虑使用方法重载？
		在同一个类中，如果“功能1”和“功能2”它们的功能是相似的
		那么可以考虑将它们的方法名一致，这样代码即美观，有便于
		后期的代码编写（容易记忆，方便使用）

		注意：方法重载overload不能随便使用，如果两个功能压根不相干，
		不想似，根本没关系，此时两个方法使用重载机制的话，会导致
		编码更麻烦。无法进行方法功能的区分。

	什么时候代码会发生方法重载？
		条件1：在同一个类当中
		条件2：方法名相同
		条件3：参数列表不同
				 参数的个数不同算不同
				 参数的类型不同算不同
				 参数的顺序不同算不同
				 方法重载和方法的返回值类型无关。
				方法重载和方法的修饰符列表无关

		只要同时满足以上3个条件，那么我们可以认定方法和方法之间发生了
		重载机制

	注意：
		不管代码怎么写，最终一定能让java编译器很好的区分开这两个方法。

。
*/
public class OverloadTest03
{
	public static void main(String[] args){
		m1();
		m1(100);

		m2(10, 3.14);
		m2(3.15, 10);

		m3(80);
		m3(3.14);

		//m4(10, 1);//类型重复了

		//m5();

	}
	public static void m1(){
		System.out.println("m1无参数的执行！");
	}

	public static void m1(int a){
		System.out.println("m1有一个int参数执行！");
	}

	//参数的顺序不同，也算不同
	public static void m2(int x, double y){
		System.out.println("m2(int x, double y)");
	}

	public static void m2(double y, int x){
		System.out.println("m2(double y, int x)");
	}

	public static void m3(int x){
		System.out.println("m3(int x");
	}
	public static void m3(double x){
		System.out.println("m3(double x)");
	}
		
	//错误: 已在类 OverloadTest03中定义了方法 m4(int,int)
	/*public static void m4(int x, int a){//类型重复了

	}
	public static void m4(int k, int z){

	}*/
	

	//方法重复了，不属于重载
	/*
	public static int m5(){
		return 1;
	}
	public static double m5(){
		return 1.0;
	}*/

}