/*
public interface InterFaceName{
	public abstract void method();
}
//���ڽӿ���ֻ�ܺ��г��󷽷�����˷�������ʡ��abstract�ؼ��֣�
//����Ĭ�϶���public���εķ�����
public interface InterFaceName{
	void method();
}*/


//***********************************

/*
public class interfaceTest01{
	public static void main(String[] args){
		B b = new B();
		b.method();
	}
}

interface A{
	//����һ�������Է���
//	public abstract void method();

	//�ȼ������д��
	void method();
}

class B implements A{
	//��д�ӿ��еķ���
	public void method(){
		System.out.println("Hello Interface--");
	}
}
*/
/*
�ܽ᣺�ӿ��ж���ķ���������ȫ��ʵ������ʵ�֣���
	�������սӿڵĵĹؼ���Ϊ:implements���Ѽ̳�extends�ĳ�
	implement
*/


public class interfaceTest01{
	public static void main(String[] args){
		A.method2();
		//A.method1();	//����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� method1()

		B b = new B();
		b.method1();
//		b.method2();	//����: �Ҳ�������
	}
}


interface A{
	default void method1(){
		System.out.println("A ��Ĭ�Ϸ���~");
	}
	static void method2(){
		System.out.println("B �ľ�̬����~");
	}
}

class B implements A{

}


/*
�ܽ᣺
	Ĭ�Ϸ�����ʹ�� default ���Σ�����ʡ�ԣ���������û���������д��
	��̬������ʹ�� static ���Σ����ӿ�ֱ�ӵ��ã��ӿ��У���static
			  ���εķ������ܱ��̳е����ࣩ��

���н����
����������������������������
B �ľ�̬����~
A ��Ĭ�Ϸ���~
����������������������������
*/