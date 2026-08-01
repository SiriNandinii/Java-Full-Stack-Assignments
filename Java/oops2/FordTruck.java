package day4;

/**
* Author : sirin
* Date : Jul 17, 2026
* Time : 10:15:47 AM
* Email : sirinandini.a@gmail.com
*/

public class FordTruck implements Truck {

    private int axles;
    private int weight;

    public FordTruck(int axles, int weight) {
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
        return "Ford";
    }
}