

public class Test05{
	public static void main(String[] args){
		Cat c = new Cat();
		c.eat();
		c.speak();

		Dog d = new Dog();
		d.eat();
		d.speak();
	}
}

/*
* ������
*/
class Animal{
	public void eat(){
		System.out.println("�Է�~~");
	}
	public void speak(){
		System.out.println("˵��~~");
	}
}

/*
* è��
*/
class Cat extends Animal{
	//��д�Է�����
	public void eat(){
		System.out.println("����~~");
	}

	//��д˵������
	public void speak(){
		System.out.println("�����Ľ�~~");
	}
}

/*
* ����
*/
class Dog extends Animal{
	//��д�Է�����
	public void eat(){
		System.out.println("�Թ�ͷ~~");
	}
	
	//��д˵���ķ���
	public void speak(){
		System.out.println("�����Ľ�~~");
	}
}

/*
�ܽ᣺����һ�����ࣨCat��Dog���̳и��ࣨAnimal�������ҶԼ̳й����ķ���������д�İ���

���н����
����������������������������������������������������
����~~
�����Ľ�~~
�Թ�ͷ~~
�����Ľ�
����������������������������������������������������
*/
