package day4;

/**
* Author : sirin
* Date : Jul 17, 2026
* Time : 10:16:37 AM
* Email : sirinandini.a@gmail.com
*/

public class AlleghenyTollBooth implements TollBooth {

    private int totalReceipts;
    private int totalTrucks;

    @Override
    public void calculateToll(Truck truck) {

        int toll = (truck.getAxles() * 5) + ((truck.getWeight() / 500) * 10);

        System.out.println("Arrival of " + truck.getMake() + " Truck");
        System.out.println("Truck arrival - Axles: " + truck.getAxles()
                + " Total weight: " + truck.getWeight()
                + " Toll due: $" + toll);

        totalReceipts += toll;
        totalTrucks++;
    }

    @Override
    public void displayData() {
        System.out.println("*** Collecting receipts ***");
        System.out.println("Totals since the last collection - Receipts: $"
                + totalReceipts + " Trucks: " + totalTrucks);
    }

    @Override
    public void reset() {
        totalReceipts = 0;
        totalTrucks = 0;

        System.out.println("***** Reset Receipts **********");
        System.out.println("Totals since the last collection - Receipts: $"
                + totalReceipts + " Trucks: " + totalTrucks);
    }
}