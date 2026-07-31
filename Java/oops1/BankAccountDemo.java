package day3;

import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 10, 2026
 * Time : 9:10:44 PM
 * Email : sirinandini.a@gmail.com
 */

public class BankAccountDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BankAccount account = new BankAccount();

		System.out.print("Enter amount to deposit: ");
		double depositAmount = sc.nextDouble();
		account.deposit(depositAmount);

		account.displayBalance();

		System.out.print("Enter amount to withdraw: ");
		double withdrawAmount = sc.nextDouble();
		account.withdraw(withdrawAmount);

		account.displayBalance();

		sc.close();
	}

}
