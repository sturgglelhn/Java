/*
	我这里先不使用封装机制，分析程序存在什么缺点？
		Person类的age属性对外暴露，可以在外部程序中随意访问，导致了不安全。

	怎么解决这个问题？
		封装。
*/
//这是没有封装的Person
/*public class Person
{
	int age;
}*/


//尝试封装一下
//不在对外暴露复杂的数据，封装起来
//对只提供简单的操作入口
//优点：第一数据安全了。第二调用者也方便了
public class Person
{
	private int age;

	private String name;
	//对外提供简单的访问入口(电视机的遥控器就相当于电视机的访问入口，简单明了)
	//外部程序只能通过调用以下的代码来完成访问
	//思考：你应该对外提供几个访问入口？
	//思考：这些操作入口是否应该是方法呢？
	//写一个方法专门来完成读。（get）
	//写一个方法专门来完成写。（set）
	
	/*
		注意：
			java开发规范中有要求，set方法和get方法要满足以下格式。
				get
				public 返回值类型 get+属性首字母大写(无参){
					return xxx;
				}

				set
				public 返回值类型 set+属性首字母大写(有1个参数){
					xxx = 参数;
				}

		
	*/

	//get
	public int getAge(){
		return age;
	}
	
	//set
	public void setAge(int nianLing){
		if(nianLing < 0 || nianLing > 150){
			System.out.println("您输入的年龄不合法，请重新输入！");
		}
		else{
			age = nianLing;
		}
	}

	public String getName(){
		return name;
	}

	public void setName(String names){
		name = names;
	}

}








