/*
�����ɷ��࣬Husband ��������wife 
�ɷ�������԰���:���֤�ţ��������������ڣ����ӡ�
����������԰���:���֤�ţ��������������ڣ��ɷ�
�ֱ�����������ṩ���췽��(�޲������췽�����в������췽����Ҫ�ṩ),
��д���Գ��򣬴����ɷ����Ȼ���ٴ������Ӷ����ɷ����������Ӷ���
���Ӷ�������ɷ����Ҫ���ܹ����������ɷ����"�����ӵ����֣�
�����ܹ�������"���Ӷ���"���ɷ�����֡�Ҫ���ܹ���������ִ�й��̵��ڴ�ͼ��
����Ҫ���ڳ�������ʾ����ָ���쳣��Ч��.
*/

public class Test{
	public static void main(String[] args){
		Husband h = new Husband("111111","�����","1999-09-11", null);
		Wife w = new Wife("222222","������","2000-02-11",null);
		
		//h.wife = w;
		//w.husband = h;
		//NullPointerException,û�и�ֵʱ����ֿ�ָ���쳣

		h.wife = w;
		w.husband = h;

		System.out.println(h.name + "��������" + h.wife.name);

		System.out.println(w.name + "���ɷ���" + w.husband.name);
	}
}

class Husband{
	String idCard;
	String name;
	String birthday;
	Wife wife;

	//�޲ι��췽��
	public Husband(){

	}
	//�вι��췽��
	public Husband(String s1, String s2, String s3, Wife w){
		idCard = s1;
		name = s2;
		birthday = s3;
		wife = w;
	}
	
}

class Wife{
	String idCard;
	String name;
	String birthday;
	Husband husband;

	//�޲ι��췽��
	public Wife(){

	}
	
	//�вι��췽��
	public Wife(String s1, String s2, String s3, Husband h){
		idCard = s1;
		name = s2;
		birthday = s3;
		husband = h;
	}
}


/*
public class Test
{
	public static void main(String[] args){
		Husband h = new Husband("111111","�����","1999-09-11");
		System.out.println(h.name);	
	
	}
}

class Husband
{
	String idCard;
	String name;
	String birthday;

	public Husband(){

	}

	public Husband(String s1, String s2, String s3){
		idCard = s1;
		name = s2;
		birthday = s3;
	}
}
*/