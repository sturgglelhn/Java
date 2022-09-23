public class IfTest05
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入当前的性别：1表示男，0表示女：");
		int gander = s.nextInt();
		System.out.print("请输入当前的天气：1表示雨天，0表示晴天：");
		int weather = s.nextInt();

		if(weather == 1){
			//System.out.println("雨天");
			if(gander == 1){
				System.out.println("下雨了，小帅哥！记得拿一把大黑伞哦！");
			}else if(gander == 0){
				System.out.println("下雨了，小姐姐！一定记得带一把大花伞哦！");
			}
		}else if(weather == 0){
			//System.out.println("晴天");
			if(gander == 1){
				System.out.println("天气晴朗，今天适合出去嗨皮哦");
			}else if(gander == 0){
				System.out.println("天气真美，就像如花似玉的你一样，记得带好防晒霜哦");
			}
		}

		
	}
}