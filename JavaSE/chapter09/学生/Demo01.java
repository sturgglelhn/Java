public class Demo01
{
	public static void main(String[] args){
		stu s = new stu();

		System.out.println("s��" + s);

		System.out.println("������" + s.name);
		System.out.println("���䣺" + s.age);

		System.out.println("������������������������");

		s.name = "���»�";
		s.age = 46;

		System.out.println("������"+ s.name);
		System.out.println("���䣺"+ s.age);

		s.study();
		s.eat();
	}
}