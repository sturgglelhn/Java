public class Test03{
	public static void main(String[] args){
		Zi zi = new Zi();
		zi.num1 = 10;
		//����: num2 �� Fu ���� private ���ʿ���
//		zi.num2 = 20;	//��private���εĲ���ֱ�Ӽ̳�
		zi.setNum2(20);		//�����÷�װ��set�������޸ģ�Ȼ��ͨ��get����ȡ

		zi.method1();
//		zi.method2();	//�����޷��̸���˽�г�Ա

		System.out.println("numi = " + zi.num1 + ",num2 = " + zi.getNum2());

	}
}

class Fu{
	int num1;
	private int num2;

	public Fu(){	//���췽��

	}

	public void method1(){
		System.out.println("method1.");
	}
	private void method2(){
		System.out.println("method2.");
	}

	public int getNum1(){
		return num1;
	}

	public void setNum1(int num1){
		this.num1 = num1;
	}

	public int getNum2(){
		return num2;
	}

	public void setNum2(int num2){
		this.num2 = num2;
	}
}

class Zi extends Fu{

}
/*
�ܽ᣺���������ݲ��ܱ�����̳�
		1����private���εģ�����ֱ�Ӽ̳У�
		2�����췽�����ܼ̳С�����Ϊ���췽����������ͬ���������������ƿ϶�����ͬ���޷��̳У�
	���̳е����࣬��������˸����е����Ժͷ����������ǵ��ã��ǴӸ����и�ֵ��һ�ݵ������У�
	private�͹��췽�����⡣

���н����
������������������������������������
method1.
numi = 10,num2 = 20
������������������������������������
*/