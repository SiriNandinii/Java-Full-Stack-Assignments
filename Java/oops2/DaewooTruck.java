package day4;

/**
* Author : sirin
* Date : Jul 17, 2026
* Time : 10:16:17 AM
* Email : sirinandini.a@gmail.com
*/

public class DaewooTruck implements Truck {

    private int axles;
    private int weight;

    public DaewooTruck(int axles, int weight) {
        this.axles = axles;
        this.weight = weight;
    }

    @Override
    public int getAxles() {
        return axles;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getMake() {
        return "Daewoo";
    }
}