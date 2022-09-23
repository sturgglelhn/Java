public class User{
	//私有的
	private int di;
	//受保护的
	protected int age;
	//公开
	public int weigh;
	//默认
	String name;
}

/*
1、访问控制权限都有哪些？
	public -> protected -> 默认 -> private

	访问控制修饰符	本类	同包	子类	任意位置
	——————————————————————————————————————————————————
	public			可以	可以	可以	可以
	protected		可以	可以	可以	不行
	默认			可以	可以	不行	不行
	private			可以	不行	不行	不行
	
*/