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
		System.out.println("A ��Ĭ�Ϸ���~");

		method();
	}

	private void method(){
		System.out.println("A ��˽�з���~");
	}

	private static void method2(){
		System.out.println("A �ľ�̬˽�з���~");
	}
}

//B��ʵ��A�ӿ�
class B implements A{

}