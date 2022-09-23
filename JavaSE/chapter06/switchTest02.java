public class switchTest02
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入您的考试成绩：");
		double num = s.nextDouble();
		int n;
		
	
		if(num<0 || num>100)
		{
			System.out.println("您输入的成绩不合理哦！");
			return;
		}



		String str = "不及格,还需努力哦";
		n = (int)(num/10);
		switch(n){
			case 10:
			case 9:{
				str = "优秀";
				break;
			}
			case 8:{
				str = "良好";
				break;
			}
			case 7:{
				str = "中";
				break;
			}
			case 6:{
				str = "及格";
				break;
			}
		}

		System.out.println("您的成绩为："+ str);
	}
}