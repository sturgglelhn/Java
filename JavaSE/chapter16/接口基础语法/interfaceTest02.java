

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
		System.out.println("飞猫起飞。。。");
	}
}

class Pig extends Animal implements Flyable{
	public void fly(){
		System.out.println("我是一只会飞的猪！！！");
	}
}

class Fish extends Object implements Flyable{
	public void fly(){
		System.out.println("我是一只六眼飞鱼（流言蜚语）！！！");
	}
}