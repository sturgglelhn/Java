
public class Test01{
	public static void main(String[] args){
		Master zhangsan = new Master();
		Cat maoMi = new Cat();
		zhangsan.feed(maoMi);

		Yingwu yingwu = new Yingwu();

		zhangsan.feed(yingwu);


	}
}

class Master{
	public void feed(Pet pet){
		pet.eat();
	}
}

class Pet{
	public void eat(){

	}
}

class Cat extends Pet{
	public void eat(){
		System.out.println("����ϲ�����㣬�Եĺ��㣡");
	}
}

class Yingwu extends Pet{
	public void eat(){
		System.out.println("����ϲ����С�棬�Եĺ��㣡");
	}
}


/*
public class Test01{
	public static void main(String[] args){
		
		//�������˶���
		Master zhangsan = new Master();
		//�����������
		Dog zangAo = new Dog();
		//����ι
		zhangsan.feed(zangAo);

		//�����������
		Cat xiaoHua = new Cat();
		zhangsan.feed(xiaoHua);
		//д����
		//���������������ò�Ҫ������޸�
		
		YingWu yingWu = new YingWu();
		zhangsan.feed(yingWu);

	}
}
class Master{	
	public void feed(Pet pet){
		pet.eat();
	}
}

class Pet{
	public void eat(){

	}
}

class Dog extends Pet{
	//��Pet�е�eat����������д��
	public void eat(){
		System.out.println("����ϲ���Թ�ͷ���Եĺ��㣡");
	}
}

class Cat extends Pet{
	//��Pet�е�eat����������д��
	public void eat(){
		System.out.println("è��ϲ�����㣬�Եĺ��㣡��");
	}
}

class YingWu extends Pet{
	//��дeat����
	public void eat(){
		System.out.println("����ϲ����С���ӣ��Եĺ��㣡����");
	}
}

*/