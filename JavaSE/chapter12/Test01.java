public class Test01{
	public static void main(String[] args){
		Student s = new Student();
		s.name = "小明";
		s.age = 20;
		s.eat();
		s.sleep();

		Teacher t = new Teacher();
		t.name = "小红";
		t.age = 22;
		t.eat();
		t.sleep();

		Worker w = new Worker();
		w.name = "小李";
		w.age = 21;
		w.eat();
		w.sleep();
	}
}

class Person{
	String name;
	int age;
	
	public void eat(){
		System.out.println(name+"今天"+age+"岁，正在吃放");
	}

	public void sleep(){
		System.out.println(name+"吃完饭后睡觉");
	}
}

class Student extends Person{

}

class Teacher extends Person{
	
}

class Worker extends Person{

}
/*
总结：此测试说明父类被子类继承，把父类中的方法和属性继承到子类中

运行结果：
——————————————————————
小明今天20岁，正在吃放
小明吃完饭后睡觉
小红今天22岁，正在吃放
小红吃完饭后睡觉
小李今天21岁，正在吃放
小李吃完饭后睡觉
——————————————————————
*/