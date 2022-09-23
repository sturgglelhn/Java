

public class Person{
	public static void main(String[] args){
		Student student = new Student("小灰", 22);
		student.study();
		student.swim();

		Singer singer = new Singer("小蓝", 20);
		singer.sing();
		singer.dance();
		singer.eat();
	}
}

/*人类
属性：姓名、年龄
行为：吃饭、睡觉
*/
class Person01{
	private String name;
	private int age;

	public Person01(){

	}
	
	public Person01(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void eat(){
		System.out.println("在吃饭");
	}

	public void sleep(){
		System.out.println("在睡觉");
	}
}

//游泳接口：实现该接口代表具备游泳功能
interface Swimmabale{
	void swim();
}


//跳舞接口：实现该接口该表具备跳舞功能
interface Danceable{
	void dance();
}

//学生类，是一个人，并且会游泳
class Student extends Person01 implements Swimmabale{
	public Student(){

	}

	public Student(String name, int age){
		//调用父类的构造方法初始化
		super(name, age);
	}

	//实现抽象方法
	public void swim(){
		System.out.println(getName()+"在游泳");
	}

	//自己独特的方法
	public void study(){
		System.out.println(getName()+"在学习");
	}
}

//歌手类，是一个人，并且会跳舞
class Singer extends Person01 implements Danceable{
	public Singer(){

	}
	public Singer(String name, int age){
		//调用父类的构造方法初始化
		super(name, age);
	}

	public void dance(){
		System.out.println(getName()+"在跳舞");
	}

	//自己独特的方法
	public void sing(){
		System.out.println(getName()+"在唱歌");
	}
}


/*
在继承体系中，一个类只能继承一个父类。而对于接口而言，一个类
是可以实现多个接口的，这叫做接口的多实现。并且，一个类能继承
一个父类，同时实现多个接口。
实现格式：
class 类名 [extends 父类名] implements 接口1,接口2,接口3...{
	//重写接口中的抽象方法【必须】
	//重写接口中默认方法【不重名时可选】
}


*/


/*
默认方法（JDK新特性）
tips：在实现多个接口中，如果多个接口中包含有同名方法，子类必须实现该方法。


定义两个接口：
interface A{
	public default void methodA(){
		System.out.println("method A..");
	}
	public default void method(){
		System.out.println("method");
	}
}

interface B{
	public default void methodB(){
		System.out.println("method B..");
	}

	public default void method(){
		System.out.println("method");
	}
}

class C implements A,B{
	pbulic void methodA(){
		Sysetm.out.println("A");
	}

	public void method(){
		System.out.println("必须实现的方法");
	}

	public void methodB(){
		System.out.println("B");
	}
}
*/