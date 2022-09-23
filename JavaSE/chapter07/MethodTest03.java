public class MethodTest03
{
	public static void main(String[] args){
		byte b1 = 10;
		byte b2 = 30;
		int i = sum(b1, b2);
		System.out.println(i);
	}

	public static int sum(int x, int y){
		/*
		int z = x * y;
		return z;*/

		return x*y;
	}
}