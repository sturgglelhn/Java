public class InstanceCode
{
	public static void main(String[] args){
		System.out.println("main begin!");
		new InstanceCode();
		new InstanceCode("zhangsan");
	}
	
	{
		System.out.println("实例语句执行");
	}

	public InstanceCode(){
		System.out.println("无参构造方法执行");
	}

	public InstanceCode(String name){
		System.out.println("有参构造方法执行");
	}

}