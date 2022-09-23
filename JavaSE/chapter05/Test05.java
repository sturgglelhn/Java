public class Test05
{/*
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入第一个乘以数字：");
		int num1 = s.nextInt();

		System.out.print("请输入第二个乘以数字：");
		int num2 = s.nextInt();

		System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
	}
	*/

	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("请输入您的姓名：");
		String name = s.next();

		System.out.print("请输入您的年龄：");
		int age = s.nextInt();

		System.out.print("请输入您的性别：");
		String man = s.next();

		System.out.println("————————————————");
		/*System.out.println("您的信息是:");
		System.out.println("您的姓名：" + name);
		System.out.println("您的年龄：" + age);
		System.out.println("您的性别：" + man);*/

		System.out.println("您的信息：");
		System.out.println("————————————————");
		System.out.println(
			"您的姓名："+name+"\n"+
			"您的年龄："+age+"\n"+
			"您的性别："+man
			);
	}
}