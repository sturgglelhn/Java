
/*
	��static��û�д�static������
	��static����ֱ�ӡ�����.���ķ�ʽ���ʡ�ʵ��������
	û�д�static,��Ҫ��new��������Ȼ����ͨ��������.���ķ�������ʵ������
*/
public class MethodTest
{
	public static void main(String[] args){
		MethodTest.doSome();
		
		//doOther();
		//��������
		MethodTest t = new MethodTest();
		//ͨ��������.���ķ�ʽ����ʵ������
		t.doOther();
	}

	public static void doSome(){
		System.out.println("do some!");
	}

	public void doOther(){
		System.out.println("do other....");
	}
}