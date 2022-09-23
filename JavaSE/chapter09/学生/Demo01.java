public class Demo01
{
	public static void main(String[] args){
		stu s = new stu();

		System.out.println("s：" + s);

		System.out.println("姓名：" + s.name);
		System.out.println("年龄：" + s.age);

		System.out.println("————————————");

		s.name = "刘德华";
		s.age = 46;

		System.out.println("姓名："+ s.name);
		System.out.println("年龄："+ s.age);

		s.study();
		s.eat();
	}
}