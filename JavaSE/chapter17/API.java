/*
protected object clone()	//��������¡�ġ�
int hashCode()	//��ȡ�����ϣֵ��һ������
boolean equals(Object obj)	//�ж����������Ƿ����
String toString()	//������ת�����ַ�����ʽ
protected void finalize()	//����������������õķ���

*/


//*********toString**********
/*
����object���ܵ�toString()����
	1��Դ���볤ʲô����
		public String toString(){
			return this.getClass().getName()+"@"+Integer.toHexString(hashCode());
		}
		Դ������toString()������Ĭ��ʵ���ǣ�
			����@���ߵ��ڴ��ַת��Ϊʮ������

	2��SUN���toString()������Ŀ����ʲô��
		toString()������������ʲô��
			toString()���������Ŀ���ǣ�ͨ����������������Խ�һ����java����ת���ɡ��ַ�����ʾ��ʽ��
	3����ʵSUN��˾����java���Ե�ʱ�򣬽������е����඼ȥ��дtoString()������
	toString()����Ӧ����һ����ࡢ��ʵ�ġ����Ķ��ġ�
	
*/

/*
public class API{
	public static void main(String[] args){
		Mytime t1 = new Mytime(1999,9,11);
		String s1 = t1.toString();
		
		//Mytime����дtoString()����֮ǰ
		System.out.println(s1);	//Mytime@15db9742

		System.out.println(t1);	//�Զ����ã�
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
		return this.year+"��"+this.month+"��"+this.day+"��";
	}
}
*/




//*********equals**********
/*
	����Object���е�equals����
		1��equals������Դ����
			public boolean equals(Object obj){
				return (this == obj);
			}
		2��SUN��˾���equals������Ŀ����ʲô��
			�Ժ��̵Ĺ��̵��У�����ͨ��equals�������ж����������Ƿ����
			equals�������ж����������Ƿ���ȵġ�
		
		3��������Ҫ�о�һ��object��������Ĭ�ϵ�equals�����������ã�����
*/

public class API{
	public static void main(String[] args){

		//�ж����������������͵������Ƿ����ֱ��ʹ�á�==�����С�
		int a = 100;
		int b = 100;
		System.out.println(a == b);//true����ȣ�  false������ȣ�

		Mytime t1 = new Mytime(2008,8,8);
		Mytime t2 = new Mytime(2008,8,8);

		System.out.println(t1 == t2);	
		//����Ƚϵ�������ַ������equals��ʱ���㲻��������ô����Ҫ��дequals����

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
		//�����ܹ��ڻ��е��˴���ʾ���ڲ����
		return false;
	}
*/

	//�������equalsִ��Ч�ʸ�
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
	���ۣ�
		java��ʲô���͵����ݿ���ʹ�á�==���ж�
			java�л����������ͱȽ��Ƿ���ȣ�ʹ��==
		
		java��ʲô���͵�������Ҫʹ��equals�ж�
			java�����е�������������ͳһʹ��equals�������ж��Ƿ����
		���ǹ�ء�
*/