package bank.entity;

public class Account {
	private int id;
	private String name;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account() {}
	public Account(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public double addAmount(double amt)
	{
		this.balance +=amt;
		return balance;	
	}
	public double deductAmount(double amt)
	{
		this.balance -=amt;
		return balance;	
	}
	public int transferAmount(Account a, double amt)
	{
		if(amt<=this.getBalance())
		this.deductAmount(amt);
		else
		return -1;
		a.addAmount(amt);
		return 1;
	}

}