
public class Test01
{
	public static void main(String[] args){
		A a = new A(100);
		B b = new B(a);

		java.util.Scanner s = new java.util.Scanner(System.in);
		while(true){
			System.out.print("������Ҫ�²�����֣�");
			int caiCeNum = s.nextInt();
			b.cai(caiCeNum);
		}
		
	}
}

class A{
	//A���������Ǵ���100,���������V������Ĭ��ֵ0������100
	private int v;
	public A(){

	}
	public A(int v){
		this.v = v;
	}

	public void setV(int v){
		this.v = v;
	}

	public int getV(){
		return v;
	}
}

class B{

	//ͨ��B�²�A
	private A a;//ͨ����ѧ�ߣ��Ῠ�������֪��Ӧ��������������
				//��֪����A����ΪB��һ�����ԡ�

	public B(){

	}
	public B(A a){
		this.a = a;
	}

	public A getA(){
		return a;
	}
	public void setA(){
		this.a = a;
	}

	public void cai(int caiCeNum){
		//int shiJiZhi = this.getA().getV();
		int shiJiZhi = a.getV();	//a.getV();ʵ���Ͼ���A���е�V����
		if(shiJiZhi == caiCeNum){
			System.out.println("�¶��ˣ�");
			System.exit(0);	//��ǰû��д�����˳�JVM��ǿ���˳�
		}else if(shiJiZhi > caiCeNum){
			System.out.println("��С�ˣ�");
		}else{
			System.out.println("�´��ˣ�");
		}

	}
}