/*
	final
		1��final��java�����е�һ���ؽ���
		2��final��ʾ:���յģ����ɱ��

		3�����ص㡿final���εı�����
			final���εľֲ�������ֻ�ܸ�һ��ֵ��һ����ֵ�������¸�ֵ

		4�����ص㡿final���εķ�����
			final���εķ����޷������ǣ�����д

		5�����ص㡿final���ε��ࣿ
			final���ε����޷��̳�

		6������ʾ��final���Ʋ����ܲ��ܱ����õ����⡣final�ܵ���ɶ��
			final���ε��Ǳ�ʾ���ģ����ܱ�ģ����ܸĵ�

	���ص㣺final���εľֲ�������ֻ�ܸ�һ��ֵ��
*/
/*
final class A{
}
//B��̳�A�࣬�൱�ڶ�A��Ĺ��ܽ�����չ������㲻ϣ�����˶�A���ͽ�����չ
//����Ը�A���final�ؼ��֣������Ļ�A����޷��̳��ˡ�
//����: �޷�������A���м̳�
class B extends A{
}
*/
public class FinalTest01{
	public static void main(String[] args){
		int i = 100;
		i = 200;
	
		int k = 100;
		k = 200;
		
		//����: �����ѷ������m
		final int m;
		m = 100;
		m = 200;
		
	}
	
}

/*
class C{
	public void doSome(){
		System.out.println("C's doSome...");
	}
}

class D extends C{
	//����: D�е�doSome()�޷�����C�е�doSome()
	public void doSome(){
		System.out.println("D's doSome...");
	}
}*/