public class IfTest04
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("请输入您的成绩：");
		int score = s.nextInt();

/*
		String str = "完美";
		if(score<0 || score>100)
		{
			System.out.println("您输入的成绩不合法！");
			return;
		}else if(score <= 60){
			str = "不及格";
		}else if(score <= 70){
			str = "及格";
		}else if(score <= 80){
			str = "良好";
		}else if(score <= 90){
			str = "优秀";
		}
		System.out.println(str);
*/


		if(score < 0 || score > 100)
		{
			System.out.println("不合法！");
		}else if(score >= 90){
			System.out.println("完美");
		}else if(score >= 80){
			System.out.println("优秀");
		}else if(score >= 70){
			System.out.println("良好");
		}else if(score >= 60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}

	}
}