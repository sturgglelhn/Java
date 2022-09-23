//没有使用方法时的求阶乘
/*
public class HomeWork01
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入需要阶乘的数字：");
		int str = s.nextInt();
		int sum = 1;

		for(int i = 2; i<=str; i++)
		{
			sum *= i;
			//System.out.println(i);
		}
		System.out.println("阶乘结果为：" + sum);
	}
}
*/




//调用方法：第一种
/*
public class HomeWork01
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入需要阶乘的数字：");
		int str = s.nextInt();
		T(str);
	}

	public static void T(int x){
		int str = 1;
		for(int i=2; i<=x; i++)
		{
			str *= i;
		}
		System.out.println(str);
	}
}
*/




//调用方法：第二种
public class HomeWork01
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入需要阶乘的数字：");
		int str = s.nextInt();
		int sum = T(str);
		System.out.println(sum);
	}

	//这个方法可以计算任何数的阶乘，解决了代码复用的问题。
	public static int T(int x){
		int str = 1;
		for(int i=x; i>1; i--)
		{
			str *= i;
		}
		return str;
	}
}

