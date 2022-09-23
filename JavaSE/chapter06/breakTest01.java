public class breakTest01
{
	public static void main(String[] args){
		/*
		for(int i = 0; i<10; i++)
		{
			if(i == 5){
				break;	//终止循环，方法终止
			}
			System.out.println("i = "+i);//0 1 2 3 4 
		}*/

/*
		for(int i = 0; i<2; i++){
			for(int k = 0; k<10; k++){
				if(k == 5)
				{
					break;//这个break;语句终止的是它最近的for循环
				}
				System.out.println("i --> " + k);//0 1 2 3 4 0 1 2 3 4
			}
		}
*/

		for(int i = 0; i<10; i++){
			if(i == 5)
				break;//终止的是外层循环的语句
			for(int k = 0; k<2; k++){
				
				System.out.println("i --> " + k); 
			}
			System.out.println("k = " + i);
		}




/*
		for(int i = 0; i<10; i++)
		{
			if(i == 5)
			{
				continue;//中断当前本次循环，继续执行
			}
			System.out.println("i = " + i);//0 1 2 3 4 6 7 8 9
		}
*/


	}
}