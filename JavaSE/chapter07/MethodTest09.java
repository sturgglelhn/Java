

public class MethodTest09
{
	public static void main(String[] args){
		//int str = sum(10,20);

		//������Ժϲ���һ��
		System.out.println("sum = " + sum(10,20));

		System.out.println(T());


		boolean flag = T();
		if(flag){
			System.out.println("���....");
		}


		if(T()){
			System.out.println("��ġ�������");
		}



		
	}

	public static int sum(int a, int b){
		return a+b;
	}

	public static boolean T(){
		return true;
	}
}