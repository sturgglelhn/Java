public class Test02{
	public static void main(String[] args){
		Coder c = new Coder();
		c.name = "С��";
		c.age = 22;
		c.eat();
		c.sleep();
		c.coding();	//�ô��뷽��

		Teacher t = new Teacher();
		t.name = "С��";
		t.age = 21;
		t.eat();
		t.sleep();
		t.teach();	//�Ͽη���
	}
}

class Person{
	String name;
	int age;

	/**
	* �Է���Ϊ
	*/
	public void eat(){
		System.out.println(name+"���ڳԷ�");
	}
	
	/**
	* ˯����Ϊ
	*/
	public void sleep(){
		System.out.println(name+"����С�һ��");
	}
}

class Coder extends Person{
	public void coding(){
		System.out.println(name+"�ô���");	//�̳и���name������
	}
}

class Teacher extends Person{
	public void teach(){
		System.out.println(name+"�Ͽ�");	//�̳и���name������
	}
}
/*
�ܽ᣺Coder��Teacher�̳и���Person�Ĺ������Ժ���Ϊ��
	�����������л��������Լ�����Ϊ�ֱ�Ϊ��coding()��teach()��
	�ڼ̳е�ͬʱ����ǿ���Լ�����Ϊ�����Ǽ̳е�һ���ص�
���н����
������������������������������������
С�����ڳԷ�
С���С�һ��
С���ô���
С�����ڳԷ�
С������С�һ��
С���Ͽ�
������������������������������������

*/