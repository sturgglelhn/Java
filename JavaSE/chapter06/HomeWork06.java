/*
С��������ÿ���2.5Ԫ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5��
����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ嵽100Ԫ��
*/

public class HomeWork06
{
	public static void main(String[] args){
		int day = 0;
		double money = 0.0;

		while(money<100){
			day++;
			money += 2.5;
			if(day % 5 == 0){
				money -= 6;
			}
			//ʲôʱ������أ�
			/*
			if(money >= 100)
			{
				break;
			}*/

		}
	//С��ͨ��74Ǯ�浽��101.0Ǯ
	System.out.println("С��ͨ��" + day + "Ǯ�浽��" + money + "Ǯ");
	}
}