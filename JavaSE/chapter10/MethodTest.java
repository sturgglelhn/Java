
/*
	带static和没有带static的区别？
	带static可以直接“类名.”的方式访问“实例方法”
	没有带static,需要先new创建对象，然后在通过“引用.”的方法访问实例方法
*/
public class MethodTest
{
	public static void main(String[] args){
		MethodTest.doSome();
		
		//doOther();
		//创建对象
		MethodTest t = new MethodTest();
		//通过“引用.”的方式访问实例方法
		t.doOther();
	}

	public static void doSome(){
		System.out.println("do some!");
	}

	public void doOther(){
		System.out.println("do other....");
	}
}