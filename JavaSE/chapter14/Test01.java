public class Test01{
	public static void main(String[] args){
		Zi zi1 = new Zi();
		System.out.println("������������������������");
		Zi zi2 = new Zi(20);
	}
}

class Fu{
	private int num = 10;

	public Fu(){
		System.out.println("Fu�޲ι���");
	}

	public Fu(int num){
		System.out.println("Fu�вι���");
	}

}

class Zi extends Fu{
	private int num = 20;
	public Zi(){
		System.out.println("Zi�޲ι���");
	}

	public Zi(int num){
		System.out.println("Zi�вι���");
	}
	
}
/*
1�����췽����������������һ�µġ������������޷��̳и��๹�췽���ġ�
2�����췽���������ǳ�ʼ����Ա�����ġ���������ĳ�ʼ�������У�����
	��ִ�и���ĳ�ʼ������������Ĺ��췽����Ĭ����һ��super()����ʾ
	���ø���Ĺ��췽���������Ա������ʼ���󣬲ſ��Ը�����ʹ��

�̳к����๹�췽���ص㣺�������й��췽��������ø�����޲ι��졣
Ҳ����˵�������еĹ��췽����Ĭ���ȵ��ø���ĵĹ��췽��������֮���
	���Ը�����ʹ�á�

���н����
��������������������������������
Fu�޲ι���
Zi�޲ι���
������������������������
Fu�޲ι���
Zi�вι���
��������������������������������
*/
