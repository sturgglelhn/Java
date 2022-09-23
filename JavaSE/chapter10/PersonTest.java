public class PersonTest
{
	public static void main(String[] args){
		Person p1 = new Person();

		System.out.println(p1.age);

		p1.age = 50;

		System.out.println(p1.age);

		p1.age = -100;
		System.out.println(p1.age);

	}
}