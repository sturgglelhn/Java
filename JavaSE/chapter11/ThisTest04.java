/*
	1、this除了可以使用在实例方法中，还可以用在构造方法中
	2、新语法：通过当前的构造方法区去调用另一个本类的构造方法，可以使用一下语法格式：
		this(实际参数列表);
			通过一个构造方法1去调用构造方法2，可以做到代码复用。
			但需要注意的是：“构造方法1”和“构造方法2”都是在同一个类当中。
	3、this();这个语法作用是什么？
		代码复用
	
	4、死记硬背：
		对于this()的调用只能出现在构造方法的第一行
		
*/
public class ThisTest04{
	public static void main(String[] args){
		Date d1 = new Date();
		d1.detail();

		Date d2 = new Date(2008,8,8);
		d2.detail();
	}
}

class Date{
	private int year;
	private int month;
	private int day;

	//构造方法无参
	public Date(){
		// 错误: 对this的调用必须是构造器中的第一个语句
		System.out.println(11);
		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		*/

		this(1922,1,12);
	}
	
	//构造方法有参
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//提供一个可以打印的方法
	public void detail(){
		System.out.println(year+"年"+month+"月"+day+"日");
	}
	
	// year用set and get
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}

	// month用set and get
	public void setMonth(int month){
		this.month = month;
	}
	public int getMonth(){
		return month;
	}

	// day用set and get
	public void setDay(int day){
		this.day = day;
	}
	public int getDay(){
		return day;
	}

}


1、this
	1.1、this是一个关健字，是一个引用，保存内存地址指向自身。
	1.2、this可以使用在实例方法中，也可以使用在构造方法中。
	1.3、this出现在实例方法中其实代表的是当前对象。
	1.4、this不能使用在静态方法中
	1.5、this. 大部分情况下可以省略，但是用来区分局部变量和实例变量的时候不能省略
	1.6、this() 这种语法只能出现在构造方法第一行，表示当前构造方法调用本类其他的
	构造方法，目的是代码复用。