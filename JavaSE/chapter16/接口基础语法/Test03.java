public class Test03{
	public static void main(String[] args){
		C c = new C();
		c.show();
	}
}

class B{
	public void show(){
		System.out.println("类中的show方法");
	}
}

interface A{
	public default void show(){
		System.out.println("接口中的show方法");
	}
}

class C extends B implements A{

}

/*
总结：当一个类，即继承一个父类，又实现若干个接口并且该接口
	存在和类同名方法时，子类就近选择执行父类的成员方法；
	
运行结果：
————————————————
类中的show方法
————————————————
*/