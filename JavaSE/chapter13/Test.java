
public class Test{
	public static void main(String[] args){
		/*
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Yingwu();
		*/
		Master ma = new Master();

		Cat cat = new Cat();
		Dog dog = new Dog();
		Yingwu yingwu = new Yingwu();
		Pig pig = new Pig();
		
		//���õ���Master�࣬����Animal��
		ma.feed(cat);
		ma.feed(dog);
		ma.feed(yingwu);
		ma.feed(pig);
		
	}
}

class Master{
	public void feed(Animal an){
		an.move();
	}
}


class Animal{
	public void move(){

	}
}

class Cat extends Animal{
	public void move(){
		System.out.println("����һֻС���䣡����");
	}
}

class Dog extends Animal{
	public void move(){
		System.out.println("����һ��С������");
	}
}

class Yingwu extends Animal{
	public void move(){
		System.out.println("����һֻ���ģ�����");
	}
}

class Pig extends Animal{
	public void move(){
		System.out.println("����һֻ����������");
	}
}

//��̬