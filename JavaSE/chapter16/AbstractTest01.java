public class AbstractTest01{
	public static void main(String[] args){

	}
}

abstract class Account{
	//�ǳ��󷽷�
	public void dother(){

	}

	//���󷽷�
	public abstract void withraw();
}

//����̳г����࣬�������ʵ��������

class CreditAccount extends Account{
	public void dother(){
		System.out.println("nihao");
	}
	
	//public abstract void withraw();

}


//���������������ǳ������� ����
/*
abstract class CreditAccount extends Account{

}
*/