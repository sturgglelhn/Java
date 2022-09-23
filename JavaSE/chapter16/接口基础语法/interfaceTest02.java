

public class interfaceTest02{
	public static void main(String[] args){
		Flyable f = new Cat();
		f.fly();

		Flyable f2 = new Pig();
		f2.fly();

		Flyable f3 = new Fish();
		f3.fly();
	}
}

class Animal{

}

interface Flyable{
	void fly();
}

class Cat extends Animal implements Flyable{
	public void fly(){
		System.out.println("��è��ɡ�����");
	}
}

class Pig extends Animal implements Flyable{
	public void fly(){
		System.out.println("����һֻ��ɵ�������");
	}
}

class Fish extends Object implements Flyable{
	public void fly(){
		System.out.println("����һֻ���۷��㣨�������������");
	}
}