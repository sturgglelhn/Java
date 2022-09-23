public class AbstractTest01{
	public static void main(String[] args){

	}
}

abstract class Account{
	//非抽象方法
	public void dother(){

	}

	//抽象方法
	public abstract void withraw();
}

//子类继承抽象类，子类可以实例化对象

class CreditAccount extends Account{
	public void dother(){
		System.out.println("nihao");
	}
	
	//public abstract void withraw();

}


//抽象类的子类可以是抽象类吗？ 可以
/*
abstract class CreditAccount extends Account{

}
*/