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

public class HomeWork02{
	public static void main(String[] args){
		//�ȴ���һ���˻�����
		Account a = new Account("1000",2000,1.23);

		//�����ͻ�����
		//�������췽��a��ʲô��˼����Customer�����Account���������ϵ
		//��ʾ����˻���Jane Smith��
		Customer c = new Customer("Jane Smith", a);
		
		//����100
		c.getAct().deposit(100);

		//ȡ��960
		c.getAct().withdraw(960);

		//ȡ��2000
		c.getAct().withdraw(2000);
	}
}

class Customer{
	private String name;
	private Account act;

	//���췽���޲�
	public Customer(){

	}

	//���췽���в�
	public Customer(String name, Account act){
		this.name = name;
		this.act = act;
	}

	//name��get��set
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	//act��get��set
	public Account getAct(){
		return act;
	}
	public void setAct(Account act){
		this.act = act;
	}

}


class Account{
	private String id;
	private double balance;
	private double annualInterestRate;

	//���췽���޲�
	public Account(){

	}
	//���췽���в�
	public Account(String id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	// id��get��set
	public String getId(){
		return id;
	}
	public void setId(){
		this.id = id;
	}

	// balance��get��set
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}

	// annualInterestRate��get��set
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

	//����
	public void deposit(double money){

		//this.balance += money;
		this.setBalance(this.getBalance() + money);//���(balance)�м��ϴ���(money)���

		System.out.println("�ɹ����룺" + money);
	}

	//ȡ���
	public void withdraw(double money){
		if(money > this.getBalance()){//����ȡ��Ǯ��money���ʹ�������е�Ǯ��balance��ʱ��ȡǮʧ��
			System.out.println("���㣬ȡǮʧ��");
			return;
		}
		this.setBalance(this.getBalance() - money);//����balance���м�ȥ��ҪȡǮ��money���Ľ��
		System.out.println("�ɹ�ȡ����" + money);
	}

}