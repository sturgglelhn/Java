/*
	�߼��������
		&  �߼���
		|  �߼���
		�� �߼���
		&& ��·��
		|| ��·��

	�ǳ���Ҫ��
		�߼����������Ҫ���ǲ������ͣ��������յ�������Ҳ�ǲ������͡�
		�����߼���������ص㡣
	
*/
public class OperatorTest03
{
	public static void main(String[] args){
		//
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(false & false);//false

		System.out.println(100>90 & 100>100);//false

		System.out.println(90<100 & 100>89);//true
		//&:ֻ������ͬʱ����trueʱ������Ĳ���true,������false
		System.out.print("\n");

		int a = 100;
		int b = 101;
		int c = 90;
		//�����߼����أ� |
		//ֻҪ��һ����true,�������true��
		System.out.println(a<b | c>b);//true
		System.out.println(b>a | b>c);//ture
		System.out.println(c>a | a>b);//false
		// |:ֻҪ��������һ����ture,����true,������false
		
		System.out.println();
		System.out.println(!false);//ture
		System.out.println(!true);//false
		System.out.println(!(a > b));//true�����ȼ�������
		//!:ȡ�����������false���true����true���false

		/*
			���ڶ�·��&&����·��||
			�����ص�ѧϰ��·�룬��·���պ�«��ư

			��·��&& �� �߼��� & ��ʲô����
				�����������������������û���κ�������ȫ��ͬ
				ֻ����"��·��&&"�ᷢ����·����

			ʲô�Ƕ�·�����أ�
				�ұ߱��ʽ��ִ�У��������������·����

			ʲôʱ��ʹ��&&��ʲôʱ��ʹ��&?
				��Ч�ʷ�����˵��&&��&��Ч�ʸ�һЩ
				��Ϊ�߼���&���ܱ��ʽ�����ʲô���ڶ������ʽһ��ִ��

				�Ժ󿪷��У���·��&&���߼��뻹����Ҫͬʱ����ġ�
					�󲿷�����¶�����ʹ�ö�·��&&
					ֻ�е�����Ҫ��߱��ʽִ�У�����Ҫ�ұ߱��ʽִ�е�ʱ�򣬲Ż�
					ѡ���߼���&��

		*/
		System.out.print("��������������������\n");
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & false);

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);

		//��������Ҫ���һ��ʲô�Ƕ�·����ʲôʱ��ᷢ��"��·"
		int x = 10;
		int y = 11;
		//�߼���&ʲôʱ����Ϊtrue(���߶���true���������true)
		System.out.println(x>y & x>y++);
		//��ߵ� x>y ���ʽ����Ѿ���false�ˣ���ʵ�������ʽ
		//�Ľ���Ѿ�ȷ����false�ˣ���������˵�ұ߱��ʽ��Ӧ��ִ�С�
		
		//ͨ��������Եó���x > y++ ������ʽִ���ˡ�
		System.out.println(y);//12
		System.out.print("��������������������\n");

		//���Զ�·��&&
		int m = 10;
		int n = 11;
		//ʹ�ö�·��&&��ʱ�򣬵���ߵı��ʽΪfalse��ʱ���ұߵı��ʽ��ִ�У�
		//�������󱻳�Ϊ��·��
		System.out.println(m > n && m > n++);
		System.out.println(n);//11

		//ʲôʱ������·������
		//||��·��
		//"��"��ʱ��ֻҪ��һ����true���������true
		//���ԣ�����ߵı��ʽ�����true��ʱ���ұߵı��ʽ����Ҫִ�У���ʱ���·��
	}
}