/*
	1��this���˿���ʹ����ʵ�������У����������ڹ��췽����
	2�����﷨��ͨ����ǰ�Ĺ��췽����ȥ������һ������Ĺ��췽��������ʹ��һ���﷨��ʽ��
		this(ʵ�ʲ����б�);
			ͨ��һ�����췽��1ȥ���ù��췽��2�������������븴�á�
			����Ҫע����ǣ������췽��1���͡����췽��2��������ͬһ���൱�С�
	3��this();����﷨������ʲô��
		���븴��
	
	4������Ӳ����
		����this()�ĵ���ֻ�ܳ����ڹ��췽���ĵ�һ��
		
*/
public class ThisTest04{
	public static void main(String[] args){
		Date d1 = new Date();
		d1.detail();

		Date d2 = new Date(2008,8,8);
		d2.detail();
	}
}

class Date{
	private int year;
	private int month;
	private int day;

	//���췽���޲�
	public Date(){
		// ����: ��this�ĵ��ñ����ǹ������еĵ�һ�����
		System.out.println(11);
		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		*/

		this(1922,1,12);
	}
	
	//���췽���в�
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//�ṩһ�����Դ�ӡ�ķ���
	public void detail(){
		System.out.println(year+"��"+month+"��"+day+"��");
	}
	
	// year��set and get
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}

	// month��set and get
	public void setMonth(int month){
		this.month = month;
	}
	public int getMonth(){
		return month;
	}

	// day��set and get
	public void setDay(int day){
		this.day = day;
	}
	public int getDay(){
		return day;
	}

}


1��this
	1.1��this��һ���ؽ��֣���һ�����ã������ڴ��ַָ������
	1.2��this����ʹ����ʵ�������У�Ҳ����ʹ���ڹ��췽���С�
	1.3��this������ʵ����������ʵ������ǵ�ǰ����
	1.4��this����ʹ���ھ�̬������
	1.5��this. �󲿷�����¿���ʡ�ԣ������������־ֲ�������ʵ��������ʱ����ʡ��
	1.6��this() �����﷨ֻ�ܳ����ڹ��췽����һ�У���ʾ��ǰ���췽�����ñ���������
	���췽����Ŀ���Ǵ��븴�á�