public class Test03{
	public static void main(String[] args){
		Zi zi = new Zi();
		zi.num1 = 10;
		//错误: num2 在 Fu 中是 private 访问控制
//		zi.num2 = 20;	//被private修饰的不能直接继承
		zi.setNum2(20);		//这里用封装中set方法来修改，然后通过get来读取

		zi.method1();
//		zi.method2();	//子类无法继父类私有成员

		System.out.println("numi = " + zi.num1 + ",num2 = " + zi.getNum2());

	}
}

class Fu{
	int num1;
	private int num2;

	public Fu(){	//构造方法

	}

	public void method1(){
		System.out.println("method1.");
	}
	private void method2(){
		System.out.println("method2.");
	}

	public int getNum1(){
		return num1;
	}

	public void setNum1(int num1){
		this.num1 = num1;
	}

	public int getNum2(){
		return num2;
	}

	public void setNum2(int num2){
		this.num2 = num2;
	}
}

class Zi extends Fu{

}
/*
总结：有两个内容不能被子类继承
		1、被private修饰的（不能直接继承）
		2、构造方法不能继承。（因为构造方法和类名相同，父类和子类的名称肯定不相同，无法继承）
	被继承的子类，是完成有了父类中的属性和方法，并不是调用，是从父类中赋值了一份到子类中，
	private和构造方法除外。

运行结果：
——————————————————
method1.
numi = 10,num2 = 20
——————————————————
*/