public class FinalTest02{
	public static void main(String[] args){
		final Person p1 = new Person(20);
		System.out.println(p1.age);

		//-----------------------------

		//final Person p = new Person(30);
		//p = new Person(30);
		//����: �޷�Ϊ���ձ���p����ֵ

		p1.age = 40;
		System.out.println(p1.age);
		p1.age = 100;
		System.out.println(p1.age);

		final int k = 100;
		k = 200;
		//����: �޷�Ϊ���ձ���k����ֵ
		System.out.println(k);
	}
}

class Person{
	int age;

	public Person(){

	}

	public Person(int age){
		this.age = age;
	}
}