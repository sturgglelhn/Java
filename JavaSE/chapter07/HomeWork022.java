public class HomeWork022
{
	public static void main(String[] args){
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.print("�������жϵ�ֵ��");
	int num = s.nextInt();
	zuiXiaoZhiShu(num);
	}
	
    public static void zuiXiaoZhiShu(int n){
		//�������������Ӧ����n�������¼�1
		while(!isZhiShu(++n)){
		}
		System.out.println(n);
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