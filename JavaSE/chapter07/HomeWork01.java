//û��ʹ�÷���ʱ����׳�
/*
public class HomeWork01
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("��������Ҫ�׳˵����֣�");
		int str = s.nextInt();
		int sum = 1;

		for(int i = 2; i<=str; i++)
		{
			sum *= i;
			//System.out.println(i);
		}
		System.out.println("�׳˽��Ϊ��" + sum);
	}
}
*/




//���÷�������һ��
/*
public class HomeWork01
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("��������Ҫ�׳˵����֣�");
		int str = s.nextInt();
		T(str);
	}

	public static void T(int x){
		int str = 1;
		for(int i=2; i<=x; i++)
		{
			str *= i;
		}
		System.out.println(str);
	}
}
*/




//���÷������ڶ���
public class HomeWork01
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("��������Ҫ�׳˵����֣�");
		int str = s.nextInt();
		int sum = T(str);
		System.out.println(sum);
	}

	//����������Լ����κ����Ľ׳ˣ�����˴��븴�õ����⡣
	public static int T(int x){
		int str = 1;
		for(int i=x; i>1; i--)
		{
			str *= i;
		}
		return str;
	}
}

