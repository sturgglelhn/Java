
/*public class fangFa
{
	public static void main(String[] args){
		methodName();
	}
	public static void methodName(){
		System.out.println("这是一个方法");
	}
}
*/


public class fangFa
{
	public static void main(String[] args){
		operator2();
		operator3();
	}

	public static void operator3(){
		int i = 250;
		int j = 120;
		int k = 60;

		int tmp = i>j ? i:j;

		int max = tmp>k ? tmp:k;
		System.out.println("最大的数：" + max);
	}

	public static void operator2(){
		int i = 50;
		int j = 30;

		int m = i > j ? i : j;
		System.out.println("较大的值：" + m);
	}
}