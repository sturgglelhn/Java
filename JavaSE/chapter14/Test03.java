public class Test03{
	public static void main(String[] args){
		Coder coder = new Coder();
		coder.method();
	}
}

class Person{
	private String name;
	private int age;
	//�޲ι���
	public Person(){
	}
	
	//�вι���
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void eat(){
		System.out.println("�˳Է�");
	}

}

class Coder extends Person{
	public Coder(){
		this("����Ա", 20);
	}

	public Coder(String name, int age){
		super(name, age);
	}
	public void eat(){
		System.out.println("����Ա�Է�");
	}

	public void method(){
		super.eat();
		this.eat();
	}
}