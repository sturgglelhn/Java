/*
	this:
		1��this��һ���ؽ��֣�ȫ��Сд��
		2��this��ʲô�����ڴ淽���������ģ�
			һ������һ��this
			this��һ����������һ�����á�this���浱ǰ������ڴ��ַ��ָ������
			���ԣ��ϸ���������˵��this����ľ��ǡ���ǰ����
			this�洢�ڶ��ڴ浱�ж�����ڲ���

		3��thisֻ��ʹ����ʵ�������С�˭�������ʵ��������this����˭
			����this������ǣ���ǰ����

		4����this.���󲿷�������ǿ���ʡ�Ե�

		5��Ϊʲôthis����ʹ���ھ�̬�����У�����
			this����ǰ���󣬾�̬�����в����ڵ�ǰ����
*/

public class ThisTest01{
	public static void main(String[] args){
		Customer c1 = new Customer("����");
		c1.shopping();

		Customer c2 = new Customer("����");
		c2.shopping();
	}
}
class Customer{

	//ʵ������
	String name;
	
	//���췽��
	public Customer(){

	}

	public Customer(String s){
		name = s;
	}

	//shopping����
	//ʵ������
	public void shopping(){
		System.out.println(name + "���ڹ��");
	}
}
class Student
{
	String name = "����"
}