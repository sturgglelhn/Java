public class SuperTest05
{
	public static void main(String[] args){
		Vip v = new Vip("张三");
		v.shopping();
	}
}

class Customer
{
	String name;
	public Customer(){
		
	}
	public Customer(String name){
		super();
		this.name = name;
	}
}

class Vip extends Customer
{
	String name;
	public Vip(){

	}

	public Vip(String name){
		super(name);
	}

	public void shopping(){
		/*
			java是怎么区分子类和父类的同名属性的？
				this.name：当前对象的那么属性
				super.name：当前对象的父类型特征中的name属性
		*/
		System.out.println(this.name+"正在购物！");
		System.out.println(super.name+"正在购物！");
		System.out.println(name+"正在购物！");
	}
}