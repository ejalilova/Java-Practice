package day41;

public class CapitalOne {
public static void main(String[] args) {
	BankAccount account = new BankAccount();
	account.accountHolder = "Enya";
	account.accountNumber = 7453;
	account.deposit(75000000L);
	account.withdraw(5000);
	account.showBalance();
	account.charge(200, "dress");
	account.showBalance();
}
}
