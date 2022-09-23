/*
protected object clone()	//负责对象克隆的。
int hashCode()	//获取对象哈希值的一个方法
boolean equals(Object obj)	//判断两个对象是否相等
String toString()	//将对象转换成字符串形式
protected void finalize()	//垃圾回收器负责调用的方法

*/


//*********toString**********
/*
关于object类总的toString()方法
	1、源代码长什么样？
		public String toString(){
			return this.getClass().getName()+"@"+Integer.toHexString(hashCode());
		}
		源代码上toString()方法的默认实现是：
			类名@对线的内存地址转换为十六进制

	2、SUN设计toString()方法的目的是什么？
		toString()方法的作用是什么？
			toString()方法的设计目的是：通过调用这个方法可以将一个”java对象“转换成”字符串表示形式“
	3、其实SUN公司开发java语言的时候，建议所有的子类都去重写toString()方法。
	toString()方法应该是一个简洁、详实的、易阅读的。
	
*/

/*
public class API{
	public static void main(String[] args){
		Mytime t1 = new Mytime(1999,9,11);
		String s1 = t1.toString();
		
		//Mytime类重写toString()方法之前
		System.out.println(s1);	//Mytime@15db9742

		System.out.println(t1);	//自动调用：
	}
}

class Mytime{
	int year;
	int month;
	int day;

	public Mytime(){}

	public Mytime(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public String toString(){
		return this.year+"年"+this.month+"日"+this.day+"日";
	}
}
*/




//*********equals**********
/*
	关于Object类中的equals方法
		1、equals方法的源代码
			public boolean equals(Object obj){
				return (this == obj);
			}
		2、SUN公司设计equals方法的目的是什么？
			以后编程的过程当中，都是通过equals方法来判断两个对象是否相等
			equals方法是判断两个对象是否相等的。
		
		3、我们需要研究一下object类给的这个默认的equals方法够不够用！！！
*/

public class API{
	public static void main(String[] args){

		//判断两个基本数据类型的数据是否相等直接使用“==”就行。
		int a = 100;
		int b = 100;
		System.out.println(a == b);//true（相等）  false（不相等）

		Mytime t1 = new Mytime(2008,8,8);
		Mytime t2 = new Mytime(2008,8,8);

		System.out.println(t1 == t2);	
		//这里比较的两个地址，所以equals此时满足不了需求，那么我们要重写equals方法

		boolean flag = t1.equals(t2);
		System.out.println(flag);
		
		Mytime t3 = new Mytime(2008,8,9);
		System.out.println(t1.equals(t3));
	}
}

class Mytime{
	int year;
	int month;
	int day;

	public Mytime(){}

	public Mytime(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
/*
	public boolean equals(Object obj){
		int year1 = this.year;
		int month1 = this.month;
		int day1 = this.day;

		if(obj instanceof Mytime){
			Mytime t = (Mytime)obj;
			int year2 = t.year;
			int month2 = t.month;
			int day2 = t.day;
			if(year1 == year2 && month1 == month2 && day1 == day2){
				return true;
			}
		}
		//程序能够在还行到此处表示日期不相等
		return false;
	}
*/

	//比上面的equals执行效率高
/*	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(!(obj instanceof Mytime)){
			return false;
		}
		if(this == obj){
			return true;
		}
		Mytime t = (Mytime)obj;
		if(this.year == t.year && this.month == t.month && this.day == t.day){
			return true;
		}
		return false;
	}*/

	public boolean equals(Object obj){
		if(obj == null || !(obj instanceof Mytime)) return false;
		if(this == obj) return true;
		Mytime t = (Mytime)obj;
		return year == t.year && this.month == t.month && this.day == t.day
	}
}
/*
	结论：
		java中什么类型的数据可以使用“==”判断
			java中基本数据类型比较是否相等，使用==
		
		java中什么类型的数据需要使用equals判断
			java中所有的引用数据类型统一使用equals方法来判断是否相等
		这是规矩。
*/