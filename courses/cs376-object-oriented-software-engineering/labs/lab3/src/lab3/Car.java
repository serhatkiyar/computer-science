package lab3;

public class Car extends Vehicle{
    public Car(String brand, double fuelLevel, double maxSpeed, double accelerationRate, double consumptionRate) {
        super(brand, fuelLevel, maxSpeed, accelerationRate, consumptionRate);
    }

    public void openWindows() {
        System.out.println("Camlar Açıldı!");
    }
}
