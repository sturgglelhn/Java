/*
	引用和变量怎么区分？
		“引用”是啥？是存储内存地址的一个变量
		“对线”是啥？堆里new出来的
*/
public class Test
{
	public static void main(String[] args){
		
		//报错了。id是实例变量，必须先创建对象，通过“引用.”的方式访问。
		/*
			User u = new User();
			u是引用
		*/
		//System.out.println(User.id);

		Address a = new Address();	//创建对象
		a.city = "北京";
		a.street = "大兴区";
		a.zipcode = "121221";

		User u = new User();
		System.out.println(u.id);
		System.out.println(u.username);
		System.out.println(u.addr);

		u.id = 1111;
		u.username = "zhangsan";
		u.addr = a;

		System.out.println(u.username +"是"+u.addr.city+"城市的！");
	}
}