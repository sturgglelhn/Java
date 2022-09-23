/*
	java中关于方法调用时参数传递实际上只有一个规则:
		不管你是基本数据类型，还是引用数据类型，实际上在传递的时候
		都是将变量中保存的那个“值”赋值一份，传过去。
*/
public class Test02
{
	public static void main(String[] args){
		Person p = new Person();
		p.age = 10;
		add(p);//传递的是new在堆中生成的对象指向p，p中是地址，把地址传递给add方法
		System.out.println("main-->"+ p.age);
	}

	public static void add(Person p){
		p.age++;
		System.out.println("add -->" + p.age);
	}
}
class Person
{
	int age;
}