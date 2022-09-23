
public class NullPointerTest
{
	public static void main(String[] args){
		User u = new User();
		System.out.println(u.id);

		//System.out.println(u.doSoome());
		u.doSome();

		u = null;

	//	System.out.println(u.id);
	//	doSome s = doSome();
		u.doSome();
	}

	
}

class User{
	int id;

	public void doSome(){
		System.out.println("do Some!");
	}

}