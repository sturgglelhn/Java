public class StudentTest{
	public static void main(String[] args){
		//i属于局部变量吗？当然是
		//局部变量存储在栈内存当中。(栈主要存储局部变量)
		//int i = 100;
		//访问学生姓名可以直接通过类名吗？
		//学生姓名是一个实例变量。实例变量是对象级别的变量。
		//是不是应该先有对象才能说姓名的事儿。
		//不能通过"类名"来直接访问“实例变量”。
		//System.out.println(Student.name);
		//创建学生对象1
		//s1属于局部变量吗?当然是
		//s1这个局部变量叫做引用
		Student s1 = new Student();
		//怎么访问实例变量？
		//语法：引用.实例变量名
		System.out.println(s1.no);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.sex);
		System.out.println(s1.addr);
		System.out.println("————————————————");
		//创建学生对象2
		//s2也是局部变量。
		//s2也叫引用
		Student s2 = new Student();
		System.out.println(s2.no);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.sex);
		System.out.println(s2.addr);
		s1.no = 110;
		s1.name = "张三";
		s1.age = 20;
		s1.sex = true;
		s1.addr = "深圳宝安区";

		System.out.println("学号="+s1.no);
		System.out.println("姓名="+s1.name);
		System.out.println("年龄="+s1.age);
		System.out.println("性别="+s1.sex);
		System.out.println("住址="+s1.addr);

		s1.addr = "北京大兴区";
		System.out.println("住址："+s1.addr);
	}
	public static void method(){
		//i s1 s2都是main方法中的局部变量，在这里是无法访问的
		/*
		System.out.println(i);
		System.out.println(s1);
		System.out.println(s2);
		*/
	}
}
