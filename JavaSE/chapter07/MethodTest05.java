public class MethodTest05{
	public static void main(String[] args){
		//����m1����
		System.out.println("main begin");
		m1();
		System.out.println("main over");
	}
	
	public static void m1(){
		//���ó���һ��д��main�����У���Ҫmain�������⻯��
		//main����Ҳ��һ����ͨ������
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 begin");
	}

	//m2�������Ե���T���m3()������
	public static void m2(){
		System.out.println("m2 begin");
		T.m3();
		System.out.println("m2 begin");
	}

}

class T{
	public static void m3(){
		System.out.println("m3 begin");
		System.out.println("this m2 method execute!");
		System.out.println("m3 begin");
	}
}
/*
��ѭ���϶��µ�˳��ִ��
�����
����������������������������������������������������
main begin
m1 begin
m2 begin
m3 begin
this m2 method execute!
m3 begin
m2 begin
m1 begin
main over
����������������������������������������������������
*/