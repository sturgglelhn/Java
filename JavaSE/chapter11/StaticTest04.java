public class StaticTest04
{
	public static void main(String[] args){
		//静态方法两种调用方法：
		//第一种：
		//"类名."
		StaticTest04.doSome();

		//第二种
		//"引用."
		StaticTest04 st = new StaticTest04();
		st.doSome();
		//而且静态方法中空指针也能调用
		st = null;
		st.doSome();

		//实例方法只有一种调用方法，必须必须创建对象，然后引用
		StaticTest04 s1 = new StaticTest04();
		s1.doOther();
		//StaticTest04.doOther();//错误,实例变量不能直接“类名.”的方式调用

		s1 = null;
		s1.doOther();	//在实例方法中，将s1指定为null,会出现空指针异常(NullPointerException)


	}

	//静态方法
	public static void doSome(){
		System.out.println("静态方法doSome()执行了！");
	}

	//实例方法
	public void doOther(){
		System.out.println("实例方法doOther执行了！");
	}
}