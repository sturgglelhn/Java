public class switchTest01
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������[0-6]��������");
		int num = s.nextInt();

/*
		switch (num)
		{
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
		}
*/
		switch (num)
		{
		case 0: case 1: case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("����һ");
			break;
		case 4:
			System.out.println("���ڶ�");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		case 8:
			System.out.println("������");
		
		}
		

		
	}
}