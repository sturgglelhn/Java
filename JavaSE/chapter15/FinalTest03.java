

public class FinalTest03{
	public static void main(String[] args){
		User u = new User();
		System.out.println(u.age);
	}
}

class User{
	//错误: 变量 age 未在默认构造器中初始化
	//程序员必须手动赋值
	final int age;
	final int age = 12;
}