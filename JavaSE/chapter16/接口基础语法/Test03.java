public class Test03{
	public static void main(String[] args){
		C c = new C();
		c.show();
	}
}

class B{
	public void show(){
		System.out.println("���е�show����");
	}
}

interface A{
	public default void show(){
		System.out.println("�ӿ��е�show����");
	}
}

class C extends B implements A{

}

/*
�ܽ᣺��һ���࣬���̳�һ�����࣬��ʵ�����ɸ��ӿڲ��Ҹýӿ�
	���ں���ͬ������ʱ������ͽ�ѡ��ִ�и���ĳ�Ա������
	
���н����
��������������������������������
���е�show����
��������������������������������
*/