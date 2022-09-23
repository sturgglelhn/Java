/*
小芳的妈妈每天给2.5元，她都会存起来，但是，每当这一天是存钱的第5天
或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以村到100元。
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
			//什么时候结束呢？
			/*
			if(money >= 100)
			{
				break;
			}*/

		}
	//小芳通过74钱存到了101.0钱
	System.out.println("小芳通过" + day + "钱存到了" + money + "钱");
	}
}