package Classes;

public class Motorcycle extends Vehicle {
    private double engineCapacity;
    public Motorcycle(String make, String model, int year, String vehicleId, boolean rentalStatus, double rentalRate, double engineCapacity) {
        super(make, model, year, vehicleId, rentalStatus, rentalRate);
        this.engineCapacity = engineCapacity;
    }
    public double calculateRentalCost() {
        double rentalCost = super.calculateRentalCost();
        rentalCost*= engineCapacity * 0.50;
        System.out.println(rentalCost);
        return rentalCost;
    }
}
