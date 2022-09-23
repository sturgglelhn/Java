public class Test02{
	public static void main(String[] args){
		Zi zi = new Zi();
		System.out.println(zi.num);
		zi.method();
	}
}

class Fu{
	private int num = 20;
	public int getNum(){	
		return num;
	}
	public void setNum(int num){
		this.num = num;
	}

	public void method(){
		System.out.println("Fu-----method");
	}
}

/*
class Zi extends Fu{
	int num = 10;
	public void method(){
		System.out.println("Zi-----method");
	}
	//此时并不能调用父类中的method()方法，因为已经对method()方法进行了重写。
	//也不能调用父类中的成员变量，因为子类和父类的成员变量相同的情况下，采
	//用的是就近原则，所以调用的是子类中的num变量
}
*/

class Zi extends Fu{
	int num = 10;
	public void method(){
		System.out.println("Zi-----method");
		//System.out.println(super.num);	//父类私有成员不可以通过super获取

		//通过提供的get/set方法来访问
		System.out.println(super.getNum());	//获取父类的方法
		super.method();
	}
}
/*
总结：
*/