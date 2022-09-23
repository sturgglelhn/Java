
public class StaticTest05
{
	public static void main(String[] args){
		//System.out.println(User.getId());

		/*
		User u1 = new User();
		System.out.println(u1.getId());
		*/

		User u1 = new User();
		u1.setId(100);
		System.out.println(u1.getId());
	}
}

class User
{
	private int id;

	public void setId(int i){
		id = i;
	}

	public int getId(){
		return id;
	}
}