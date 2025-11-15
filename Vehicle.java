// package vehicleFleetManager;

public class Vehicle {
    // initializations
    private String name = "yogesh";
    public static int vehicleCounter = 0;
    private String brand;
    public final String VIN;

    // constructor
    public Vehicle(String brand, String VIN) {
        this.brand = brand;
        this.VIN = VIN;
        vehicleCounter++;
    }

    // methods
    public void startEngine() {
        System.out.println("Vehicle engine starts!");

    }

    // getter
    public String getBrand() {
        return brand;
    }
}
