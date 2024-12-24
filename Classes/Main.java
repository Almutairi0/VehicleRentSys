package Classes;

public class Main {
    public static void main(String[] args) {
        Car Supra = new Car("Toyota","Supra",2000,"S151Q16161sS16",true,0,4,4);
        Supra.calculateRentalCost();
        //Supra.rent("S151Q16161sS16");
        //there is an error up there
        //WITH THE VEHICEL ID AND RENT
        Motorcycle S1 = new Motorcycle("S","Race",2023,"S!Safafaifjh2892",true,0,2.5);
        S1.calculateRentalCost();
    }
}
