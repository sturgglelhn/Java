/*
��5�Ľ׳ˣ�5*4*3*2*1;
*/
/*
public class HomeWork03
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������һ����������");
		int num = s.nextInt();
		
		int str = 1;
		for(int i = num; i>1; i--)
		{
			str *= i;			
		}
		System.out.println("���Ϊ��" + str);
	}
}*/


public class HomeWork03
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������һ����������");
		int num = s.nextInt();
		
		//
		boolean zhiShu = true;//��Ҫ��ϰ����

		for(int i = 2; i<num; i++){
			//System.out.println(i);
			if(num % i == 0)
			{
				//System.out.println("������"+num+"��������");
				zhiShu = false;//����
				break;
			}
		}
		System.out.println(num + (zhiShu ? "��" : "����") + "����");
	}
}

