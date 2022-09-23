/*
一个数如果恰好等于它的因子之和，这个数就是完数，例如6 = 1+2+3，编程
找出1000内所有的完数。

什么是完数？
	一个数如果恰好等于它的因子之和，这个数就是完数。

那么因子怎么找？
	10的因子？
		10 % 1 == 0
		10 % 2 == 0
		10 % 5 == 0
*/
public class Homwork07
{
	public static void main(String[] args){
	
	for(int i = 2; i<=1000; i++){

		int sum = 0;

		for(int j = 1; j <= i/2; j++){

			if(i % j == 0){
				sum += j;
			}
		}
		if(i == sum){
			System.out.println(i);
		}
	}
	}
}