/*
	�ڸ���������ͬ�������ԣ�����˵����ͬ�ķ���
	�����ʱ���������з��ʸ����е����ݣ�����ʹ�á�super.���������֡�

	super.������	�����ʸ�������ԡ�
	super.������(ʵ��)	�����ʸ���ķ�����
	super(ʵ��)		�����ø���Ĺ��췽����
*/
public class SuperTest07
{
	public static void main(String[] args){
		Cat c = new Cat();
		c.yiDong();
	}
}

class Animal{
	public void move(){
		System.out.println("Animal move!");
	}
}

class Cat extends Animal{
	/*
	public void move(){
		System.out.println("Cat move!");
	}
*/
	public void yiDong(){
		this.move();
		move();
		super.move();
	}
}