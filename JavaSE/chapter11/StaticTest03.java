/*
	ʵ���ģ�һ����Ҫʹ�á�����.��������

	��̬�ģ�
		����ʹ�á�����.�������ʣ���ʹ�á�����.��Ҳ�У�������ʹ�á�����.����
		��̬�����ʹ�á�����.�������ʻ��ó���Ա�������󣺳���Ա��Ϊ��ʵ�����ء�

	���ۣ�
		��ָ���쳣ֻ����ʲô����²Żᷢ����?
			ֻ���ڡ������á����ʡ�ʵ������صģ�������ֿ�ָ���쳣��
*/
public class StaticTest03
{
	public static void main(String[] args){
		//ͨ��������.���ķ�ʽ���ʾ�̬����
		System.out.println(Chinese.country);
		//��������
		Chinese c1 = new Chinese("18934723","����");
		System.out.println(c1.idCard);
		System.out.println(c1.name);
		System.out.println(c1.country);

		//c1�ǿ�����
		c1 = null;
		//��������᲻����ֿ�ָ���쳣��
		//������ֿ�ָ���쳣��
		//��Ϊ��̬��������Ҫ����Ĵ���
		//ʵ�������µĴ��������е�ʱ�򣬻��ǣ�System.out.println(Chinese.country);
		System.out.println(c1.country);

		//�������ֿ�ָ���쳣����Ϊname��ʵ��������
		System.out.println(c1.name);
	}
}

class Chinese
{
	String idCard;
	String name;

	//��̬����
	static String country = "�й�";
	
	//���췽��
	public Chinese(String x, String y){
		idCard = x;
		name = y;
	}
}