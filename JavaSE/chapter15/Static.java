public class Static{
	public static void main(String[] args){
		System.out.println(A.abc);
		System.out.println(B.abc);
		A.method();
		B.method();
	}
}

class A{
	static int abc = 10;

	static void method(){
		System.out.println("aa");
	}
}

class B extends A{
	static void method(){
		System.out.println("bb");
	}
}

/*
�ܽ᣺˵����static���εĳ�Ա�ǿ��Ա��̳е������е�
���н����
��������������������������������
10
10
aa
bb
��������������������������������
*/