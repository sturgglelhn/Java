public class SuperTest01{
	public static void main(String[] args){
		new B();
	/*
	ģ�������ʵ�����е�Ҫ���ж��ӱ������и��ס�
	���н����
		A����޲������췽����
		B����޲������췽����
	*/
	}
}

class A{
	public A(){
		System.out.println("A����޲������췽����");
	}
}

class B extends A{
	public B(){
		System.out.println("B����޲������췽����");
	}
}