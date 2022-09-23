/*
求5的阶乘，5*4*3*2*1;
*/
/*
public class HomeWork03
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int num = s.nextInt();
		
		int str = 1;
		for(int i = num; i>1; i--)
		{
			str *= i;			
		}
		System.out.println("结果为：" + str);
	}
}*/


public class HomeWork03
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int num = s.nextInt();
		
		//
		boolean zhiShu = true;//主要练习打标记

		for(int i = 2; i<num; i++){
			//System.out.println(i);
			if(num % i == 0)
			{
				//System.out.println("该数字"+num+"不是质数");
				zhiShu = false;//打标记
				break;
			}
		}
		System.out.println(num + (zhiShu ? "是" : "不是") + "质数");
	}
}

