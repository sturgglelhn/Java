public class Test05
{/*
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("�������һ���������֣�");
		int num1 = s.nextInt();

		System.out.print("������ڶ����������֣�");
		int num2 = s.nextInt();

		System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
	}
	*/

	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("����������������");
		String name = s.next();

		System.out.print("�������������䣺");
		int age = s.nextInt();

		System.out.print("�����������Ա�");
		String man = s.next();

		System.out.println("��������������������������������");
		/*System.out.println("������Ϣ��:");
		System.out.println("����������" + name);
		System.out.println("�������䣺" + age);
		System.out.println("�����Ա�" + man);*/

		System.out.println("������Ϣ��");
		System.out.println("��������������������������������");
		System.out.println(
			"����������"+name+"\n"+
			"�������䣺"+age+"\n"+
			"�����Ա�"+man
			);
	}
}