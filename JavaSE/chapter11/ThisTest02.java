

public class ThisTest02
{
	int i = 100;

	static int a = 200;
	public static void main(String[] args){
		ThisTest02 t1 = new ThisTest02();
		System.out.println("i = " + t1.i);

		System.out.println("a = "+ ThisTest02.a);
		System.out.println("a = "+ a);
	}
}