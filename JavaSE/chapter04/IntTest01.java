
/*
public class IntTest01
{
	public static void main(String[] args)
	{
		int a = 10;
		System.out.println(a);
		int b = 010;
		System.out.println(b);
		int c = 0x10;
		System.out.println(c);
		int d = 0b10;
		System.out.println(d);
	}
}*/



/*
��java����һ���ǳ���Ҫ�Ĺ��򣬱����ס:
	���κ�����£������͵�"������/����"Ĭ�ϱ�����int���ʹ�������ס���У�
	���ϣ����"������������"������long������������Ҫ��"������"�������L/l
	����ʹ�ô�д��L,��ΪСдl��1�ֲ���

*/
public class IntTest01
{
	public static void main(String[] args)
	{
		//������������������ת�������´���ʲô��˼��
		//�����ڵ�����ת��
		//100���������������int���ʹ���
		//a������int���ͣ����Դ������͵�ת��
		//int���͵���������ֵ��int���͵ı���
		int a = 100;
		System.out.print(a);
		
		//������200���������Ĭ�ϱ�����int����������
		//b������long���ͣ�int����ռ4���ֽڣ�long����ռ8���ֽ�
		//С���������Զ�ת���ɴ����������ֲ�������Ϊ���Զ�����ת��
		long b = 200;
		System.out.println(b);

		//�������������ת��
		//��������������300�������һ��L֮��300L������������һ��long���͵�������
		//c������long���ͣ�long���͸�ֵ��long���Ͳ���������ת��
		long c = 300L;
		System.out.println(c);

		long d = 2147483647;
		System.out.println(d);

		//long e = 2147483648;
		//System.out.println(e);
		/*
		IntTest01.java:54: ����: ���������: 2147483648
                long e = 2147483648;
                         ^
		1 ������
		����취���������������L
		*/
		long e = 2147483648L;
		System.out.println(e);//����ȷ���
	}
}



