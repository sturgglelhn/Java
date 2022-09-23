/*
	编写一个方法：输出大于某个正整数n的最小质数
		比如：这个正整数n是2
		也就是要输出：大于2的最小的质数，结果就是3

		比如：这个正整数n是9
		也就是要输出：大于9的最小的质数，结果就是11

	思路：
		首先，系统一定会先给你一个“正整数”，然后你基于
		这个n往后++，每加1得到的新数m判断一下是否为质数。
*/

public class HomeWork02
{
	public static void main(String[] args){
	
		/*
	boolean flag = isZhiShu(8);
	System.out.println(fla  g? "质数" : "非质数");
	*/

	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.print("请输入判断的值：");
	int num = s.nextInt();
	zuiXiaoZhiShu(num);
	}
	
    public static void zuiXiaoZhiShu(int n){
		while(true){
			n++;
			boolean flag = isZhiShu(n);
			if(flag){
				System.out.println(n);
				break;
			}
		}
	}

	public static boolean isZhiShu(int num){
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}