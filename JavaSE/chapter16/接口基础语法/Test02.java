/*
	接口的基础语法：
		1、类和类叫做继承，类和接口之间叫做实现。
		别多想：你仍然可以将“实现”看做“继承”
		继承使用extends关健字完成
		实现使用implement关键字完成

		2、五颗星（*****）：当一个非抽象的类实现接口的话，必须将接口中所有的
		抽象方法全部实现（覆盖、重写）。
*/

public class Test02{
	public static void main(String[] args){
		MyMath mm = new MyMathImpl();
		int result1 = mm.sum(10, 20);
		System.out.println(result1);

		int result2 = mm.sub(30, 20);
		System.out.println(result2);

	}
}

//特殊的抽象类，完成抽象的，叫做接口
interface MyMath{
	//double PI = 3.1415926;

	int sum(int a, int b);
	int sub(int a, int b);

}

//编写一个类（这个类是一个“非抽象”的类）
//这个类的名字是随意的
/*abstract class MyMathImpl implements MyMath{

}*/

class MyMathImpl implements MyMath{
	public int sum(int a, int b){
		return a + b;
	}

	public int sub(int a, int b){
		return a - b;
	}
}