/*
	break;����return;�����ʲô����
		����һ������
		break;������ֹswitch�����������ѭ����
		return;������ֹ���������һ��������
*/
public class MethodTest06
{
	public static void main(String[] args){
		for(int i = 0; i<10; i++)
		{
			if(i == 5)
			{
				//break; //��ֹforѭ��
				return;  //��ֹ��ǰ�ķ�������break;����һ������ġ�
			}
			System.out.println("i = " + i);
		}
		System.out.println("Hello World!");
	}
} 