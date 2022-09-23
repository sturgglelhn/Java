

public class ExtendsTest02
{
	public static void main(String[] args){


		Account act = new Account();
		act.setActno("11111");
		act.setBalance(10000);
		System.out.println(act.getActno()+",余额"+act.getBalance());


		CreditAccount ca = new CreditAccount();
		ca.setActno("22222");
		ca.setBalance(-10000);
		ca.setCredit(0.99);

		System.out.println(ca.getActno()+",余额"+ca.getBalance()+",信誉度"+ca.getCredit());
	}
}

class Account{
	private String actno;
	private double balance;
	public Account(){

	}
	public Account(String actno, double balance){
		this.actno = actno;
		this.balance = balance;
	}

	public String getActno(){
		return actno;
	}
	public void setActno(String actno){
		this.actno = actno;
	}

	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}

}

class CreditAccount extends Account{//子类
	
	private double credit;
	
	public CreditAccount(){

	}
	
	public double getCredit(){
		return credit;
	}
	public void setCredit(double credit){
		this.credit = credit;
	}

}