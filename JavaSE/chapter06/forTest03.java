public class forTest03
{
	public static void main(String[] args){

/*		for(int i = 0; i < 2; ++i){
			//k是两个不同的内存，不同的作用域
			for(int k = 0; k < 10; ++k){
				System.out.println("i-->" + k);
			}
		}
*/
		int i;
		for(i = 1; i<=9; i++)
		{
			//System.out.println(i);
			for(int j = 1; j <= i; j++) //i是行号
			{
				System.out.print(j + "*" + i + "=" + i * j + " ");
			}
			System.out.println();
		}

	}
}
/*
	最重要的是：不要慌，慢慢的把思路捋出来，再写代码

	九九乘法表的特点：
		第一个特点：共9行。
		第二个特点：第1行1个。第2行2个。第n行n个。

	注意：在嵌套循环中不要认为，使用的嵌套越多越好，那是错误的想法，
		因为嵌套的次数越多，执行效率越低。
*/