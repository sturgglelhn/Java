public class Test01{
	public static void main(String[] args){
		Student s = new Student();
		s.name = "С��";
		s.age = 20;
		s.eat();
		s.sleep();

		Teacher t = new Teacher();
		t.name = "С��";
		t.age = 22;
		t.eat();
		t.sleep();

		Worker w = new Worker();
		w.name = "С��";
		w.age = 21;
		w.eat();
		w.sleep();
	}
}

class Person{
	String name;
	int age;
	
	public void eat(){
		System.out.println(name+"����"+age+"�꣬���ڳԷ�");
	}

	public void sleep(){
		System.out.println(name+"���극��˯��");
	}
}

class Student extends Person{

}

class Teacher extends Person{
	
}

class Worker extends Person{

}
/*
�ܽ᣺�˲���˵�����౻����̳У��Ѹ����еķ��������Լ̳е�������

���н����
��������������������������������������������
С������20�꣬���ڳԷ�
С�����극��˯��
С�����22�꣬���ڳԷ�
С����극��˯��
С�����21�꣬���ڳԷ�
С����극��˯��
��������������������������������������������
*/