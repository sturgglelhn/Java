public class Test02{
	public static void main(String[] args){
		Zi zi = new Zi();
		System.out.println(zi.num);
		zi.method();
	}
}

class Fu{
	private int num = 20;
	public int getNum(){	
		return num;
	}
	public void setNum(int num){
		this.num = num;
	}

	public void method(){
		System.out.println("Fu-----method");
	}
}

/*
class Zi extends Fu{
	int num = 10;
	public void method(){
		System.out.println("Zi-----method");
	}
	//��ʱ�����ܵ��ø����е�method()��������Ϊ�Ѿ���method()������������д��
	//Ҳ���ܵ��ø����еĳ�Ա��������Ϊ����͸���ĳ�Ա������ͬ������£���
	//�õ��Ǿͽ�ԭ�����Ե��õ��������е�num����
}
*/

class Zi extends Fu{
	int num = 10;
	public void method(){
		System.out.println("Zi-----method");
		//System.out.println(super.num);	//����˽�г�Ա������ͨ��super��ȡ

		//ͨ���ṩ��get/set����������
		System.out.println(super.getNum());	//��ȡ����ķ���
		super.method();
	}
}
/*
�ܽ᣺
*/