/*
	���ֿ�ָ���쳣��ǰ�������ǣ�
		�������á�����ʵ����������ء���ص�ʱ��ʱ��������ֿ�ָ���쳣��
*/

public class NullPointTest
{
	public static void main(String[] args){
	Customer c = new Customer();

	System.out.println(c.id);

	//���¸�ֵ
	c.id = 9851;
	System.out.println(c.id);

	c = null;
	//NullPointerException
	//������û���⣬��Ϊ������ֵ����﷨������������c��Customer���ͣ�
	//Customer��������id���ԣ����Կ��ԣ�c.id���﷨���ˡ�
	//�������е�ʱ����Ҫ����Ĵ��ڣ����Ƕ���û�ˣ���ֻ�ܳ���һ���쳣
	System.out.println(c.id);
	}
}

class Customer
{
	int id;
}


