public class InstanceCode
{
	public static void main(String[] args){
		System.out.println("main begin!");
		new InstanceCode();
		new InstanceCode("zhangsan");
	}
	
	{
		System.out.println("ʵ�����ִ��");
	}

	public InstanceCode(){
		System.out.println("�޲ι��췽��ִ��");
	}

	public InstanceCode(String name){
		System.out.println("�вι��췽��ִ��");
	}

}