public class OperatorTest01
{
	public static void main(String[] args){
		int a = 10;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		//�ص�����++��--
		int i = 10;
		i++;
		System.out.println(i);

		int k = 10;
		++k;
		System.out.println(k);


		//�о���++�����ڱ���ǰ�ͱ�������ʲô����
		//�ȿ�++�����ڱ�����
		//�﷨����++�����ڱ����󣬻�������ֵ���㣬���Լ�1
		int m = 10;
		int n = m++;
		System.out.println(n);//????  10
		System.out.println(m);//11

		//++�����ڱ���ǰ�أ�
		//�﷨���򣺵�++�����ڱ���ǰ��ʱ�򣬻��Ƚ����Լ�1�����㣬Ȼ���ٸ�ֵ��
		int x = 100;
		int y = ++x;
		System.out.println(x);
		System.out.println(y);

		//��Ŀ
		int c = 90;
		System.out.println(c++);//90
		System.out.println(c);//91

		int d = 80;
		System.out.println(++d);//81
		System.out.println(d);//error:80  //81


		int z = 70;
		System.out.println(--z);//69
		System.out.println(z--);//69
	}
}