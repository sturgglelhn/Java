/*
	���ۣ�byte��char��short����������ʱ�򣬸�����ת����int��������
*/
public class IntTest05
{
	public static void main(String[] args){
		char c1 = 'a';
		byte b = 1;

		//ע�⣺�����"+"�Ǹ�������͵ġ�
		System.out.println(c1 + b);	//98

		//���󣺲����ݵ����ͣ���intת����short���ܻ�����ʧ
		//short s = c1 + b;//��������֪������ӷ����Ľ���Ƕ��٣�ֻ֪����int����
		
		//�����޸�����
		//����: �����ݵ�����: ��intת����short���ܻ�����ʧ
		//short s = (short)c1 + b;

		short s = (short)(c1+b);

		//short k = 98;

		int a = 1;
		//���󣺲����ݵ����ͣ���intת����short���ܻ�����ʧ
		short x = a;//�����ԣ�������ֻ֪��a��int���ͣ���֪��a�д洢���ĸ�ֵ��
		System.out.println(x);
	}
}