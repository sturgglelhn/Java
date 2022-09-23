/*
	计算1+2-3+4-5+6-7....+100的结果
	找规律：奇数时减法，偶数时加法。

	1.第一先输出1到100的累加
	2.
*/



public class HomeWork02
{
	public static void main(String[] args){
		
		int sum = 1;
		int str = 1;
		for(int i=2; i<=100; i++){
			//sum += i;
			//System.out.println(i);
			if(i%2 == 0){
				sum += i;
				//System.out.println(i);//2551
			}
		
			if(i%2 != 0)
			{
				str += i;
				//System.out.println(str);//2500
			}
		
		}


		//System.out.println("结果为:" + (sum-str+1));
		
	}
}


/*
public class HomeWork02
{
	public static void main(String[] args){
		
		int sum = 1;
		for(int i = 2; i<=100; i++)
		{
			if(i%2 == 0){
				sum += i;	
				System.out.println(i);
				//System.out.println("str = " + sum);
				System.out.println(sum);
			}//else{
				//sum -= i;
				//
			//}
			if(i%2 != 0)
			{
				sum += i;
				//System.out.println("sum = " + sum);
				//System.out.println(i);
				//System.out.println(sum);
			}
		}
		//System.out.println("结果为：" + sum);

	}
}*/


/*
public class HomeWork02
{
	public static void main(String[] args){
		int sum = 1;
		for(int i = 1; i<=100; i++)
		{
			if(i%2 == 0)
			{
				sum += i;
//				System.out.println(i);
				System.out.println(sum);//2551
			}

			if(i%2 != 0)
			{
				sum += i;
				System.out.println(sum);
				//System.out.println(i);

			}
		}
	}
}*/

/*
public class HomeWork02{
    public static void main(String[] args) {
        //使用for循环实现100以内的偶数之和
        int sum1=0;
        int sum2=0;
        for (int i=1;i<=100;i++){
            if (i%2==0){
                sum1+=i;//求偶数之和
            }else{
                sum2+=i;//求奇数之和
            }
        }
        //输出偶数之和
        System.out.println("偶数之和为："+sum1);
        //输出奇数之和
        System.out.println("奇数之和为："+sum2);
    }
}*/

/*
//2、计算 1+2-3+4-5+6-7....+100的结果
public class HomeWork02{
	public static void main(String[] args){
		int m = 1;
		//int n = 1;
		for(int i = 2; i <= 100; i ++){
			if(i % 2 == 0){
				m += i;
				
			}else{
				m -= i;
			}
		}
		System.out.println(m);	
	}
}*/
/*
i = 2; m = 1+2= 3
i = 3; m = m = 3-3 = 0

i = 4; m = 0+4 = 4
i = 5; m = 4-5 = -1

i = 6; m = -1 + 6 = -5
*/


/*
public class HomeWork02
{
	public static void main(String[] args){
		int sum = 2;

		for(int i = 1; i<=100; i++)
		{	
			if(i % 2 == 0)
			{
				sum += i;
			}else{
				sum -= i;
			}

		}
		System.out.printf("sum = " + sum);
	}
}*/