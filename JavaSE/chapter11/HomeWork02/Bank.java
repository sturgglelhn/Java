/*
写一个名为Account的类模拟账户。
该类的属性和方法如下所示。
该类包括的属性：账户id，余额balance，年利率annualInterestRate：
包含的方法：各属性的set和get方法。取款方法withdraw()，存款方法deposit()

写一个测试程序：
（1）创建一个customer，名字叫Jane Smith，他有一个账户为1000，余额为2000，年利率为1.23
（2）对Jane Smith操作：
存入100元，在取出960元，在取出2000。
打印Jane Smith的基本信息
信息如下显示：
成功存入：100
成功取出：960
余额不足，取钱失败
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
			System.out.println("余额不足，取款失败");
		}
		else{
			this.balance -= money;

			System.out.println("取款成功剩余：" + balance);
		}
	}

	public void deposit(double money){
		this.balance += money;

		System.out.println("余额还剩余:"+ balance);
	}

	public void Rate(){
		double sort;
		sort = balance * annualInterestRate;
		balance += sort;
		System.out.println("年利率为：" + sort);
		System.out.println("余额共计：" + balance);
	}
}