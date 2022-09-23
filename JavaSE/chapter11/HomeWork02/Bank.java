/*
дһ����ΪAccount����ģ���˻���
��������Ժͷ���������ʾ��
������������ԣ��˻�id�����balance��������annualInterestRate��
�����ķ����������Ե�set��get������ȡ���withdraw()������deposit()

дһ�����Գ���
��1������һ��customer�����ֽ�Jane Smith������һ���˻�Ϊ1000�����Ϊ2000��������Ϊ1.23
��2����Jane Smith������
����100Ԫ����ȡ��960Ԫ����ȡ��2000��
��ӡJane Smith�Ļ�����Ϣ
��Ϣ������ʾ��
�ɹ����룺100
�ɹ�ȡ����960
���㣬ȡǮʧ��
*/
public class Bank{
	public static void main(String[] args){
		Account a = new Account("123415",2000,0.0225);
		Customer c = new Customer("Jane Smith", a);
		
		c.getAct().deposit(100);
		c.getAct().Rate();
	}
}

class Customer{
	private String name;
	private Account act;
	
	public Customer(){

	}

	public Customer(String name, Account act){
		this.name = name;
		this.act = act;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Account getAct(){
		return act;
	}
	public void setAct(Account act){
		this.act = act;
	}

}

class Account
{
	private String id;
	private double balance;
	private double annualInterestRate;
	
	public Account(){

	}

	public Account(String id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}

	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}

	public double annualInterestRate(){
		return annualInterestRate;
	}
	public void annualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

	public void withdraw(double money){
		if(this.balance<money)
		{
			System.out.println("���㣬ȡ��ʧ��");
		}
		else{
			this.balance -= money;

			System.out.println("ȡ��ɹ�ʣ�ࣺ" + balance);
		}
	}

	public void deposit(double money){
		this.balance += money;

		System.out.println("��ʣ��:"+ balance);
	}

	public void Rate(){
		double sort;
		sort = balance * annualInterestRate;
		balance += sort;
		System.out.println("������Ϊ��" + sort);
		System.out.println("���ƣ�" + balance);
	}
}