public class Student
{
	int no;
	String name;
	int age;

	//当前的Student这个类当中并没有定义任何构造方法。
	//但是系统实际上会自动给Student类提供一个无参数的构造方法。
	//将无参数的构造方法(缺省构造器)写出来
	
	public Student(){
		System.out.println("无参数的构造方法执行了！");
	}

	public Student(int i){

	}

	//没有返回值类型，编译器会判定该方法是构造方法
	//于是编译器会检测方法名是否和类名一致，结果发现不一致
	//编译器报错。
	//错误: 方法声明无效; 需要返回类型
	/*
	public Studen(String name){
		
	}*/

	//第一种修改方法
	//public void Student(String[] args){}
	
	//第二种修改方法
	//public Student(String[] args){}
}