public class SuperTest05
{
	public static void main(String[] args){
		Vip v = new Vip("����");
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
			java����ô��������͸����ͬ�����Եģ�
				this.name����ǰ�������ô����
				super.name����ǰ����ĸ����������е�name����
		*/
		System.out.println(this.name+"���ڹ��");
		System.out.println(super.name+"���ڹ��");
		System.out.println(name+"���ڹ��");
	}
}