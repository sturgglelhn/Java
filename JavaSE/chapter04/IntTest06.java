/*
	���ۣ�����������������������ʱ�����յĽ��������"�������"��Ӧ������
	
	char+short+byte�������
	��Ϊchar + short + byte��������ʱ�򣬸�����ת����int��������
*/

public class IntTest06
{
	public static void main(String[] args){
		long a = 10L;
		char c = 'a';
		short s = 100;
		int i = 30;
		
		//���
		System.out.println(a + c + s + i);//237

		//����: �����ݵ�����: ��longת����int���ܻ�����ʧ
		//int x = a + c + s + i;

		int x = (int)(a + c + s + i);
		System.out.println(x);

		//���³���ִ�н���ǣ�
		int temp =10/3;
		System.out.println(temp);//3

		int temp2 = 1/2;
		System.out.println(temp2);//ִ������//0.5
	}
}