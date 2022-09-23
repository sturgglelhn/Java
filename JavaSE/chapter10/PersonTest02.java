public class PersonTest02
{
	public static void main(String[] args){
		Person p1 = new Person();

		//Person的age，
/*		System.out.println(p1.age);

		p1.age = 50;

		System.out.println(p1.age);
*/
	
	//通过“类名.”可以调用set和get方法吗？不行
	//只有方法修饰符列表中有static的时候，才能使用“类名.”的方式访问
	//错误的
		//Person.getAge();


		//int nianLing = p1.getAge();
		//System.out.println(nianLing);
		System.out.println(p1.getAge());

		p1.setAge(18);
		System.out.println(p1.getAge());

		p1.setAge(-100);
		System.out.println(p1.getAge());



		System.out.println(p1.getName());

		p1.setName("李浩南");
		System.out.println(p1.getName());

		p1.setName("陈吕琦");
		System.out.println(p1.getName());
	}
}