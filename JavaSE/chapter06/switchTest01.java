public class switchTest01
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入[0-6]的整数：");
		int num = s.nextInt();

/*
		switch (num)
		{
		case 0:
			System.out.println("星期日");
			break;
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
		}
*/
		switch (num)
		{
		case 0: case 1: case 2:
			System.out.println("星期日");
			break;
		case 3:
			System.out.println("星期一");
			break;
		case 4:
			System.out.println("星期二");
			break;
		case 5:
			System.out.println("星期三");
			break;
		case 6:
			System.out.println("星期四");
			break;
		case 7:
			System.out.println("星期五");
			break;
		case 8:
			System.out.println("星期六");
		
		}
		

		
	}
}