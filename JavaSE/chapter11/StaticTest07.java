public class StaticTest07{
	static int i = 100;

	static{
		System.out.println("i = "+i);
	}
	
	int k = 111;//k������ʵ���������ڹ��췽��ִ��ʱ�ڴ�ռ�ŻῪ��

	static{
		//k�������Է�����
		//static��̬��������������ִ�У�����ִֻ��һ��
		//�����ʱ��k�����ռ仹û�п��ٳ����ء�
		//�����޷��Ӿ�̬�����������÷Ǿ�̬����K
		//System.out.println("k =" + k);

		System.out.println("name =" + name);
	}

	static String name = "����";

	public static void main(String[] args){
		System.out.println("main begin");
	}

	int n = 122;
	static{
		System.out.println(n);
	}
}