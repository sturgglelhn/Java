public class OperatorTest01
{
	public static void main(String[] args){
		int a = 10;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		//重点掌握++和--
		int i = 10;
		i++;
		System.out.println(i);

		int k = 10;
		++k;
		System.out.println(k);


		//研究：++出现在变量前和变量后有什么区别？
		//先看++出现在变量后
		//语法：当++出现在变量后，会先做赋值运算，在自加1
		int m = 10;
		int n = m++;
		System.out.println(n);//????  10
		System.out.println(m);//11

		//++出现在变量前呢？
		//语法规则：当++出现在变量前的时候，会先进行自加1的运算，然后再赋值。
		int x = 100;
		int y = ++x;
		System.out.println(x);
		System.out.println(y);

		//题目
		int c = 90;
		System.out.println(c++);//90
		System.out.println(c);//91

		int d = 80;
		System.out.println(++d);//81
		System.out.println(d);//error:80  //81


		int z = 70;
		System.out.println(--z);//69
		System.out.println(z--);//69
	}
}