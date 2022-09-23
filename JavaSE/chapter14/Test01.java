public class Test01{
	public static void main(String[] args){
		Zi zi1 = new Zi();
		System.out.println("————————————");
		Zi zi2 = new Zi(20);
	}
}

class Fu{
	private int num = 10;

	public Fu(){
		System.out.println("Fu无参构造");
	}

	public Fu(int num){
		System.out.println("Fu有参构造");
	}

}

class Zi extends Fu{
	private int num = 20;
	public Zi(){
		System.out.println("Zi无参构造");
	}

	public Zi(int num){
		System.out.println("Zi有参构造");
	}
	
}
/*
1、构造方法的名字是与类名一致的。所以子类是无法继承父类构造方法的。
2、构造方法的作用是初始化成员变量的。所以子类的初始化过程中，必须
	先执行父类的初始化动作。子类的构造方法中默认有一个super()，表示
	调用父类的构造方法，父类成员变量初始化后，才可以给子类使用

继承后子类构造方法特点：子类所有构造方法都会调用父类的无参构造。
也就是说：子类中的构造方法会默认先调用父类的的构造方法，调完之后才
	可以给子类使用。

运行结果：
————————————————
Fu无参构造
Zi无参构造
————————————
Fu无参构造
Zi有参构造
————————————————
*/
