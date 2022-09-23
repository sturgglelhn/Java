/*
	结论：多种数据类型做混合运算的时候，最终的结果类型是"最大容量"对应的类型
	
	char+short+byte这个除外
	因为char + short + byte混合运算的时候，各自先转换成int在做运算
*/

public class IntTest06
{
	public static void main(String[] args){
		long a = 10L;
		char c = 'a';
		short s = 100;
		int i = 30;
		
		//求和
		System.out.println(a + c + s + i);//237

		//错误: 不兼容的类型: 从long转换到int可能会有损失
		//int x = a + c + s + i;

		int x = (int)(a + c + s + i);
		System.out.println(x);

		//以下程序执行结果是？
		int temp =10/3;
		System.out.println(temp);//3

		int temp2 = 1/2;
		System.out.println(temp2);//执行整数//0.5
	}
}