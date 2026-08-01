package day4;

/**
* Author : sirin
* Date : Jul 17, 2026
* Time : 10:16:59 AM
* Email : sirinandini.a@gmail.com
*/

public class TollBoothDemo{

    public static void main(String[] args) {

        TollBooth booth = new AlleghenyTollBooth();

        Truck ford = new FordTruck(5, 12500);
        Truck nissan = new NissanTruck(2, 5000);
        Truck daewoo = new DaewooTruck(6, 17000);

        booth.calculateToll(ford);
        booth.calculateToll(nissan);
        booth.calculateToll(daewoo);

        booth.displayData();

        booth.reset();
    }
}
