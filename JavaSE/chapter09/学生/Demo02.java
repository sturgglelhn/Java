public class Demo02
{
	public static void main(String[] args){
		Phone p = new Phone();

		System.out.println(p.brand);
		System.out.println(p.price);
		System.out.println(p.color);
		System.out.println("——————————");

		p.brand = "iPhone 13 pro";
		p.price = 8999;
		p.color = "远峰蓝";

		System.out.println(p.brand);
		System.out.println(p.price);
		System.out.println(p.color);

		p.call("刘德华");
		p.send();
	}
}

/*
运行结果：
——————————————————
null
0
null
——————————
iPhone 13 pro
8999
远峰蓝
给刘德华打电话
大家新年好！
——————————————————
*/