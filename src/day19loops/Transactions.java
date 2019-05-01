package day19loops;

import java.util.Scanner;

public class Transactions {
	public static void main(String[] args) {
		// balance
		// assign value to the balance using scanner
		// what is transaction amount?
		// transaction
		// keep doing transactions until running out of balance
		// 100 30 40 40 negative
		// exit from the loop - insufficient funds, your balance is -10

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance?");

		double balance = scan.nextDouble();
		int count = 0;

		while (balance > 0) {
			count++; // increase transaction by 1
			System.out.println("Please enter your transaction #" + count + " amount:");
			double transactionAmaount = scan.nextDouble();
			if (transactionAmaount > balance) {
				System.out.println("Warning! Balance is zero or negative");
			}
			balance = balance - transactionAmaount;
			System.out.println("Current balance: " + balance);

			

		}
		System.out.println("Insufficient balance: " + balance);
		System.out.println("Transaction total count: " + count);

	}

}
