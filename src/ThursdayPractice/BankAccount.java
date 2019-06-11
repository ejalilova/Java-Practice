package ThursdayPractice;

public class BankAccount {
/*
 * Write a class, BankAccount, containing:
instance variables: name (String), balance (double). 
a constructor accepting a String corresponding to the name of the account holder.
a method, getBalance, that returns a double corresponding to the account balance.
a method withdraw that accepts a double, and deducts the amount from the account balance.


 */
	private String name;
	private double balance;
	
	public BankAccount(String name) {
		this.name = name;
	}
	
	//public void setBalance(double balance) {
	//	this.balance = balance;
	//}
	public void deposit(double balance) {
		balance+= balance;
	}
	public double getBalance() {
		return balance;
	}
	public void withdraw(double amount) {
		balance-= amount;
	}
	public String toString() {
		return "BankAccount name " + name;
	}
}
