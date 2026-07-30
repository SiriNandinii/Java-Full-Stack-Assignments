package day3;

/**
* Author : sirin
* Date : Jul 10, 2026
* Time : 9:04:07 PM
* Email : sirinandini.a@gmail.com
*/


class Student {

    String name;
    int yearOfJoining;
    double salary;
    String address;

    void getInfo(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    void displayInfo() {
        System.out.printf("%-10s %-18d %-15s%n", name, yearOfJoining, address);
    }
}
