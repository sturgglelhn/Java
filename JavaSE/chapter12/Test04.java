
public class Test04{
	public static void main(String[] args){
	/*
		Zi zi = new Zi();
		zi.method1();
	*/
	
	/*	Zi zi = new Zi();
		zi.method1();
	*/

	/*	Zi zi = new Zi();
		zi.method1();
		zi.method2();
	*/
		
		Zi zi = new Zi();
		zi.method();
	}
}

//成员变量名不重名
/*
class Fu{
	int num1 = 10;
}

class Zi extends Fu{
	int num2 = 20;
	
	public void method1(){
		System.out.println("父类的："+num1);
		System.out.println("子类的："+num2);
	}
}*/

/*
总结：当子类与父类成员变量不重名时，这时的访问是没有影响的

运行结果：
——————————————
父类的：10
子类的：20
——————————————
*/




//************************************************
//成员变量重名
/*
class Fu{
	int num = 10;
}
class Zi extends Fu{
	int num = 20;
	public void method1(){
		System.out.println("父类的："+ num);
		System.out.println("子类的："+ num);
	}
}*/
/*
总结：当父类和子类出现重名的成员变量时，这是访问时有影响的，默认去子类的（就近原则）

运行结果：
—————————————
父类的：20
子类的：20
—————————————
这是父类和子类中的值都是一样的，说明取得是子类中的值，就近原则
*/



//**********************************************
//成员方法不重名
/*
class Fu{
	public void method1(){
		System.out.println("Fu----method1");
	}
}

class Zi extends Fu{
	public void method2(){
		System.out.println("Zi----method2");
	}
}*/
/*
总结：如果子类和父类中出现不重名的成员方法，这时的调用是没有影响的。
	对象调用方法时，会先在子类中查找有没有对应的方法，若子类中存在
	就会执行子类中的方法，若子类中不存在就会执行父类中相应的方法；

运行结果：
——————————————
Fu----method1
Zi----method2
——————————————
*/


//***********************************************
//成员方法重写(方法重写)
class Fu{
	public void method(){
		System.out.println("Fu----method");
	}
}

class Zi extends Fu{
	public void method(){
		System.out.println("Zi----method");
	}
}
/*
总结：如果子类父类中出现重写的成员方法，这是的访问时一种特殊的情况，叫做方法重写（Override）
	**方法重写：子类中出现与父类一模一样的方法时（返回值类型，方法名和参数列表都相同），
	**会出现覆盖效果，也称为重写或复写。声明不变，重新实现。

运行结果：
——————————————
Zi----method
——————————————
*/