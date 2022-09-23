/*
	if语句的语法结构以及运行原理？
		if语句是分支语句，也可以叫做条件语句。
		if语句的语法格式：
			第一种写法：
				int a = 100;
				int b = 200;
				if(布尔表达式){
					java语句;
					java语句;
				}
				这里的一个大括号{}叫做一个分支。
				if 这个单词翻译为如果，所以又叫做条件语句
				该语法的执行原理是：
					如果布尔表达式的结果是true，则执行大
					括号中的程序，否则大括号中代码不执行
			
			第二种写法：
				if(布尔表达式){	//分支1
					java语句;
				}else{			//分支2
					java语句;
				}
				执行原理：如果布尔表达式的结果是true，则执行
				分支1，分支2不执行。如果布尔表达式的结果是false，
				分支1不执行，执行分支2。
				以上的语句可以保证有一个分支被执行。

		注意：对于if语句来说，在任何情况下只能有1个分支执行，不可能
			  存在2个或者更多个分支执行。if语句中只要有1个分支执行了，
			  整个if语句就结束了（对于1个完整的if语句来说的）

			  第三种写法：
			  	if(布尔表达式){
					java语句;
				}else{
					java语句;
				}if(布尔表达式){
					java语句;
				}else{
					java语句;
				}if(布尔表达式){
					java语句;
					....
				}
				以上if语句的执行原理？
					先判断“布尔表达式１”，如果“布尔表达式１”为true,则执行分支1，
					然后if语句结束了。
					当“布尔表达式1”结果是false，那么继续判断布尔表达式2的结果，
					如果布尔表达式2的结果是true，则执行分支2，然后整个if就结束了。

					以上往下依次判断，主要看第一个true发生在哪个分支上。
					第一个true对应的分支执行，只要一个分支执行，整个if结束。

			注意：
				1、对于if语句来说，在任何情况下只能有1个分支执行，不可能存在2个或者
					更多个分支执行。if语句中只要有1个分支执行了，整个if语句就结束了。
					（对于1个完整的if语句来说的。）

				第四种写法：
				if(布尔表达式){
					java语句;
				}else{
					java语句;
				}if(布尔表达式){
					java语句;
				}else{
					java语句;
				}if(布尔表达式){
					java语句;
				}else{
					java语句;
				}
*/
public class IfTest01
{
	public static void main(String[] args){
		boolean sex = true;

		/*
		if(sex == false){
			System.out.println("男");
		}else{
			System.out.println("女");
		}
		//这样写可以，但是显的多此一句了
		*/

		//修改：

		/*if(sex){
			System.out.println("男");
		}else{
			System.out.println("女");
		}*/

/*
		int i = 100;
		if(i == 100){
			System.out.println("i是100");
		}
*/

		/*
		// 错误: 不兼容的类型: int无法转换为boolean
		if(i = 100){	//这里只能是boolean类型
			System.out.println("i是100");
		}
		*/
		if(sex)
			System.out.println("男");
			System.out.println("HelloWorld!");
		
		if(sex){
			System.out.println("nv");
		}
		else	//这一行编译报错，因为else缺少if
			System.out.println("女");
			
	}
}