/*

*/

public class Test02
{
	public static void main(String[] args){
		User u = new User();

		System.out.println(u.id);
		System.out.println(u.name);
		System.out.println(u.age);

		User u2 = new User(89328);
		System.out.println(u2.id);
		System.out.println(u2.name);
		System.out.println(u2.age);
	}
}