//��ʹ�õݹ�ķ�ʽ��׳�
/*
public class RecursionWork
{
	public static void main(String[] args){
		int sum = 1;
		for(int i=1; i<=5; i++)
		{
			//System.out.println(i);
			sum *= i;
		}
		System.out.println(sum);
	}
}*/



//ʹ�õݹ�ķ�ʽ��׳�
//������Ҫ�ý׳˵�����£�������Ҫ�ý׳ˣ���Ϊ�ݹ��ʹ�û���Ľ����ڴ�ĺķѣ�
//��forѭ��ִ��Ч�ʸߣ��ķѵ��ڴ���
public class RecursionWork
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("��������Ҫ��Ľ׳�:");
		int r = s.nextInt();

		int sum = m(r);
		System.out.println(sum);
	}

	public static int m(int x){
		if(x == 1)
		{
			return 1;
		}
		return x*m(x-1);
	}
}
