public class AbstractTest02{
	public static void main(String[] args){
		Cook c = new Cook();
		c.work();

		Cleaner cleaner = new Cleaner();
		cleaner.work();

		Security s = new Security();
		s.work();
	}
}

abstract class Employee{
	private String id;
	private String name;
	private Double salary;

	public Employee(){

	}

	public Employee(String id, String name,Double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//���󷽷������з�����
	public abstract void work();	//��ʾԱ�������й���������ÿ��Ա���Ĺ��������ǲ�һ���ģ��о����������ʵ�֣�
}

class Cook extends Employee{
	//������д����ĳ��󷽷�����Ϊ���಻�ǳ�����
	public void work(){
		System.out.println("����");
	}
}

class Cleaner extends Employee{
	//������д����ĳ��󷽷�����Ϊ���಻�ǳ�����
	public void work(){
		System.out.println("���������Ա");
	}
}

class Security extends Employee{
	//������д����ĳ��󷽷�����Ϊ���಻�ǳ�����
	public void work(){
		System.out.println("����˾�����");
	}
}
/*

*/