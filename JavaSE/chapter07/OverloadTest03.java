/*
�������أ�overload��
	ʲôʱ����Ҫ����ʹ�÷������أ�
		��ͬһ�����У����������1���͡�����2�����ǵĹ��������Ƶ�
		��ô���Կ��ǽ����ǵķ�����һ�£��������뼴���ۣ��б���
		���ڵĴ����д�����׼��䣬����ʹ�ã�

		ע�⣺��������overload�������ʹ�ã������������ѹ������ɣ�
		�����ƣ�����û��ϵ����ʱ��������ʹ�����ػ��ƵĻ����ᵼ��
		������鷳���޷����з������ܵ����֡�

	ʲôʱ�����ᷢ���������أ�
		����1����ͬһ���൱��
		����2����������ͬ
		����3�������б�ͬ
				 �����ĸ�����ͬ�㲻ͬ
				 ���������Ͳ�ͬ�㲻ͬ
				 ������˳��ͬ�㲻ͬ
				 �������غͷ����ķ���ֵ�����޹ء�
				�������غͷ��������η��б��޹�

		ֻҪͬʱ��������3����������ô���ǿ����϶������ͷ���֮�䷢����
		���ػ���

	ע�⣺
		���ܴ�����ôд������һ������java�������ܺõ����ֿ�������������

��
*/
public class OverloadTest03
{
	public static void main(String[] args){
		m1();
		m1(100);

		m2(10, 3.14);
		m2(3.15, 10);

		m3(80);
		m3(3.14);

		//m4(10, 1);//�����ظ���

		//m5();

	}
	public static void m1(){
		System.out.println("m1�޲�����ִ�У�");
	}

	public static void m1(int a){
		System.out.println("m1��һ��int����ִ�У�");
	}

	//������˳��ͬ��Ҳ�㲻ͬ
	public static void m2(int x, double y){
		System.out.println("m2(int x, double y)");
	}

	public static void m2(double y, int x){
		System.out.println("m2(double y, int x)");
	}

	public static void m3(int x){
		System.out.println("m3(int x");
	}
	public static void m3(double x){
		System.out.println("m3(double x)");
	}
		
	//����: ������ OverloadTest03�ж����˷��� m4(int,int)
	/*public static void m4(int x, int a){//�����ظ���

	}
	public static void m4(int k, int z){

	}*/
	

	//�����ظ��ˣ�����������
	/*
	public static int m5(){
		return 1;
	}
	public static double m5(){
		return 1.0;
	}*/

}