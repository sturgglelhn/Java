/*
	通过这个测试得出的结论：
		super 不是引用。super也不保存内存地址，super也不指向任何对象。
		super 只是代表当前对象内部的那一块父类型的特征。
	
*/
public class SuperTest06
{
	public void doSome(){
		System.out.println(this);//SuperTest06@15db9742
		//错误: 需要'.'
		System.out.println(super);
	}
	
	//this和super不能用在静态方法中
	public static void doSome(){
		System.out.println(this);
		System.out.println(super);
	}

	public static void main(String[] args){
		SuperTest06 st = new SuperTest06();
		st.doSome();
	}
}