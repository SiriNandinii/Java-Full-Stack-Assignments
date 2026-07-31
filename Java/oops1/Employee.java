package day3;
import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 10, 2026
 * Time : 9:00:42 PM
 * Email : sirinandini.a@gmail.com
 */

public class Employee {

	double salary;
	int hours;

	// Method to get employee details
	void getInfo(double salary, int hours) {
		this.salary = salary;
		this.hours = hours;
	}

	// Adds $10 if salary is less than $500
	void addSal() {
		if (salary < 500) {
			salary = salary + 10;
		}
	}

	// Adds $5 if working hours are more than 6
	void addWork() {
		if (hours > 6) {
			salary = salary + 5;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();

		System.out.print("Enter working hours per day: ");
		int hours = sc.nextInt();

		emp.getInfo(salary, hours);
		emp.addSal();
		emp.addWork();

		System.out.println("Final Salary = $" + emp.salary);

		sc.close();
	}
}
