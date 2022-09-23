public class OverrideTest04{
	public static void main(String[] args){
		MyDate t1 = new MyDate();

		//System.out.println(t1.toString());//MyDate@15db9742

		System.out.println(t1.toString());
		System.out.println(t1);
		
		MyDate t2 = new MyDate(2008,8,8);
		System.out.println(t2);

		Student s1 = new Student(111,"张三");
		System.out.println(s1);
		System.out.println(s1.toString());
	}
}

class MyDate{
	private int year;
	private int month;
	private int day;

	public MyDate(){
		this(1970,1,1);
	}
	public MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}

	public int getMonth(){
		return month;
	}

	public void setMonth(int month){
		this.month = month;
	}

	public int getDay(){
		return day;
	}

	public void setDay(int day){
		this.day = day;
	}


	public String toString(){
		return year+"年"+month+"月"+day+"日";
	}
}

class Student{
	int no;
	String name;

	public Student(int no, String name){
		this.no = no;
		this.name = name;
	}

	public String toString(){
		return "学号：" + no + ",姓名：" + name;
	}

}


方法覆盖总结：
	1、什么时候考虑使用方法覆盖？
		父类中的方法无法满足子类的业务需求，子类有必要对继承过来的的方法进行覆盖

	2、什么条件中满足的时候构成方法覆盖？
		第一：有继承关系的两个类
		第二：具有相同方法名、返回值类型、形式参数列表
		第三：访问权限不能更低。
		第四：抛出异常不能更多。

	3、关于Object类中toString()方法的覆盖？
		toString()方法存在的作用就是：将java对象转换成字符串形式。
		大多数的java类toString()方法都是需要覆盖的。因为Object类中提供的toString()
		方法输出的是一个java对象的内存地址。

		至于toString()方法具体怎么进行覆盖？
			格式可以自己定义，或者听需求的。（听项目要求的）

	4、方法重载和方法覆盖有什么区别？
		方法重载发生在同一个类当中

		方法覆盖是发生在具有继承关系的父子类之间。

		方法重载是一个类中，方法名相同，参数列表不同。

		方法覆盖是具有继承关系的父子类，并且重写之后的方法必须和之前的方法一致：
			方法名一致、参数列表一致、返回值类型一致。