public class Test02{
	public static void main(String[] args){
		Coder c = new Coder();
		c.name = "小李";
		c.age = 22;
		c.eat();
		c.sleep();
		c.coding();	//敲代码方法

		Teacher t = new Teacher();
		t.name = "小琦";
		t.age = 21;
		t.eat();
		t.sleep();
		t.teach();	//上课方法
	}
}

class Person{
	String name;
	int age;

	/**
	* 吃饭行为
	*/
	public void eat(){
		System.out.println(name+"正在吃饭");
	}
	
	/**
	* 睡觉行为
	*/
	public void sleep(){
		System.out.println(name+"饭后小憩一会");
	}
}

class Coder extends Person{
	public void coding(){
		System.out.println(name+"敲代码");	//继承父类name的属性
	}
}

class Teacher extends Person{
	public void teach(){
		System.out.println(name+"上课");	//继承父类name的属性
	}
}
/*
总结：Coder和Teacher继承父类Person的共有属性和行为，
	并且在子类中还独自有自己的行为分别为：coding()、teach()。
	在继承的同时在增强了自己的行为，这是继承的一大特点
运行结果：
——————————————————
小李正在吃饭
小李饭后小憩一会
小李敲代码
小琦正在吃饭
小琦饭后小憩一会
小琦上课
——————————————————

*/