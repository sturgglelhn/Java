public class forTest03
{
	public static void main(String[] args){

/*		for(int i = 0; i < 2; ++i){
			//k��������ͬ���ڴ棬��ͬ��������
			for(int k = 0; k < 10; ++k){
				System.out.println("i-->" + k);
			}
		}
*/
		int i;
		for(i = 1; i<=9; i++)
		{
			//System.out.println(i);
			for(int j = 1; j <= i; j++) //i���к�
			{
				System.out.print(j + "*" + i + "=" + i * j + " ");
			}
			System.out.println();
		}

	}
}
/*
	����Ҫ���ǣ���Ҫ�ţ������İ�˼·�۳�������д����

	�žų˷�����ص㣺
		��һ���ص㣺��9�С�
		�ڶ����ص㣺��1��1������2��2������n��n����

	ע�⣺��Ƕ��ѭ���в�Ҫ��Ϊ��ʹ�õ�Ƕ��Խ��Խ�ã����Ǵ�����뷨��
		��ΪǶ�׵Ĵ���Խ�ִ࣬��Ч��Խ�͡�
*/