/*
public class MethodTest01
{	//
	public static void main(String[] args){

		int x = 100;
		int y = 200;
		int z = x + y;
		System.out.println(x+"+" +y+ "="+z);
	}
}*/


/*
	这是一个体验程序，体验一下方法的好处
*/

public class MethodTest01
{
	public static void main(String[] args){
		sumInt(100, 200);
		sumInt(200, 666);
		sumInt(11,33);
	}

	public static void sumInt(int x, int y){
		int z = x + y;
		System.out.println(x+"+" +y+ "="+z);
	}
}

