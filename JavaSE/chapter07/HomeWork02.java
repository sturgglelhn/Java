/*
	��дһ���������������ĳ��������n����С����
		���磺���������n��2
		Ҳ����Ҫ���������2����С���������������3

		���磺���������n��9
		Ҳ����Ҫ���������9����С���������������11

	˼·��
		���ȣ�ϵͳһ�����ȸ���һ��������������Ȼ�������
		���n����++��ÿ��1�õ�������m�ж�һ���Ƿ�Ϊ������
*/

public class HomeWork02
{
	public static void main(String[] args){
	
		/*
	boolean flag = isZhiShu(8);
	System.out.println(fla  g? "����" : "������");
	*/

	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.print("�������жϵ�ֵ��");
	int num = s.nextInt();
	zuiXiaoZhiShu(num);
	}
	
    public static void zuiXiaoZhiShu(int n){
		while(true){
			n++;
			boolean flag = isZhiShu(n);
			if(flag){
				System.out.println(n);
				break;
			}
		}
	}

	public static boolean isZhiShu(int num){
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}