package day41;

public class BankAccount {
	long balance;
	String accountHolder;
	int accountNumber;

	public void deposit(double amount) {
		System.out.println("depositing $ " + amount + " to " + accountNumber);
		balance += amount;
	}

	public void withdraw(double amount) {
		System.out.println("withdrawing $" + amount + " from" + accountNumber);
		balance -= amount;
		if (balance < 0) {
			balance -= 35;
		}
	}
	public void showBalance() {
		System.out.println("==================================");
		System.out.println("account holder: " + accountHolder);
		System.out.println("account number: " + accountNumber);
		System.out.println("balance: " + balance);
		System.out.println("==================================");
	}
	public void charge(double price, String item) {
		if (balance >= price) {
			System.out.println("Can buy " + item + " for $"+price+ " from "+accountNumber);
			balance -= price;
		} else {
			System.out.println("Not enough to buy " + item);
		}
	}
}
