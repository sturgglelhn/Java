
/*
	1、对象中有默认值吗？
		有
	2、默认值什么是多少？
		Id = 0
		name = null
		age = 0
	3、思考：实例变量没有手动赋值的时候，实际上系统会默认赋值，
	那么这个默认赋值操作是在什么时间进行的？
		是在类加载的时候给这些实例变量赋值吗？
			不是，实例变量是在构造方法执行的过程中完成初始化的，完成赋值的。

*/
public class User
{
	int id;//System.out.println(User.id);错误的。需要先new对象，只有对象有了才谈Id属性

	String name;

	int age;

	//手动定义有参数的构造方法，无参数构造方法将消失。
	/*
	public User(int a){
	}
	*/
	public User(int a){
		id = 90;
		name = "小敏";
		age = 70;
	}

	public User(){
		id = 9;
		name = "sfeg";
		age = 25;
	}

}