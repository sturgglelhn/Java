/*
public interface InterFaceName{
	public abstract void method();
}
//由于接口中只能含有抽象方法，因此方法可以省略abstract关键字，
//并且默认都是public修饰的方法：
public interface InterFaceName{
	void method();
}*/


//***********************************

/*
public class interfaceTest01{
	public static void main(String[] args){
		B b = new B();
		b.method();
	}
}

interface A{
	//定义一个抽象性方法
//	public abstract void method();

	//等价上面的写法
	void method();
}

class B implements A{
	//重写接口中的方法
	public void method(){
		System.out.println("Hello Interface--");
	}
}
*/
/*
总结：接口中定义的方法，必须全部实例化（实现），
	用来接收接口的的关键字为:implements，把继承extends改成
	implement
*/


public class interfaceTest01{
	public static void main(String[] args){
		A.method2();
		//A.method1();	//错误: 无法从静态上下文中引用非静态 方法 method1()

		B b = new B();
		b.method1();
//		b.method2();	//错误: 找不到符号
	}
}


interface A{
	default void method1(){
		System.out.println("A 的默认方法~");
	}
	static void method2(){
		System.out.println("B 的静态方法~");
	}
}

class B implements A{

}


/*
总结：
	默认方法：使用 default 修饰，不可省略，供子类调用或者子类重写。
	静态方法：使用 static 修饰，供接口直接调用（接口中，被static
			  修饰的方法不能被继承到子类）。

运行结果：
——————————————
B 的静态方法~
A 的默认方法~
——————————————
*/