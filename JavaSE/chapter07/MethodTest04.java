/*
	�ڷ������õ�ʱ��ʲôʱ������.���ǿ���ʡ�Եġ�ʲôʱ����ʡ�ԣ�
		a()��������b()������ʱ��a��b����ͬһ�����У�������.������ʡ�ԡ�
		�������ͬһ�����С�����.������ʡ�ԡ�
*/

public class MethodTest04
{
	public static void daYin03(){
		System.out.println("�Һ���ͬ��");
	}
	public static void main(String[] args){
		//����println()������
		MethodTest04.daYin();
		MethodTest04.daYin02();
		MethodTest04.daYin03();
		
		
		System.out.println();
		//"����."����ʡ����
		daYin();
		daYin02();
		daYin03();

		System.out.println();
		//��һ�ο�����á�
		//����������£�"����."�Ͳ���ʡ����
		Myclass.daYin();
		Myclass.daYin02();
		Myclass.daYin03();

	}
	public static void daYin(){
		System.out.println("Hello World!");
	}

	public static void daYin02(){
		System.out.println("Hello World!!");
	}
}

class Myclass
{
	public static void daYin(){
		System.out.println("��ӡ1");
	}

	public static void daYin02(){
		System.out.println("��ӡ2");
	}
	public static void daYin03(){
		System.out.println("��ӡ3");
	}
}