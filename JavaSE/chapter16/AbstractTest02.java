public class AbstractTest02{
	public static void main(String[] args){
		Cook c = new Cook();
		c.work();

		Cleaner cleaner = new Cleaner();
		cleaner.work();

		Security s = new Security();
		s.work();
	}
}

abstract class Employee{
	private String id;
	private String name;
	private Double salary;

	public Employee(){

	}

	public Employee(String id, String name,Double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//抽象方法不能有方法体
	public abstract void work();	//表示员工本就有工作，但是每个员工的工作内容是不一样的（有具体的子类来实现）
}

class Cook extends Employee{
	//必须重写父类的抽象方法，因为此类不是抽象类
	public void work(){
		System.out.println("炒菜");
	}
}

class Cleaner extends Employee{
	//必须重写父类的抽象方法，因为此类不是抽象类
	public void work(){
		System.out.println("检查外来人员");
	}
}

class Security extends Employee{
	//必须重写父类的抽象方法，因为此类不是抽象类
	public void work(){
		System.out.println("负责公司的清洁");
	}
}
/*

*/