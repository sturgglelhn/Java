/*
	1�������ܷ�ֱ�Ӹ�ֵ��char
	2��char x = 97;
		���java���������ģ���������Ľ����'a'
		����������Եó���������:
			��һ�����ۣ���һ��������ֵ��char���ͱ�����ʱ�򣬻��Զ�ת����char�ַ��ͣ�
			���ս����һ���ַ���

			�ڶ������ۣ���һ������û�г���byte short char��ȡֵ��Χ��ʱ��
			������ۿ���ֱ�Ӹ�ֵ��byte short char���͵ı���		
*/
public class CharTest03
{
	public static void main(String[] args){
		char c1 = 'a';
		System.out.println(c1);
		
		char c2 = 98;
		System.out.println(c2);

		//char���͵�ȡֵ��Χ��[0-65535]
		char c3 = 65535;//ʵ����������һ��"������"���ַ�
		System.out.println(c3);

		char c4 = (char)65536;
		System.out.println(c4);

		byte a = 1;
		short b= 1;
		char c = 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}