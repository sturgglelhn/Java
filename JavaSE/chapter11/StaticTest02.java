

/*
	ʲôʱ���������Ϊʵ���ģ�ʲôʱ������Ϊ��̬��?
		���������͵����ж����ĳ������ֵ����һ���ģ�
		�����鶨��Ϊʵ���������˷��ڴ�ռ䡣���鶨��
		Ϊ�༶������������Ϊ��̬�������ڷ������б���
		һ�ݣ���ʡ�ڴ濪����
*/

/*
public class StaticTest02
{
	public static void main(String[] arsg){
		Chinese c1 = new Chinese("784397912934789","����","�й�");
		System.out.println(c1.idCard);
		System.out.println(c1.name);
		System.out.println(c1.country);

		Chinese c2 = new Chinese("398430134897027","����","�й�");
		System.out.println(c2.idCard);
		System.out.println(c2.name);
		System.out.println(c2.country);
	}
}
class Chinese
{
	String idCard;

	String name;

	String country;


	public Chinese(){

	}

	public Chinese(String s1, String s2, String s3){
		idCard = s1;
		name = s2;
		country = s3;
	}
}
*/


public class StaticTest02
{
	public static void main(String[] args){
		// idCard��ʵ��������������new����ͨ��������.������
		//�޷��Ӿ�̬�����������÷Ǿ�̬ ���� idCard
		//System.out.println(Chinese.idCard);//�����

		System.out.println(Chinese.country);

		Chinese c1 = new Chinese("804379892108522","����");
		System.out.println(c1.idCard);
		System.out.println(c1.name);

		Chinese c2 = new Chinese("892379476883699","����");
		System.out.println(c2.idCard);
		System.out.println(c2.name);
		
	}
}
class Chinese
{
	String idCard;

	String name;

	//String country;
	//����
	//�ص��ص�����ǣ���static�ı���������̬����
	//��̬�����������ʱ��ʼ��������Ҫnew���󣬾�̬�����Ŀռ�Ϳ������ˡ�
	//��̬�����Ĵ洢�ڷ�������
	static String country = "�й�";

	public Chinese(){

	}

	public Chinese(String s1, String s2){
		idCard = s1;
		name = s2;
	}
}