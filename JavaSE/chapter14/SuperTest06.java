/*
	ͨ��������Եó��Ľ��ۣ�
		super �������á�superҲ�������ڴ��ַ��superҲ��ָ���κζ���
		super ֻ�Ǵ���ǰ�����ڲ�����һ�鸸���͵�������
	
*/
public class SuperTest06
{
	public void doSome(){
		System.out.println(this);//SuperTest06@15db9742
		//����: ��Ҫ'.'
		System.out.println(super);
	}
	
	//this��super�������ھ�̬������
	public static void doSome(){
		System.out.println(this);
		System.out.println(super);
	}

	public static void main(String[] args){
		SuperTest06 st = new SuperTest06();
		st.doSome();
	}
}