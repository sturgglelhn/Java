
/*
	1.С��������ֱ�Ӹ�ֵ������������Ϊ�Զ�����ת��
	2.����������ֱ�Ӹ�ֵ��С��������Ҫʹ��ǿ����ת��������ǿת��
	����Ҫע����ǣ���ǿ������ת����֮����Ȼ��ͨ���ˣ���������
	��ʱ����Ի���ʧ���ȡ�
*/

public class IntTest02
{
	public static void main(String[] args)
	{
		//����������ת��
		//100L��long������������x��long����������
		long x = 100L;

		//x��long���ͣ�ռ��8���ֽڣ���y������int���ͣ�ռ��4���ֽڡ�
		//��java�����У�����������"ֱ��"��ֵ��С�����𣿲�������û�������﷨
		//���������Ϣ�����󣺲����ݵ����ͣ���longת����int���ܻ���ʧ����
		// int y = x;

		//������ת����С������Ҫ�����ͨ��������ǿ������ת����������ǿ������ת����

		int y = (int)x; //���(int)����ǿ������ת����������ȥ���ܱ���ͨ��
						//����Ҫ��ס��������Ȼͨ���ˣ���������ʱ���Ի���ʧ���ȡ�
		System.out.println(y);

	}
}