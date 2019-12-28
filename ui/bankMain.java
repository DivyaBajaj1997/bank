package bank.ui;
import bank.entity.*;

public class bankMain {
	public static void main(String[] args) {
		Account[] acc = new Account[3];
		acc[0] = new Account(1,"Divya");
		acc[1] = new Account(2,"Riya");
		acc[2] = new Account(3,"Ananya");
		acc[0].addAmount(230.56);
		acc[1].addAmount(890.56);
		acc[2].addAmount(930.56);
		bankMain b =  new bankMain();
		b.printAll(acc);
		if(acc[1].transferAmount(acc[0], 500)==1)
		{
			b.print(acc,1,0);
		}
		else
		{
			System.out.println("Your balance is less than the tranferring amount");
		}		
	}
	
	public void print(Account[] acc, int a, int b)
	{
		System.out.println("The balance left in Account A = " + acc[a].getBalance());
		System.out.println("The balance left in Account B = " + acc[b].getBalance());
	}
	public void printAll(Account[] acc)
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.println("[Id : " + acc[i].getId() + "] [Name : " + acc[i].getName() + "] [Balance : " + acc[i].getBalance() + "]");
		}		
	}
}
