//�������ǱȽϾ���İ���
//һ��Ҫע�⣺��������/��д��ʱ�򣬽��齫����ķ�������ճ���������Ƚϱ��ա�

public class OverrideTest03
{
	public static void main(String[] args){
		//�����й��˶���
		//ChinaPeople p1 = new ChinaPeople("����");//����ԭ��û�������Ĺ��췽��
		ChinaPeople p1 = new ChinaPeople();
		p1.setName("����");
		p1.speak();

		//���������˶���
		//AmericPeople p2 = new AmericPeople("Jack");//����ԭ��û�������Ĺ��췽��
		AmericPeople p2 = new AmericPeople();
		p2.setName("Jack ");
		p2.speak();
	}
}

class People
{
	private String name;
	
	public People(){}

	public People(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public void speak(){
		System.out.println(name + "......");
	}
}

//�й���
class ChinaPeople extends People{
	

	public void speak(){
		System.out.println(this.getName() + "����˵����");
	}
}

//������
class AmericPeople extends People{
	public void speak(){
		System.out.println(getName() + "speak english!");
	}
}


