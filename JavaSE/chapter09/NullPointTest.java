/*
	出现空指针异常的前提条件是？
		“空引用”访问实例【对象相关】相关的时候时，都会出现空指针异常。
*/

public class NullPointTest
{
	public static void main(String[] args){
	Customer c = new Customer();

	System.out.println(c.id);

	//重新赋值
	c.id = 9851;
	System.out.println(c.id);

	c = null;
	//NullPointerException
	//编译器没问题，因为编译器值检查语法，编译器发现c是Customer类型，
	//Customer类型中有id属性，所以可以：c.id。语法过了。
	//但是运行的时候需要对象的存在，但是对象没了，就只能出现一个异常
	System.out.println(c.id);
	}
}

class Customer
{
	int id;
}


