public class breakTest01
{
	public static void main(String[] args){
		/*
		for(int i = 0; i<10; i++)
		{
			if(i == 5){
				break;	//��ֹѭ����������ֹ
			}
			System.out.println("i = "+i);//0 1 2 3 4 
		}*/

/*
		for(int i = 0; i<2; i++){
			for(int k = 0; k<10; k++){
				if(k == 5)
				{
					break;//���break;�����ֹ�����������forѭ��
				}
				System.out.println("i --> " + k);//0 1 2 3 4 0 1 2 3 4
			}
		}
*/

		for(int i = 0; i<10; i++){
			if(i == 5)
				break;//��ֹ�������ѭ�������
			for(int k = 0; k<2; k++){
				
				System.out.println("i --> " + k); 
			}
			System.out.println("k = " + i);
		}




/*
		for(int i = 0; i<10; i++)
		{
			if(i == 5)
			{
				continue;//�жϵ�ǰ����ѭ��������ִ��
			}
			System.out.println("i = " + i);//0 1 2 3 4 6 7 8 9
		}
*/


	}
}