/*
public interface InterFaceName{
	private void method(){

	}

	private static void method2(){

	}
}*/

public class interfaceTest02{
	public static void main(String[] args){
		B b = new B();
		b.method();
	}
}

interface A{
	default void method3(){
		System.out.println("A 的默认方法~");

		method();
	}

	private void method(){
		System.out.println("A 的私有方法~");
	}

	private static void method2(){
		System.out.println("A 的静态私有方法~");
	}
}

//B类实现A接口
class B implements A{

}