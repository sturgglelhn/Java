public class OverrideTest04{
	public static void main(String[] args){
		MyDate t1 = new MyDate();

		//System.out.println(t1.toString());//MyDate@15db9742

		System.out.println(t1.toString());
		System.out.println(t1);
		
		MyDate t2 = new MyDate(2008,8,8);
		System.out.println(t2);

		Student s1 = new Student(111,"����");
		System.out.println(s1);
		System.out.println(s1.toString());
	}
}

class MyDate{
	private int year;
	private int month;
	private int day;

	public MyDate(){
		this(1970,1,1);
	}
	public MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}

	public int getMonth(){
		return month;
	}

	public void setMonth(int month){
		this.month = month;
	}

	public int getDay(){
		return day;
	}

	public void setDay(int day){
		this.day = day;
	}


	public String toString(){
		return year+"��"+month+"��"+day+"��";
	}
}

class Student{
	int no;
	String name;

	public Student(int no, String name){
		this.no = no;
		this.name = name;
	}

	public String toString(){
		return "ѧ�ţ�" + no + ",������" + name;
	}

}


���������ܽ᣺
	1��ʲôʱ����ʹ�÷������ǣ�
		�����еķ����޷����������ҵ�����������б�Ҫ�Լ̳й����ĵķ������и���

	2��ʲô�����������ʱ�򹹳ɷ������ǣ�
		��һ���м̳й�ϵ��������
		�ڶ���������ͬ������������ֵ���͡���ʽ�����б�
		����������Ȩ�޲��ܸ��͡�
		���ģ��׳��쳣���ܸ��ࡣ

	3������Object����toString()�����ĸ��ǣ�
		toString()�������ڵ����þ��ǣ���java����ת�����ַ�����ʽ��
		�������java��toString()����������Ҫ���ǵġ���ΪObject�����ṩ��toString()
		�����������һ��java������ڴ��ַ��

		����toString()����������ô���и��ǣ�
			��ʽ�����Լ����壬����������ġ�������ĿҪ��ģ�

	4���������غͷ���������ʲô����
		�������ط�����ͬһ���൱��

		���������Ƿ����ھ��м̳й�ϵ�ĸ�����֮�䡣

		����������һ�����У���������ͬ�������б�ͬ��

		���������Ǿ��м̳й�ϵ�ĸ����࣬������д֮��ķ��������֮ǰ�ķ���һ�£�
			������һ�¡������б�һ�¡�����ֵ����һ�¡�