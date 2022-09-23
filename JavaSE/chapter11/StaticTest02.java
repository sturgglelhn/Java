

/*
	什么时候变量声明为实例的，什么时候声明为静态的?
		如果这个类型的所有对象的某个属性值都是一样的，
		不建议定义为实例变量，浪费内存空间。建议定义
		为类级别特征，定义为静态变量，在方法区中保留
		一份，节省内存开销。
*/

/*
public class StaticTest02
{
	public static void main(String[] arsg){
		Chinese c1 = new Chinese("784397912934789","李四","中国");
		System.out.println(c1.idCard);
		System.out.println(c1.name);
		System.out.println(c1.country);

		Chinese c2 = new Chinese("398430134897027","张三","中国");
		System.out.println(c2.idCard);
		System.out.println(c2.name);
		System.out.println(c2.country);
	}
}
class Chinese
{
	String idCard;

	String name;

	String country;


	public Chinese(){

	}

	public Chinese(String s1, String s2, String s3){
		idCard = s1;
		name = s2;
		country = s3;
	}
}
*/


public class StaticTest02
{
	public static void main(String[] args){
		// idCard是实例变量，必须先new对象，通过“引用.”访问
		//无法从静态上下文中引用非静态 变量 idCard
		//System.out.println(Chinese.idCard);//错误的

		System.out.println(Chinese.country);

		Chinese c1 = new Chinese("804379892108522","李四");
		System.out.println(c1.idCard);
		System.out.println(c1.name);

		Chinese c2 = new Chinese("892379476883699","张三");
		System.out.println(c2.idCard);
		System.out.println(c2.name);
		
	}
}
class Chinese
{
	String idCard;

	String name;

	//String country;
	//国籍
	//重点重点五颗星：加static的变量叫做静态变量
	//静态变量在类加载时初始化，不需要new对象，静态变量的空间就开出来了。
	//静态变量的存储在方法区。
	static String country = "中国";

	public Chinese(){

	}

	public Chinese(String s1, String s2){
		idCard = s1;
		name = s2;
	}
}