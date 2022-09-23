//方法覆盖比较经典的案例
//一定要注意：方法覆盖/重写的时候，建议将父类的方法复制粘贴，这样比较保险。

public class OverrideTest03
{
	public static void main(String[] args){
		//创建中国人对象
		//ChinaPeople p1 = new ChinaPeople("张三");//错误原因：没有这样的构造方法
		ChinaPeople p1 = new ChinaPeople();
		p1.setName("张三");
		p1.speak();

		//创建美国人对象
		//AmericPeople p2 = new AmericPeople("Jack");//错误原因：没有这样的构造方法
		AmericPeople p2 = new AmericPeople();
		p2.setName("Jack ");
		p2.speak();
	}
}

class People
{
	private String name;
	
	public People(){}

	public People(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public void speak(){
		System.out.println(name + "......");
	}
}

//中国人
class ChinaPeople extends People{
	

	public void speak(){
		System.out.println(this.getName() + "正在说汉语");
	}
}

//美国人
class AmericPeople extends People{
	public void speak(){
		System.out.println(getName() + "speak english!");
	}
}


