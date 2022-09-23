/*
	业务要求:
		1、从键盘上接收一个人的年龄。
		2、年龄要求为[0-150]，其他值表示非法，需要提示非法信息。
		3、根据人的年龄来动态的判断这个人属于生命的哪个阶段？
			[0-5]婴幼儿
			[6-10]少儿
			[11-18]少年
			[19-35]青年
			[35-55]中年
			[56-150]老年
		4、请使用if语句完成以上的业务逻辑。
*/
public class IfTest02
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入年龄：");
		
		int age = s.nextInt();
		/*
		System.out.println("测试以下，您输入的年龄是：" + age);
		if(age<0 || age>150){
			System.out.println("对不起，年龄不合法");
			}
		else{
			if(age <= 5){
				System.out.println("婴幼儿");
			}else if(age <= 10){
				System.out.println("少儿");
			}else if(age <= 18){
				System.out.println("少年");
			}else if(age <= 35){
				System.out.println("青年");
			}else if(age <= 55){
				System.out.println("中年");
			}else{
				System.out.println("老年");
			}
		}
		*/

		//美观、执行效率高
		String str = "老年";
		if(age<0 || age>150){
			System.out.println("对不起，年龄不合法");
			return;	
		}else if(age <= 5){
			str = "婴幼儿";
		}else if(age <= 10){
			str = "少儿";
		}else if(age <= 18){
			str = "少年";
		}else if(age <= 35){
			str = "青年";
		}else if(age <= 55){
			str = "中年";
		}
		System.out.println(str);


	}
}