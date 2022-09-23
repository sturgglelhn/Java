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

public class HomeWork02{
	public static void main(String[] args){
		//先创建一个账户对象
		Account a = new Account("1000",2000,1.23);

		//创建客户对象
		//传给构造方法a是什么意思？让Customer对象和Account对象产生关系
		//表示这个账户是Jane Smith的
		Customer c = new Customer("Jane Smith", a);
		
		//存入100
		c.getAct().deposit(100);

		//取出960
		c.getAct().withdraw(960);

		//取出2000
		c.getAct().withdraw(2000);
	}
}

class Customer{
	private String name;
	private Account act;

	//构造方法无参
	public Customer(){

	}

	//构造方法有参
	public Customer(String name, Account act){
		this.name = name;
		this.act = act;
	}

	//name的get和set
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	//act的get和set
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

	//构造方法无参
	public Account(){

	}
	//构造方法有参
	public Account(String id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	// id的get和set
	public String getId(){
		return id;
	}
	public void setId(){
		this.id = id;
	}

	// balance的get和set
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}

	// annualInterestRate的get和set
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

	//存款方法
	public void deposit(double money){

		//this.balance += money;
		this.setBalance(this.getBalance() + money);//余额(balance)中加上存入(money)金额

		System.out.println("成功存入：" + money);
	}

	//取款方法
	public void withdraw(double money){
		if(money > this.getBalance()){//如需取的钱（money）和大于余额中的钱（balance）时，取钱失败
			System.out.println("余额不足，取钱失败");
			return;
		}
		this.setBalance(this.getBalance() - money);//从余额（balance）中减去需要取钱（money）的金额
		System.out.println("成功取出：" + money);
	}

}