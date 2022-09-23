
/*
java中规定：参数传递的时候，和类型无关，不管是基本数据类型还是引用数据类型
统一都是将盒子中保存的那个“值”复制一份，传递下去。
*/
public class Test
{
	public static void main(String[] args){
		int i = 10;
		Add(i);
		System.out.println("main--->"+i);
	}

	public static void Add(int i ){
		i++;
		System.out.println("Add --->"+i);
	}
}