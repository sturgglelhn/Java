

public class FinalTest03{
	public static void main(String[] args){
		User u = new User();
		System.out.println(u.age);
	}
}

class User{
	//����: ���� age δ��Ĭ�Ϲ������г�ʼ��
	//����Ա�����ֶ���ֵ
	final int age;
	final int age = 12;
}