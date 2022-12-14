public class Test04{
	public static void main(String[] args){
		Address addr = new Address("北京","大兴区","11111");
		User u1 = new User("张三",addr);
		User u2 = new User("张三",addr);
		System.out.println(u1.equals(u2));//ture

		User u3 = new User("张三",new Address("北京","朝阳区","11112"));
		System.out.println(u1.equals(u3));//false

	}
}

class User{
	String name;
	Address addr;

	public User(){
	}
	
	public User(String name, Address addr){
		this.name = name;
		this.addr = addr;
	}

	//重写equals方法
	//重写规则：当一个用户的用户名和家庭住址都相同，表示同一用户
	public boolean equals(Object obj){
		if(obj == null || !(obj instanceof User)) return false;
		if(this == obj)	return true;
		User u = (User)obj;
		if(this.name.equals(u.name) && this.addr.equals(u.addr)){
			return true;
		}
		return false;

	}
}

class Address{
	String city;
	String street;
	String zipcode;

	public Address(){

	}

	public Address(String city, String street, String zipcode){
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}

	public boolean equals(Object obj){
		if(obj == null || !(obj instanceof Address)) return false;
		if(this == obj) return true;
		Address a = (Address)obj;
		if(this.city.equals(a.city) 
			&& this.street.equals(a.street) 
			&& this.zipcode.equals(a.zipcode)){
			return true;
		}
		return false;

	}
}