/*
	�ӿڣ�
		1���ӿ�Ҳ��һ�������������ͣ�����֮��Ҳ��class�ֽ����ļ�
		2���ӿ�����ȫ����ġ����������ǰ���󣩻���Ҳ����˵�ӿ�������ĳ�����
		3���ӿ���ô���壬�﷨��ʲô��
			[���η��б�] interface �ӿ���{

			}
		4���ӿ�֧�ֶ�̳У�һ���ӿڿ��Լ̳ж���ӿڡ�
		5���ӿ���ֻ�������������ݣ�һ�����ǣ�������һ�����ǣ����󷽷����ӿ���û��
		���������ˡ�ֻ�����������֡�
		6���ӿ��е�����Ԫ�ض���public���εġ������ǹ����ģ�
		7���ӿ��еĳ��󷽷�����ʱ��public abstract���η�����ʡ�ԡ�
		8���ӿ��еķ��������з����塣
		9���ӿ��г�����public static final����ʡ�ԡ�
*/
public class Test01{
	public static void main(String[] args){
		

		System.out.println(MyMath.PI);

		//MyMath.PI = 3.14;
	}
}

//����ӿ�
interface A{

}

interface B{

}

//�ӿ�֧�ֶ�̳У��̳�A,B
interface C extends A,B{

}

interface MyMath{
	double PI = 3.1415926;
	//public abstract int sum(int a, int b);
	int sum(int a, int b);

}
