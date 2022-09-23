public class CodeOrder{
	static{
		System.out.println("A");
	}
	public static void main(String[] args){
		System.out.println("main begin!");
		new CodeOrder();
		System.out.println("main over!");
	}

	{
		System.out.println("C");
	}

	static{
		System.out.println("B");
	}

	public CodeOrder(){
		System.out.println("D");
	}
}
/*
A
B
main begin! 
C
D
main over!
*/