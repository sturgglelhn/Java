/*
һ�������ǡ�õ�����������֮�ͣ��������������������6 = 1+2+3�����
�ҳ�1000�����е�������

ʲô��������
	һ�������ǡ�õ�����������֮�ͣ����������������

��ô������ô�ң�
	10�����ӣ�
		10 % 1 == 0
		10 % 2 == 0
		10 % 5 == 0
*/
public class Homwork07
{
	public static void main(String[] args){
	
	for(int i = 2; i<=1000; i++){

		int sum = 0;

		for(int j = 1; j <= i/2; j++){

			if(i % j == 0){
				sum += j;
			}
		}
		if(i == sum){
			System.out.println(i);
		}
	}
	}
}