public class IfTest04
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("���������ĳɼ���");
		int score = s.nextInt();

/*
		String str = "����";
		if(score<0 || score>100)
		{
			System.out.println("������ĳɼ����Ϸ���");
			return;
		}else if(score <= 60){
			str = "������";
		}else if(score <= 70){
			str = "����";
		}else if(score <= 80){
			str = "����";
		}else if(score <= 90){
			str = "����";
		}
		System.out.println(str);
*/


		if(score < 0 || score > 100)
		{
			System.out.println("���Ϸ���");
		}else if(score >= 90){
			System.out.println("����");
		}else if(score >= 80){
			System.out.println("����");
		}else if(score >= 70){
			System.out.println("����");
		}else if(score >= 60){
			System.out.println("����");
		}else{
			System.out.println("������");
		}

	}
}