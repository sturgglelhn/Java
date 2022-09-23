public class IfTest03
{
	public static void main(String[] args){
		
		/*byte b = 2;
		int i = 1;
		
		int j = i + b;//自动转换：将取值范围小的类型，自动提升为取值范围大的类型
		System.out.println(j);*/

/*
		int i = 1;
		double d = 2.5;
		int x;
		double y;

		x = (int)(d + i);//3
		y = 1 + 2.5;
		
		System.out.println(x);//3
		System.out.println(y);//3.5

		*/

/*
		short s = 1;
		int i = 1;

		//s = s+i;// 错误: 不兼容的类型: 从int转换到short可能会有损失
		//修改：
		s = (short)(s+i);

		System.out.println(s);
		*/

		byte b = 2;
		byte i = 3;
		byte z;

		z = (byte)(b + i);

		System.out.println(z);
	}
}