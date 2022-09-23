//不使用递归的方式求阶乘
/*
public class RecursionWork
{
	public static void main(String[] args){
		int sum = 1;
		for(int i=1; i<=5; i++)
		{
			//System.out.println(i);
			sum *= i;
		}
		System.out.println(sum);
	}
}*/



//使用递归的方式求阶乘
//程序不需要用阶乘的情况下，尽量不要用阶乘，因为递归的使用会大大的降低内存的耗费，
//而for循环执行效率高，耗费的内存少
public class RecursionWork
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入需要求的阶乘:");
		int r = s.nextInt();

		int sum = m(r);
		System.out.println(sum);
	}

	public static int m(int x){
		if(x == 1)
		{
			return 1;
		}
		return x*m(x-1);
	}
}
