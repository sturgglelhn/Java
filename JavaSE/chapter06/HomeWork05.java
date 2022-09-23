/*
输出一个：
    *
   ***
  *****
 *******
*********
找规律
*/
public class HomeWork05
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个正整数作为行数：");
		int rows = s.nextInt();
		
		for(int i = 1; i <= rows; i++)	//外层循环控制的是总行数
		{
			//System.out.println("行号：" + i);
			for(int j = 0; j<rows-i; j++){
				System.out.print(" ");
			}

			for(int k = 0; k< i * 2 -1; k++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
}