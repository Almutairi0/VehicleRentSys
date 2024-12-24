package Classes;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String vehicleId;
    private boolean rentalStatus;
    private double rentalRate;
    public Vehicle(String make, String model, int year, String vehicleId, boolean rentalStatus, double rentalRate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vehicleId = vehicleId;
        this.rentalStatus = rentalStatus;
        this.rentalRate = rentalRate;
    }
    public void rent(String vehicleId){
        if(rentalStatus){
            rentalStatus = false;
            System.out.println("The vehicle has been rented.");
        } else {
            System.out.println("The vehicle is already rented and not available.");
        }
    }
    public void returnVehicle(String vehicleId){
            rentalStatus = false;

    }
    public double calculateRentalCost(){
        rentalRate = 125;
        return rentalRate;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public boolean isRentalStatus() {
        return rentalStatus;
    }
    public void setRentalStatus(boolean rentalStatus) {
        this.rentalStatus = rentalStatus;
    }
    public double getRentalRate() {
        return rentalRate;
    }
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

}
