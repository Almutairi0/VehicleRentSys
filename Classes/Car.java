package Classes;

public class Car extends Vehicle {
    private int numOfSeats;
    private int numOfDoors;
    public Car(String make, String model, int year, String vehicleId, boolean rentalStatus, double rentalRate, int numOfSeats, int numOfDoors) {
        super(make, model, year, vehicleId, rentalStatus, rentalRate);
        this.numOfSeats = numOfSeats;
        this.numOfDoors = numOfDoors;
    }
    @Override
    public double calculateRentalCost() {
        double cost = super.calculateRentalCost();
        cost*=numOfSeats;
        System.out.println(cost);
        return cost;
    }
    public int getNumOfSeats() {
        return numOfSeats;
    }
    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
    public int getNumOfDoors() {
        return numOfDoors;
    }
    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

}
