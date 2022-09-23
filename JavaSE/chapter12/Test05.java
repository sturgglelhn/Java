

public class Test05{
	public static void main(String[] args){
		Cat c = new Cat();
		c.eat();
		c.speak();

		Dog d = new Dog();
		d.eat();
		d.speak();
	}
}

/*
* 动物类
*/
class Animal{
	public void eat(){
		System.out.println("吃饭~~");
	}
	public void speak(){
		System.out.println("说话~~");
	}
}

/*
* 猫类
*/
class Cat extends Animal{
	//重写吃饭方法
	public void eat(){
		System.out.println("吃鱼~~");
	}

	//重写说话方法
	public void speak(){
		System.out.println("喵喵的叫~~");
	}
}

/*
* 狗类
*/
class Dog extends Animal{
	//重写吃饭方法
	public void eat(){
		System.out.println("吃骨头~~");
	}
	
	//重写说话的方法
	public void speak(){
		System.out.println("汪汪的叫~~");
	}
}

/*
总结：这是一个子类（Cat、Dog）继承父类（Animal），并且对继承过来的方法进行重写的案例

运行结果：
——————————————————————————
吃鱼~~
喵喵的叫~~
吃骨头~~
汪汪的叫
——————————————————————————
*/
