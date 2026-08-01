package day1;
import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 10, 2026
 * Time : 8:47:54 PM
 * Email : sirinandini.a@gmail.com
 */


public class ITCity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the city name: ");
		String city = sc.nextLine();

		if (city.equalsIgnoreCase("Delhi") ||
				city.equalsIgnoreCase("Mumbai") ||
				city.equalsIgnoreCase("Kolkatta") ||
				city.equalsIgnoreCase("Bangalore") ||
				city.equalsIgnoreCase("Chennai") ||
				city.equalsIgnoreCase("Hyderabad")) {

			System.out.println(city + " is an IT City.");
		} else {
			System.out.println(city + " is Not an IT City.");
		}

		sc.close();
	}
}