
public class OverrideTest05{
	public static void main(String[] args){
		Animal a = new Animal();
		Animal c = new Cat();
		Animal d = new Dog();
		a.move(c);

	}
}

class Master{
	public void feed(Animal a){
		a.move();
	}
	public void feed(Cat c){
		c.move();
	}
	public void feed(Dog d){
		d.move();
	}
}

class Animal{
	public void move(){
		
	}
}

class Cat extends Animal{
	public void move(){
		System.out.println("这是一只小喵咪！！");
	}
}

class Dog extends Animal{
	public void move(){
		System.out.println("这是一只小狗！！");
	}
}