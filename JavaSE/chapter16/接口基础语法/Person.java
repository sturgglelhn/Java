

public class Person{
	public static void main(String[] args){
		Student student = new Student("С��", 22);
		student.study();
		student.swim();

		Singer singer = new Singer("С��", 20);
		singer.sing();
		singer.dance();
		singer.eat();
	}
}

/*����
���ԣ�����������
��Ϊ���Է���˯��
*/
class Person01{
	private String name;
	private int age;

	public Person01(){

	}
	
	public Person01(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void eat(){
		System.out.println("�ڳԷ�");
	}

	public void sleep(){
		System.out.println("��˯��");
	}
}

//��Ӿ�ӿڣ�ʵ�ָýӿڴ���߱���Ӿ����
interface Swimmabale{
	void swim();
}


//����ӿڣ�ʵ�ָýӿڸñ�߱����蹦��
interface Danceable{
	void dance();
}

//ѧ���࣬��һ���ˣ����һ���Ӿ
class Student extends Person01 implements Swimmabale{
	public Student(){

	}

	public Student(String name, int age){
		//���ø���Ĺ��췽����ʼ��
		super(name, age);
	}

	//ʵ�ֳ��󷽷�
	public void swim(){
		System.out.println(getName()+"����Ӿ");
	}

	//�Լ����صķ���
	public void study(){
		System.out.println(getName()+"��ѧϰ");
	}
}

//�����࣬��һ���ˣ����һ�����
class Singer extends Person01 implements Danceable{
	public Singer(){

	}
	public Singer(String name, int age){
		//���ø���Ĺ��췽����ʼ��
		super(name, age);
	}

	public void dance(){
		System.out.println(getName()+"������");
	}

	//�Լ����صķ���
	public void sing(){
		System.out.println(getName()+"�ڳ���");
	}
}


/*
�ڼ̳���ϵ�У�һ����ֻ�ܼ̳�һ�����ࡣ�����ڽӿڶ��ԣ�һ����
�ǿ���ʵ�ֶ���ӿڵģ�������ӿڵĶ�ʵ�֡����ң�һ�����ܼ̳�
һ�����࣬ͬʱʵ�ֶ���ӿڡ�
ʵ�ָ�ʽ��
class ���� [extends ������] implements �ӿ�1,�ӿ�2,�ӿ�3...{
	//��д�ӿ��еĳ��󷽷������롿
	//��д�ӿ���Ĭ�Ϸ�����������ʱ��ѡ��
}


*/


/*
Ĭ�Ϸ�����JDK�����ԣ�
tips����ʵ�ֶ���ӿ��У��������ӿ��а�����ͬ���������������ʵ�ָ÷�����


���������ӿڣ�
interface A{
	public default void methodA(){
		System.out.println("method A..");
	}
	public default void method(){
		System.out.println("method");
	}
}

interface B{
	public default void methodB(){
		System.out.println("method B..");
	}

	public default void method(){
		System.out.println("method");
	}
}

class C implements A,B{
	pbulic void methodA(){
		Sysetm.out.println("A");
	}

	public void method(){
		System.out.println("����ʵ�ֵķ���");
	}

	public void methodB(){
		System.out.println("B");
	}
}
*/