/*
	�ӿڵĻ����﷨��
		1�����������̳У���ͽӿ�֮�����ʵ�֡�
		����룺����Ȼ���Խ���ʵ�֡��������̳С�
		�̳�ʹ��extends�ؽ������
		ʵ��ʹ��implement�ؼ������

		2������ǣ�*****������һ���ǳ������ʵ�ֽӿڵĻ������뽫�ӿ������е�
		���󷽷�ȫ��ʵ�֣����ǡ���д����
*/

public class Test02{
	public static void main(String[] args){
		MyMath mm = new MyMathImpl();
		int result1 = mm.sum(10, 20);
		System.out.println(result1);

		int result2 = mm.sub(30, 20);
		System.out.println(result2);

	}
}

//����ĳ����࣬��ɳ���ģ������ӿ�
interface MyMath{
	//double PI = 3.1415926;

	int sum(int a, int b);
	int sub(int a, int b);

}

//��дһ���ࣨ�������һ�����ǳ��󡱵��ࣩ
//�����������������
/*abstract class MyMathImpl implements MyMath{

}*/

class MyMathImpl implements MyMath{
	public int sum(int a, int b){
		return a + b;
	}

	public int sub(int a, int b){
		return a - b;
	}
}