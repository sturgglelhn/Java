public class StaticTest04
{
	public static void main(String[] args){
		//��̬�������ֵ��÷�����
		//��һ�֣�
		//"����."
		StaticTest04.doSome();

		//�ڶ���
		//"����."
		StaticTest04 st = new StaticTest04();
		st.doSome();
		//���Ҿ�̬�����п�ָ��Ҳ�ܵ���
		st = null;
		st.doSome();

		//ʵ������ֻ��һ�ֵ��÷�����������봴������Ȼ������
		StaticTest04 s1 = new StaticTest04();
		s1.doOther();
		//StaticTest04.doOther();//����,ʵ����������ֱ�ӡ�����.���ķ�ʽ����

		s1 = null;
		s1.doOther();	//��ʵ�������У���s1ָ��Ϊnull,����ֿ�ָ���쳣(NullPointerException)


	}

	//��̬����
	public static void doSome(){
		System.out.println("��̬����doSome()ִ���ˣ�");
	}

	//ʵ������
	public void doOther(){
		System.out.println("ʵ������doOtherִ���ˣ�");
	}
}