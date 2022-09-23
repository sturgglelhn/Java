/*
定义丈夫类，Husband 和妻子类wife 
丈夫类的属性包括:身份证号，姓名，出生日期，妻子。
妻子类的属性包括:身份证号，姓名，出生日期，丈夫。
分别给这两个类提供构造方法(无参数构造方法和有参数构造方法都要提供),
编写测试程序，创建丈夫对象，然后再创建妻子对象，丈夫对象关联妻子对象，
妻子对象关联丈夫对象，要求能够输出这个“丈夫对象"的妻子的名字，
或者能够输出这个"妻子对象"的丈夫的名字。要求能够画出程序执行过程的内存图。
并且要求在程序中演示出空指针异常的效果.
*/

public class Test{
	public static void main(String[] args){
		Husband h = new Husband("111111","李浩南","1999-09-11", null);
		Wife w = new Wife("222222","陈吕琦","2000-02-11",null);
		
		//h.wife = w;
		//w.husband = h;
		//NullPointerException,没有赋值时会出现空指针异常

		h.wife = w;
		w.husband = h;

		System.out.println(h.name + "的妻子是" + h.wife.name);

		System.out.println(w.name + "的丈夫是" + w.husband.name);
	}
}

class Husband{
	String idCard;
	String name;
	String birthday;
	Wife wife;

	//无参构造方法
	public Husband(){

	}
	//有参构造方法
	public Husband(String s1, String s2, String s3, Wife w){
		idCard = s1;
		name = s2;
		birthday = s3;
		wife = w;
	}
	
}

class Wife{
	String idCard;
	String name;
	String birthday;
	Husband husband;

	//无参构造方法
	public Wife(){

	}
	
	//有参构造方法
	public Wife(String s1, String s2, String s3, Husband h){
		idCard = s1;
		name = s2;
		birthday = s3;
		husband = h;
	}
}


/*
public class Test
{
	public static void main(String[] args){
		Husband h = new Husband("111111","李浩南","1999-09-11");
		System.out.println(h.name);	
	
	}
}

class Husband
{
	String idCard;
	String name;
	String birthday;

	public Husband(){

	}

	public Husband(String s1, String s2, String s3){
		idCard = s1;
		name = s2;
		birthday = s3;
	}
}
*/