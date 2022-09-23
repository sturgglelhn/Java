/*
	逻辑运算符：
		&  逻辑与
		|  逻辑或
		！ 逻辑非
		&& 短路与
		|| 短路或

	非常重要：
		逻辑运算符两边要求都是布尔类型，并且最终的运算结果也是布尔类型。
		这是逻辑运算符的特点。
	
*/
public class OperatorTest03
{
	public static void main(String[] args){
		//
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(false & false);//false

		System.out.println(100>90 & 100>100);//false

		System.out.println(90<100 & 100>89);//true
		//&:只有两边同时都是true时，输出的才是true,否则都是false
		System.out.print("\n");

		int a = 100;
		int b = 101;
		int c = 90;
		//对于逻辑或呢？ |
		//只要有一边是true,结果就是true。
		System.out.println(a<b | c>b);//true
		System.out.println(b>a | b>c);//ture
		System.out.println(c>a | a>b);//false
		// |:只要两边中有一个是ture,就是true,否则是false
		
		System.out.println();
		System.out.println(!false);//ture
		System.out.println(!true);//false
		System.out.println(!(a > b));//true，优先级的问题
		//!:取反运算符，是false输出true，是true输出false

		/*
			关于短路与&&，短路或||
			其中重点学习短路与，短路或照葫芦画瓢

			短路与&& 和 逻辑非 & 有什么区别？
				首先这两个运算符的运算结果没有任何区别，完全相同
				只不过"短路与&&"会发生短路现象

			什么是短路现象呢？
				右边表达式不执行，这种现象叫做短路现象。

			什么时候使用&&，什么时候使用&?
				从效率方面来说，&&比&的效率高一些
				因为逻辑与&不管表达式结果是什么，第二个表达式一定执行

				以后开发中，短路与&&和逻辑与还是需要同时并存的。
					大部分情况下都建议使用短路与&&
					只有当即需要左边表达式执行，有需要右边表达式执行的时候，才会
					选择逻辑与&。

		*/
		System.out.print("——————————\n");
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & false);

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);

		//接下来需要理解一下什么是短路现象，什么时候会发生"短路"
		int x = 10;
		int y = 11;
		//逻辑与&什么时候结果为true(两边都是true，结果才是true)
		System.out.println(x>y & x>y++);
		//左边的 x>y 表达式结果已经是false了，其实整个表达式
		//的结果已经确定是false了，按道理来说右边表达式不应该执行。
		
		//通过这个测试得出：x > y++ 这个表达式执行了。
		System.out.println(y);//12
		System.out.print("——————————\n");

		//测试短路与&&
		int m = 10;
		int n = 11;
		//使用短路与&&的时候，当左边的表达式为false的时候，右边的表达式不执行，
		//这种现象被称为短路。
		System.out.println(m > n && m > n++);
		System.out.println(n);//11

		//什么时候发生短路或现象？
		//||短路或
		//"或"的时候只要有一边是true，结果就是true
		//所以，当左边的表达式结果是true的时候，右边的表达式不需要执行，此时会短路。
	}
}