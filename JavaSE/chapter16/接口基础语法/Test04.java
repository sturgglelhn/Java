
public class Test04{
	public static void main(String[] args){
		D d = new D();
		d.methodA();
		d.methodB();
		d.methodC();
		d.method();
	}
}


interface A{
	void methodA();
	void method();	//���ӿ��е�method()����
}

interface B{
	void methodB();
	void method();	//�ӽӿ��е�method()����
}

interface C extends A,B{
	void methodC();
	void method();
}

class D implements C{
	public void methodA(){
		System.out.println("methodA");
	}

	public void methodB(){
		System.out.println("methodB");
	}

	public void methodC(){
		System.out.println("methodC");
	}

	public void method(){
		System.out.println("����D");
	}
}
/*
�ܽ᣺һ���ӿ��ܼ̳���һ���ӿڻ��߶���ӿڣ������֮��ļ̳бȽ����ơ�
	�ӿڵļ̳�ʹ��extends�ؼ��֣��ӽӿڼ̳и��ӿڵķ�����������ӿ���
	��Ĭ�Ϸ����������ģ���ô�ӽӿ���Ҫ��дһ�Ρ�
*/
