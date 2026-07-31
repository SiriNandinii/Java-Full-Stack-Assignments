package day3;
/**
 * Author : sirin
 * Date : Jul 10, 2026
 * Time : 9:09:25 PM
 * Email : sirinandini.a@gmail.com
 */


public class BankAccount {

	private double balance;

	// Method to deposit money
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount Deposited: " + amount);
	}

	// Method to withdraw money
	void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Amount Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient Balance!");
		}
	}

	// Method to display balance
	void displayBalance() {
		System.out.println("Current Balance: " + balance);
	}


}