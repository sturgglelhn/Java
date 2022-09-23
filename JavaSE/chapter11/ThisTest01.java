/*
	this:
		1、this是一个关健字，全部小写。
		2、this是什么？在内存方面是怎样的？
			一个对象一个this
			this是一个变量，是一个引用。this保存当前对象的内存地址，指向自身。
			所以，严格意义上来说，this代表的就是“当前对象”
			this存储在堆内存当中对象的内部。

		3、this只能使用在实例方法中。谁调用这个实例方法，this就是谁
			所以this代表的是：当前对象。

		4、“this.”大部分情况下是可以省略的

		5、为什么this不能使用在静态方法中？？？
			this代表当前对象，静态方法中不存在当前对象。
*/

public class ThisTest01{
	public static void main(String[] args){
		Customer c1 = new Customer("张三");
		c1.shopping();

		Customer c2 = new Customer("李四");
		c2.shopping();
	}
}
class Customer{

	//实例变量
	String name;
	
	//构造方法
	public Customer(){

	}

	public Customer(String s){
		name = s;
	}

	//shopping方法
	//实例方法
	public void shopping(){
		System.out.println(name + "正在购物！");
	}
}
class Student
{
	String name = "张三"
}