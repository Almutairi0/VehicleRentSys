package Classes;

public class Motorcycle extends Vehicle {
    private String engineCapacity;
    public Motorcycle(String make, String model, int year, String vehicleId, boolean rentalStatus, double rentalRate, String engineCapacity) {
        super(make, model, year, vehicleId, rentalStatus, rentalRate);
        this.engineCapacity = engineCapacity;
    }
}
