
//��ҷ������´��룬�������ᱨ����
public class MethodTest07
{
	public static void main(String[] args){
		//���÷���
		//��һ�ַ���
		int result =  m();
		System.out.println(result);

		//�ڶ��ַ���
		//System.out.println(m());
		
		int result1 = x(true);
		System.out.println("result1 = "+ result1);

		int result2 = x(false);
		System.out.println("result2 = "+result2);


	}
	
	//����: ȱ�ٷ������
	/*
	public static int m(){
		boolean flag = true;//���������������г��򣬱�����ֻ������
		//���ڱ�������˵��������ֻ֪��flag������boolean����
		//����������Ϊflag�п�����false���п�����true
		if(flag){
			//���������ã��������д�����ܻ�ִ�У���ȻҲ���ܲ���ִ��
			//������Ϊ��ȷ�����򲻳����κ��쳣�����Ա�����˵��ȱ�ٷ�����䡣
			return 1;
		}
	}
	*/

	//��ô�޸���������أ�
	//��һ�ַ���������else��֧�Ŀ��Ա�֤һ������һ����ִ֧��
	/*
	public static int m(){
		boolean flag = true;
		if(flag){
			return 1;
		}else{
			return 0;
		}
	}
	*/

	//�ڶ��ַ������÷���ʵ�����Ƿ���1�ı��Ρ�
	//return���һ��ִ�У����ڵķ����ͻ������
	/*
	public static int m(){
		boolean flag = true;
		if(flag){
			return 1;
		}
		return 0;
	}*/


	//��ͬһ�����У�"return���"���治���ٱ�д�������롣��д֮����뱨��
	/*
	public static int m(){
		boolean flag = true;
		if(flag){
			return 1;
			//����: �޷����ʵ����
			//System.out.println("hello!");
		}
		//���д��������Ĵ���hello�������ǣ�����ͬһ�����С�
		//System.out.println("hello!");
		return 0;
		//����: �޷����ʵ����
		//System.out.println("hello!");
	}*/

	//��Ŀ�������ʱ������ô�����Ӽ���
	public static int m(){
		boolean flag = true;
		return flag ? 1 : 0;
	}
	
	public static int x(boolean flag){
		return flag ? 1 : 0;
	}


}