public class switchTest02
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("���������Ŀ��Գɼ���");
		double num = s.nextDouble();
		int n;
		
	
		if(num<0 || num>100)
		{
			System.out.println("������ĳɼ�������Ŷ��");
			return;
		}



		String str = "������,����Ŭ��Ŷ";
		n = (int)(num/10);
		switch(n){
			case 10:
			case 9:{
				str = "����";
				break;
			}
			case 8:{
				str = "����";
				break;
			}
			case 7:{
				str = "��";
				break;
			}
			case 6:{
				str = "����";
				break;
			}
		}

		System.out.println("���ĳɼ�Ϊ��"+ str);
	}
}