/*
	1、整数能否直接赋值给char
	2、char x = 97;
		这个java语句是允许的，并且输出的结果是'a'
		经过这个测试得出两个结论:
			第一个结论：当一个整数赋值给char类型变量的时候，会自动转换成char字符型，
			最终结果是一个字符。

			第二个结论：当一个整数没有超出byte short char的取值范围的时候，
			这个结论可以直接赋值给byte short char类型的变量		
*/
public class CharTest03
{
	public static void main(String[] args){
		char c1 = 'a';
		System.out.println(c1);
		
		char c2 = 98;
		System.out.println(c2);

		//char类型的取值范围：[0-65535]
		char c3 = 65535;//实际上最终是一个"看不懂"的字符
		System.out.println(c3);

		char c4 = (char)65536;
		System.out.println(c4);

		byte a = 1;
		short b= 1;
		char c = 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}