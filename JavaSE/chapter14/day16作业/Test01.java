
public class Test01
{
	public static void main(String[] args){
		A a = new A(100);
		B b = new B(a);

		java.util.Scanner s = new java.util.Scanner(System.in);
		while(true){
			System.out.print("请输入要猜测的数字：");
			int caiCeNum = s.nextInt();
			b.cai(caiCeNum);
		}
		
	}
}

class A{
	//A创建对象是传了100,现在这里的V不在是默认值0，而是100
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

	//通过B猜测A
	private A a;//通常初学者，会卡在这里。不知道应该是这样的属性
				//不知道将A设置为B的一个属性。

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
		int shiJiZhi = a.getV();	//a.getV();实际上就是A类中的V属性
		if(shiJiZhi == caiCeNum){
			System.out.println("猜对了！");
			System.exit(0);	//以前没有写过，退出JVM。强行退出
		}else if(shiJiZhi > caiCeNum){
			System.out.println("猜小了！");
		}else{
			System.out.println("猜大了！");
		}

	}
}