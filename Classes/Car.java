package Classes;

public class Car extends Vehicle {
    private String numOfSeats;
    private String numOfDoors;
    public Car(String make, String model, int year, String vehicleId, boolean rentalStatus, double rentalRate, String numOfSeats, String numOfDoors) {
        super(make, model, year, vehicleId, rentalStatus, rentalRate);
        this.numOfSeats = numOfSeats;
        this.numOfDoors = numOfDoors;

    }

}
