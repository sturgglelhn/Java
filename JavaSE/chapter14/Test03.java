public class Test03{
	public static void main(String[] args){
		Coder coder = new Coder();
		coder.method();
	}
}

class Person{
	private String name;
	private int age;
	//无参构造
	public Person(){
	}
	
	//有参构造
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void eat(){
		System.out.println("人吃饭");
	}

}

class Coder extends Person{
	public Coder(){
		this("程序员", 20);
	}

	public Coder(String name, int age){
		super(name, age);
	}
	public void eat(){
		System.out.println("程序员吃饭");
	}

	public void method(){
		super.eat();
		this.eat();
	}
}