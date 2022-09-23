//先不用递归，请编写程序，计算1-n的和
/*public class RecursionTest02
{
	public static void main(String[] args){
		int retValue1 = sum(10);
		System.out.println(retValue1);

		int retValue2 = sum(3);
		System.out.println(retValue2);
	}

	public static int sum(int n){
		int result = 0;
		for(int i = 1; i<=n; i++){
			result += i;
		}
		return result;
	}
}*/


//使用递归
public class RecursionTest02
{
	public static void main(String[] args){
	int retValue2 = sum(3);
	System.out.println(retValue2);//6

	}

	public static int sum(int n){
		if(n == 1)
		{
			return 1;
		}
		return n+sum(n-1);
	}
}
