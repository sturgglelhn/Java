

public class forTest02
{
	public static void main(String[] args){
		//第一种方案
		/*
		int i;
		int sum = 0;
		for(i = 0; i<=100; i+=2){
			//sum += i;// sum = sum + i;
			System.out.println(i);
		}
		
		//System.out.println("100奇数的和：" + sum);
		*/
	

		//第二种方案
		int sum = 0;
		for(int i = 1; i < 100; ++i)
		{//for循环中嵌套
			if(i % 2 == 1)
			{
				System.out.println("i = "+ i);
				//sum = sum + i;
			}
		}
		

		//System.out.println("sum = " + sum);
	}
}
/*
两种方案中第一种执行效率最高，因为循环的次数少。
*/

